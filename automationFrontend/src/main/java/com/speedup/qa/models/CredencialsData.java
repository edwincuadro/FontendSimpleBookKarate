package com.speedup.qa.models;

public class CredencialsData {
    private String username;
    private String password;

    public CredencialsData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}