package com.nbos.capi.modules.identity.v0.models;


public class EmailConnectApiModel {
    private Long id;

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public Boolean getVerified() {
        return verified;
    }

    public Boolean getPrimaryEmail() {
        return primaryEmail;
    }

    String email;
    Boolean verified;
    Boolean primaryEmail;
}
