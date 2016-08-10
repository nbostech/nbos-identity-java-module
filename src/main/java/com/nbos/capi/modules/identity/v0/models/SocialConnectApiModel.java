package com.nbos.capi.modules.identity.v0.models;

/**
 * Created by vivekkiran on 7/1/16.
 */

public class SocialConnectApiModel {
    private String clientId;
    private String accessToken;
    private String expiresIn;

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

}
