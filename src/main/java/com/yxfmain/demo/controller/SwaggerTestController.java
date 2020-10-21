package com.yxfmain.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * swagger测试
 *
 * @author Yxf
 */
@RestController
@Api(tags = "swagger测试接口大屏")
@RequestMapping("learning/swagger")
public class SwaggerTestController {

    @PostMapping("test/hello")
    @ApiOperation(value = "接口功能介绍",notes = "提示信息", httpMethod = "post")
    public @ApiParam
    String index(@RequestParam @ApiParam String name){
        return "hello"+name;
    }
}
