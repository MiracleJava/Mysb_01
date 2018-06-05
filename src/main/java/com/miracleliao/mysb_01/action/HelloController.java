package com.miracleliao.mysb_01.action;

import com.miracleliao.mysb_01.Entity.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @Autowired
    ConfigBean configBean;
    
    @RequestMapping("/hello")
    public String index(){
        return "Greetings from Spring Boot!!!";
    }
    
    @RequestMapping(value = "/randomMy")
    public String randowMy(){
        return configBean.getGreeting()+"-"+configBean.getName()+"-"+configBean.getUuid()+"-"+configBean.getMax();
    }
}
