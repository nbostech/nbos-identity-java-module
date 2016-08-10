package com.nbos.capi.modules.identity.v0.models;

/**
 * Created by vineelanalla on 14/01/16.
 */
public class UpdatePasswordApiModel {
    private String passsword;

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    private String newPassword;

}
