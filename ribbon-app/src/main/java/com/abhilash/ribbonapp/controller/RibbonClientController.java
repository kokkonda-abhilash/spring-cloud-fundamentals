package com.abhilash.ribbonapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class RibbonClientController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String getServiceDetails() {
		return this.restTemplate.getForEntity("http://load-balanced-service", String.class).getBody();
	}
}
