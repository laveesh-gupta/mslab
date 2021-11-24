package com.example.studentbootdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String email;

    public User() {}

    public User(Integer x, String string, String string2) {
        id=x;
        name=string;
        email=string2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }
}