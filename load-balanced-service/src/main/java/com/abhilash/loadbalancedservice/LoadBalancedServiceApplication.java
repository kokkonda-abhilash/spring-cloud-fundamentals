package com.abhilash.loadbalancedservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class LoadBalancedServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(LoadBalancedServiceApplication.class, args);
	}
}
