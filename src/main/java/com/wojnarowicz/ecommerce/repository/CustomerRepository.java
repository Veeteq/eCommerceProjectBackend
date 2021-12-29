package com.wojnarowicz.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wojnarowicz.ecommerce.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

  Optional<Customer> findByEmail(String email);
  
}
