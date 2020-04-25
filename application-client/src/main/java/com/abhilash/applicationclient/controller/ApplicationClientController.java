package com.abhilash.applicationclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.EurekaClient;

@RestController
public class ApplicationClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private EurekaClient discoveryClient;


	@RequestMapping("/say-hello")
	public String sayHello() {
		String url = this.discoveryClient.getNextServerFromEureka("service", false).getHomePageUrl();
		ResponseEntity<String> responseEntity = this.restTemplate.exchange(url, HttpMethod.GET, null, String.class);
		return responseEntity.getBody();
	}
}
