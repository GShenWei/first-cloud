package com.me.feigncost.core;

import com.me.feigncost.core.service.SimpleService;
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
    public String  hi(){
        return simpleService.hi();
    }
}
