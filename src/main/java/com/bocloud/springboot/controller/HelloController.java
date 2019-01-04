package com.bocloud.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "first")
public class HelloController {

    @RequestMapping(value = "/hello")
    public String index(){
        return "Hello World!";
    }
}
