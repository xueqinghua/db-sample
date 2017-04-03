package com.europe.england.db.sample.jpa.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.europe.england.db.sample.jpa.user.entity.UserEO;
import com.europe.england.db.sample.jpa.user.repository.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	public void save(UserEO userEO){
		userDao.save(userEO);
	}

}
