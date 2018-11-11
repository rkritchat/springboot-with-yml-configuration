package com.example.springbootwithyml.controller;


import com.example.springbootwithyml.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ApplicationConfig applicationConfig;

    @GetMapping
    public String test(){
        return "value is : " + applicationConfig.getsetTestTest();
    }
}
