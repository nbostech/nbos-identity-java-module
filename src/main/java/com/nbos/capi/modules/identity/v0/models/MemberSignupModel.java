package com.nbos.capi.modules.identity.v0.models;


public class MemberSignupModel {
    String username;
    String email;

    String password;
    String firstName;
    String lastName;
    String jsonAttributes;

    public String getJsonAttributes() {
        return jsonAttributes;
    }

    public void setJsonAttributes(String jsonAttributes) {
        this.jsonAttributes = jsonAttributes;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
