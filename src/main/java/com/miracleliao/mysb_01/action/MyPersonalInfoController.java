package com.miracleliao.mysb_01.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MyPersonalInfoController {
    
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;
    
    @RequestMapping(value = "/getMyInfo")
    public String getMyInfo(){
        return name +" : "+ age;
    }
}
