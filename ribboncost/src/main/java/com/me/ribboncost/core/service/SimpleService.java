package com.me.ribboncost.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wei.zhan@hand-china.com
 * @version 1.0
 * @name sipleService
 * @description
 * @date 2017/7/21
 */
@Service
public class SimpleService {
    private final RestTemplate restTemplate;

    @Autowired
    public SimpleService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String hi(){
        String forObject = restTemplate.
                getForObject("http://SERVICE-SIMPLE/hi", String.class);
        return forObject;
    }
    public String hiError(){
        return "service error";
    }
}
