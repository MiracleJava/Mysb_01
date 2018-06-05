package com.miracleliao.mysb_01.action;

import com.miracleliao.mysb_01.Entity.ConfigBean;
import com.miracleliao.mysb_01.Entity.Myself;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class MyController {
    
    @Autowired
    ConfigBean configBean;
    
    @Autowired
    Myself myself;
    
    @RequestMapping("/me")
    public String yeah(){
        return configBean.getGreeting()+"-"+configBean.getName()+"-"+configBean.getUuid()+"-"+configBean.getMax();
    }
    
    @RequestMapping("/myselfInfo")
    public String myselfInfo(){
        return myself.getName() + ":" + myself.getAge();
    }
    
}
