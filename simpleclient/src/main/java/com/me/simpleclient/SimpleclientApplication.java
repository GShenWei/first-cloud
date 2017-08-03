package com.me.simpleclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SimpleclientApplication {
	@Value("${server.port}")
	private String port;
	@Value("${spring.application.name}")
	private String springApplicationName;
	@Value("${nihao}")
	private String nihao;
	public static void main(String[] args) {
		SpringApplication.run(SimpleclientApplication.class, args);
	}
	@RequestMapping("hi")
	public String hi(){
		return springApplicationName+":"+port+"--你好，我是一个简单的服务"+"\n"+nihao;
	}
}
