package com.abhilash.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhilash.configclient.Configuration;

@RestController
public class ConfigClientController {

	@Value("${some.other.property}")
	private String someOtherProperty;
	@Autowired
	private Configuration properties;
	
	@RequestMapping
	public String fetchAppandGlobalProperties() {
		StringBuilder builder = new StringBuilder();
		builder.append(properties.getProperty()).append(" || ").append(someOtherProperty);
		return builder.toString();
	}
}
