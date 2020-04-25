package com.abhilash.applicationservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@Value("${service.instance.name}")
	private String instanceName;
	
	@RequestMapping("instance-number")
	public String helloFromService() {
		return "Hello! I'm from " + instanceName;
	}
	
	@RequestMapping
	public String helloForGatwayService(@RequestHeader("x-location") final String loaction) {
		return "Hello! I'm for gateway service and I've got a request from loaction: " + loaction;
	}
}
