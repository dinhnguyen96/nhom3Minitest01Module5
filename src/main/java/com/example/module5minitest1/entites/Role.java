package com.example.module5minitest1.entites;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Role implements Serializable
{
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String roleName;


    public Role()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "roleName")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
