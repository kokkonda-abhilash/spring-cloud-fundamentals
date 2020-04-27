package com.abhilash.ribbonapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.abhilash.configuration.RibbonLoadBalanceConfiguration;

@SpringBootApplication
/* @EnableDiscoveryClient */
@RibbonClient(name = "load-balanced-service"/* , configuration = RibbonLoadBalanceConfiguration.class */)
public class RibbonAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(RibbonAppApplication.class, args);
	}
}
