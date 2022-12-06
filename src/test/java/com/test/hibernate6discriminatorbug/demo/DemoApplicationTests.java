package com.test.hibernate6discriminatorbug.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.hibernate6discriminatorbug.demo.model.User;
import com.test.hibernate6discriminatorbug.demo.repository.UserRepository;

@SpringBootTest 
class DemoApplicationTests {

	@Autowired
	private UserRepository userRepo;
  
	@Test 
	void contextLoads() {
		
		User user1 = new User();
		user1 = userRepo.save(user1);
		
		User user = userRepo.findById(user1.getId()).orElse(null);
		assertNotNull(user);
	}

}
