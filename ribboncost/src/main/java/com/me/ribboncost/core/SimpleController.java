package com.me.ribboncost.core;

import com.me.ribboncost.core.service.SimpleService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wei.zhan@hand-china.com
 * @version 1.0
 * @name SimpleController
 * @description
 * @date 2017/7/21
 */
@RestController
public class SimpleController {
    @Autowired
    private SimpleService simpleService;

    @RequestMapping("hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String  hi(){
        return simpleService.hi();
    }
    public String hiError(){
        return "error";
    }
}
