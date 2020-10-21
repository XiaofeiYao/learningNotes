package com.yxfmain.demo.config;

import com.google.common.base.Predicates;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * swagger配置类
 *
 * @author Yxf
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(name = "swagger.enable",havingValue = "true")
public class SwaggerConfig {
    /**
     *  创建一个DocketBean
     * @author : Yxf
     * @return : springfox.documentation.spring.web.plugins.Docket
    */
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //选择哪些路径和api会生成document
                .select()
                //对所有api进行监控
                .apis(RequestHandlerSelectors.any())
//                //要扫描的包路径,即要为哪些文件创建swagger文档
//                .apis(RequestHandlerSelectors.basePackage("com.yxfmain.demo.controller"))
                //对根下所有路径都监控
                .paths(PathSelectors.regex("/.*"))
                //错误路径不监控
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();

    }

    /**
     * 构建api文档的详细信息函数,注意这里注解引用的是哪一个
     *
    */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("spring boot整合swagger页面标题")
                .termsOfServiceUrl("No terms of service")
                .contact(new Contact("Yxf","","yaoxiaofei@dualpi.com"))
                .version("版本号 1.0")
                .description("API接口文档")
                .build();
    }

//    private List<Parameter> setHeaderToken(){
//        ParameterBuilder token = new ParameterBuilder();
//        List<Parameter> parameterList=new ArrayList<>();
//        token.name("yxf")
//                .description("token")
//                .modelRef(new ModelRef("string"))
//                .parameterType("header")
//                .required(false)
//                .build();
//        parameterList.add(token.build());
//        return parameterList;
//    }
}
