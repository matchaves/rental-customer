package com.dvdrental.customer.repository;

import com.dvdrental.customer.model.Customer;
import com.dvdrental.customer.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findAll();

    Optional<Customer> findById(Long id);


}