package com.example.module5minitest1.entites;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Cart implements Serializable {

    private Long id;

    private User user;


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
    @JoinColumn(name = "userId")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
