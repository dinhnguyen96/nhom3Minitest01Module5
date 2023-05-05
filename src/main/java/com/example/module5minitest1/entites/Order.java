package com.example.module5minitest1.entites;


import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Order implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;


    private Long id;

    private Date orderDate;

    private Customer customer;


    public Order() {
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

    @Column(name = "orderDate")
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }


    @ManyToOne
    @JoinColumn(name="customerId")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
}
