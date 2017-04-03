package com.europe.england.db.sample.jpa.schedule.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ScheduleServiceTest {
	
	@Autowired
	private ScheduleService scheduleService;

	@Test
	public void testSave() {

		long start = System.nanoTime();
		double count = 10000.00;
		
		for(int i=0;i<count;i++){
			scheduleService.save();
		}
		
		
		
		long end = System.nanoTime();
		
		//2968.042918561479
		System.out.println((count*100*1000*1000*1000)/(end-start));
	}

}
