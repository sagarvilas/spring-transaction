package com.example.demo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.api.MyTransactionApi;
import com.example.demo.service.HiMessageService;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
@Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MyTransactionImpl implements MyTransactionApi {
	
	@Autowired
	HiMessageService message;

	@Override
	public String doSomething() {
		
		return message.greetings();
	}

}
