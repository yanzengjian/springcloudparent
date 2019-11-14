package com.aaa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("2081")
    private String port;
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    @Value("${mybatis.type-aliases-package}")
    private String mybatisTypePackages;
    @RequestMapping("/test")
    public String test(){
        return port+"--"+driverClassName+"--"+mybatisTypePackages;
    }

}
