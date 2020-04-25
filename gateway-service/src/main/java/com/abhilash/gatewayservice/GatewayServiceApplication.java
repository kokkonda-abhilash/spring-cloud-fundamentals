package com.abhilash.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abhilash.gatewayservice.filters.HeaderFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@Configuration
public class GatewayServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
	
	@Bean
	public HeaderFilter headerFilter() {
		return new HeaderFilter();
	}
}
