package com.multi.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource( value = {"classpath:service.properties", "classpath:service-${spring.profiles.active}.properties" }, ignoreResourceNotFound = true )
public class ServiceConfig {
}
