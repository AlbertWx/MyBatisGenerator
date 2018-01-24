package com.wx.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wx.dao.UserDao;
import com.wx.entity.User;
import com.wx.entity.UserExample;
import com.wx.mapper.UserMapper;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

	@Resource
	private UserMapper userMapper;

	public List<User> select(UserExample example) {
		return userMapper.selectByExample(example);
	}

}
