package com.dvdrental.customer.service;


import com.dvdrental.customer.model.Customer;
import com.dvdrental.customer.model.Film;
import com.dvdrental.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository filmRepository;

    public List<Customer> getCustomer() {
        List<Customer> list = filmRepository.findAll();//.stream().map(FilmDto::create).collect(Collectors.toList());
        return list;
    }

    public Optional<Customer> getCustomerbyId(Long id) {
        Optional<Customer> customer = filmRepository.findById(id);
        return customer;
    }

    /*public List<FilmDto> getFilmsByLanguage(Integer id) {
        return filmRepository.findByLanguage(id).stream().map(FilmDto::create).collect(Collectors.toList());
    }*/

}
