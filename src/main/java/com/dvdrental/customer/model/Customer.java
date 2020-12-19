package com.dvdrental.customer.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customer_id;
    private Long store_id;
    private String first_name;
    private String last_name;
    private String email;
    private Long address_id;
    private boolean activebool;
    private LocalDateTime last_update;
    private boolean active;


}
