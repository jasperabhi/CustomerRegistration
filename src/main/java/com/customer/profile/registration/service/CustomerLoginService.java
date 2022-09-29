package com.customer.profile.registration.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customer.profile.registration.exception.CustomerNotPresentException;
import com.customer.profile.registration.model.CustomerProfile;
import com.customer.profile.registration.repository.CustomerProfileRepository;

@Component
public class CustomerLoginService {
	
	@Autowired 
	CustomerProfileRepository customerProfileRepository;
	
	public String loginCustomer(int id, String password) {
		Optional<CustomerProfile> customerOptional = customerProfileRepository.findById(id);
		if (customerOptional.isPresent()) {
			CustomerProfile customer = customerOptional.get();
			if (customer.getPassword().equals(password)) {
				return "Loging success";
			} 
			else{
				return "password error";
			}
		}
		else{
			throw new CustomerNotPresentException("You are not registered");
		}
	}

}
