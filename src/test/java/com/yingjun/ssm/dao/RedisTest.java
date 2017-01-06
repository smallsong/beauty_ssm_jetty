package com.yingjun.ssm.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yingjun.ssm.entity.User;
import com.yingjun.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-*.xml"})
public class RedisTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void userTest(){
		List<User> userList = userService.getUserList(0, 10);
		System.out.println(userList);
	}
}
