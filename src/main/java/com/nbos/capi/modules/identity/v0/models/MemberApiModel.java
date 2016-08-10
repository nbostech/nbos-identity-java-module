package com.nbos.capi.modules.identity.v0.models;

import java.util.List;

public class MemberApiModel {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String description;
    private String uuid;
    private Boolean isExternal;
    private List<SocialAccountApiModel> socialAccounts;
    private List<EmailConnectApiModel> emailConnects;

    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public String getUuid() {
        return uuid;
    }

    public Boolean isExternal() {
        return isExternal;
    }

    public List<SocialAccountApiModel> getSocialAccounts() {
        return socialAccounts;
    }

    public List<EmailConnectApiModel> getEmailConnects() {
        return emailConnects;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
