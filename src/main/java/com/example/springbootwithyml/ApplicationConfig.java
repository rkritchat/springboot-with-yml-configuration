package com.example.springbootwithyml;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
@Component
public class ApplicationConfig {


    private String test;

    public String getsetTestTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
