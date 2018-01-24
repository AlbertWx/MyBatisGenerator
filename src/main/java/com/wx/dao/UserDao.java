package com.wx.dao;

import java.util.List;

import com.wx.entity.User;
import com.wx.entity.UserExample;

public interface UserDao {
	
	public List<User> select(UserExample example);
	
}
