package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by takahiro on 2016/12/21.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false,unique = true,length = 20)
    private String username;

    @Column(nullable = false,length = 255)
    private String password;

    @Column(nullable = false)
    private int identity=0; //默认为0

    public User() {
    }

    public User(String username, String password, int identity) {
        this.username = username;
        this.password = password;
        this.identity = identity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }
}
