package com.customer.profile.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.profile.registration.dto.CustomerLogin;
import com.customer.profile.registration.dto.CustomerProfileDTO;
import com.customer.profile.registration.service.CustomerLoginService;
import com.customer.profile.registration.service.CustomerProfileServiceImpl;

@RestController
public class CustomerProfileController {

	@Autowired
	CustomerProfileServiceImpl customerProfileServiceImpl;

	@Autowired
	CustomerLoginService customerLoginService;

	@PostMapping("/createProfile")
	public String createCustomerProfile(@RequestBody CustomerProfileDTO customerProfileDTO) {
		String response = customerProfileServiceImpl.createCustomerProfile(customerProfileDTO);

		return response;
	}

	
	  @GetMapping(value="/login") 
	  public ResponseEntity<String> login(@RequestBody CustomerLogin customerLogin) { 
		  return new ResponseEntity<String>(customerLoginService.loginCustomer(customerLogin.getUserId(), customerLogin.getPassword()),HttpStatus.OK); 
		  
	  }
	 

}
