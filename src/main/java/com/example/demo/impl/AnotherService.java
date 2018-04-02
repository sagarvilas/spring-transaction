package com.example.demo.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.api.MyTransactionApi;
import com.example.demo.service.HiMessageService;

abstract public class AnotherService implements MyTransactionApi {
	
	abstract void method();

	@Autowired
	HiMessageService message;

	@Override
	public String doSomething() {

		return message.greetings();
	}

}
