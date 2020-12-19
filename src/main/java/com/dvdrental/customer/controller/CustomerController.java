package com.dvdrental.customer.controller;


import com.dvdrental.customer.model.Customer;
import com.dvdrental.customer.model.Film;
import com.dvdrental.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping()
    public List<Customer> get () {
        return customerService.getCustomer();
    }

    @GetMapping("/{id}")
    public ResponseEntity getFilmById(@PathVariable("id") Long id ) {
        Optional<Customer> film = customerService.getCustomerbyId(id);
        return  film.map(c -> ResponseEntity.ok(film))
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
