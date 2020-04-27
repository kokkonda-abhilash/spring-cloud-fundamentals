package com.abhilash.configuration;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "load-balanced-service")
public class RibbonLoadBalanceConfiguration {
}
