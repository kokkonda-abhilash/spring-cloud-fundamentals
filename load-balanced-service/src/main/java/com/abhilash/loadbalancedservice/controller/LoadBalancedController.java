package com.abhilash.loadbalancedservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadBalancedController {
	
	@Value("${instance.name}")
	private String instance;

	@GetMapping
	public String helloFromInstance() {
		return "Hello from load balanced instance";
	}
}
