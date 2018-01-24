package com.wx.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wx.dao.UserDao;
import com.wx.entity.User;
import com.wx.entity.UserExample;
import com.wx.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	public void select() {
		UserExample example = new UserExample();
		
		example.createCriteria().andUsernameLike("%"+"A"+"%");		
		List<User> list = userDao.select(example);
		for (User user : list) {
			System.out.println(user.toString());
		}
	}

}
