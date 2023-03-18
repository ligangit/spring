package com.ligangit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserService {

	private OrderService orderService;


	public UserService(OrderService orderService,OrderService orderService1) {
		this.orderService = orderService;
	}

	@Autowired
	public UserService(OrderService orderService) {
		this.orderService = orderService;
	}

	public void test() {
		System.out.println(orderService);

	}
}
