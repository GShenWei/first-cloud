package com.me.feigncost.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @author wei.zhan@hand-china.com
 * @version 1.0
 * @name sipleService
 * @description
 * @date 2017/7/21
 */
@FeignClient(value = "service-simple")
public interface SimpleService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hi();
}
