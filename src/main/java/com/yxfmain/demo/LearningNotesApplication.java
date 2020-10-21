package com.yxfmain.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yxf
 */
@SpringBootApplication
@MapperScan("com.yxfmain.demo.dao.mapper")
//@ComponentScan("com.yxfmain.demo.config")
@EnableSwagger2  //不加该注解不生效
public class LearningNotesApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearningNotesApplication.class, args);
    }

}
