package com.example.anyprefdemo.bean;

import net.nashlegend.anypref.annotations.PrefField;
import net.nashlegend.anypref.annotations.PrefModel;

@PrefModel("usermessage")
public class User {

    @PrefField("username")
    public String userName;

    @PrefField("password")
    public String password;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
