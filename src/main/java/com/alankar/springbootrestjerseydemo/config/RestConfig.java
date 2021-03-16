package com.alankar.springbootrestjerseydemo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.alankar.springbootrestjerseydemo.resource.EmployeeResource;

@Configuration
public class RestConfig extends ResourceConfig{

	public RestConfig(Class<?>... classes) {
		register(EmployeeResource.class);
	}
}
