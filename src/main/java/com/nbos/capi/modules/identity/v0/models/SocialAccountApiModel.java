package com.nbos.capi.modules.identity.v0.models;

public class SocialAccountApiModel {
    Long id;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSocialType() {
        return socialType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getAccessToken() {
        return accessToken;
    }

    String email;
    String socialType;
    String imageUrl;
    String accessToken;
}
