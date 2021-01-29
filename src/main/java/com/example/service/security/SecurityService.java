package com.example.service.security;

import com.example.util.security.UserDetails;

import javax.inject.Singleton;

@Singleton
public class SecurityService {

    public String generateToken(UserDetails userDetails) {
        return ("" + userDetails.username().hashCode() + userDetails.password().hashCode()).substring(0, 10);
    }

}