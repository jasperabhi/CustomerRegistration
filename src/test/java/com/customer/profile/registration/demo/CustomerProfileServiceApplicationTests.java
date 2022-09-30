package com.customer.profile.registration.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.customer.profile.registration.controller.CustomerProfileController;
import com.customer.profile.registration.dto.CustomerLogin;

@SpringBootTest
class CustomerProfileServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	private CustomerProfileController customerProfileController = new CustomerProfileController();
	
	@Test
	public void loginTest() {
		CustomerLogin customerLogin =new CustomerLogin(1,"Abhi@123");
		assertEquals(new ResponseEntity<String>("Loging success",HttpStatus.OK), customerProfileController.login(customerLogin));
	}
}
