package com.wx.test;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wx.service.UserService;

public class UserServiceTest extends BaseJunit4Test {

	@Resource
	private UserService userService;

	@Test
	public void select() {
		userService.select();
	}
	
	//传统测试方式
	// private ApplicationContext context;
	//
	// @Before
	// public void loadResource() {
	// context = new ClassPathXmlApplicationContext("applicationContext.xml");
	// }
	//
	// @Test
	// public void select() {
	// UserService userService = (UserService) context.getBean("userService");
	// userService.select();
	// }

}
