package com.dvdrental.customer.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long film_id;
    private String title;
    private String description;
    private Long release_year;

    @Column(name="language_id")
    private Integer language;
    private Integer rental_duration;
    private BigDecimal rental_rate;
    private Integer length;
    private BigDecimal replacement_cost;
    private String rating;
    private LocalDateTime last_update;
    private String special_features;
    private String fulltext;



}
