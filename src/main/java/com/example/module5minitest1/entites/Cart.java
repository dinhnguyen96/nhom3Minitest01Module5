package com.example.module5minitest1.entites;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Cart implements Serializable {

    private Long id;

    private Customer customer;


    public Cart()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "customerID")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
       this.customer = customer;
    }
}
