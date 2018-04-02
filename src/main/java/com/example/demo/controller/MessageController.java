package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.impl.MyTransactionImpl;

@RestController
public class MessageController {

	@Autowired
	MyTransactionImpl messageService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return messageService.doSomething();
	}

}
