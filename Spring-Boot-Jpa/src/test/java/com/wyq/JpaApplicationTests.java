package com.wyq;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wyq.entity.User;
import com.wyq.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

	@Autowired
	private UserService userService;
	
	@Test
	public void contextLoads() {
		System.out.println("测试程序");
	}
	
	@Test 
	public void jpaTest() {
		
		List<User> testList = this.userService.findByUsername("test");
		
		System.out.println("测试成功"+testList.size());
	}

}
