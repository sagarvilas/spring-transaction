package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.controller.MessageInterceptor;


public class Configurer implements WebMvcConfigurer {

	@Bean
	MessageInterceptor interceptor() {
		return new MessageInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor());
	}

}
