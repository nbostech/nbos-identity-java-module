package com.nbos.capi.modules.identity.v0.models;

/**
 * Created by vineeln on 6/25/16.
 */
public class LoginModel {

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

    String username;
    String password;
}
