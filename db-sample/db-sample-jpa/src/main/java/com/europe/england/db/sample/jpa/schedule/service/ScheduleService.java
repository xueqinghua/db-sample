package com.europe.england.db.sample.jpa.schedule.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.apache.commons.lang3.RandomUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.europe.england.db.sample.jpa.customer.entity.CustomerEO;
import com.europe.england.db.sample.jpa.customer.repository.CustomerDao;
import com.europe.england.db.sample.jpa.user.entity.UserEO;
import com.europe.england.db.sample.jpa.user.repository.UserDao;


@Service
public class ScheduleService {
	
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private CustomerDao customerDao;

	
	@Scheduled(cron="0/10 * * * * ?")
	public void schedule(){
		System.out.println("-------------------");
	}
	
	
	
	
	
	@Transactional(value=TxType.REQUIRED)
	public void save(){
		
		
		long random = RandomUtils.nextLong(0, 10000000000000l);
		
		List<UserEO> userEOs = new ArrayList<>();
		UserEO userEO;
		for(int i=0;i<100;i++){
			userEO = new UserEO();
			
			userEO.setName("name_"+random);
			userEO.setHobby("hobby_"+random);
			userEO.setProfession("profession_"+random);
			userEO.setCountry("country_"+random);
			userEO.setCity("city_"+random);
			userEOs.add(userEO);
			
			//userDao.save(userEO);
			
/*			CustomerEO customerEO = new CustomerEO();
			customerEO.setName("name_"+i);
			customerEO.setAddress("address_"+i);
			customerDao.save(customerEO);*/
		}
		
		userDao.save(userEOs);
	}
}
