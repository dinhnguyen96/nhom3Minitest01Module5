package com.example.module5minitest1.entites;


import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Account implements Serializable
{
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String password;

    public Account()
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
