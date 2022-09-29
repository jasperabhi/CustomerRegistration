
 package com.customer.profile.registration.repository;
 
 import org.springframework.data.jpa.repository.JpaRepository;
 
 import com.customer.profile.registration.model.CustomerProfile;
 
 public interface CustomerProfileRepository extends JpaRepository<CustomerProfile, Integer>{
 
 }
 