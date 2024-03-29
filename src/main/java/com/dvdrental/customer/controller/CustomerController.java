package com.dvdrental.customer.controller;


import com.dvdrental.customer.model.Customer;
import com.dvdrental.customer.model.Film;
import com.dvdrental.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/catalog")
    public List<Customer> get () {
        return customerService.getCustomer();
    }

    @GetMapping("")
    public ResponseEntity getFilmById(@RequestParam Long customer_id ) {
        Optional<Customer> customer = customerService.getCustomerbyId(customer_id);
        return  customer.map(c -> ResponseEntity.ok(customer))
                .orElse((ResponseEntity.notFound().build()));
    }

    /*@GetMapping("/lang/{id}")
    public ResponseEntity getFilmByLanguage(@PathVariable("id") Integer id ) {
        List<FilmDto> film = filmService.getFilmsByLanguage(id);
        return  film.isEmpty() ?
                ResponseEntity.noContent().build() :
                ResponseEntity.ok(film);
    }*/

}
