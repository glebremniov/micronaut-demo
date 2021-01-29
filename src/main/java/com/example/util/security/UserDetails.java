package com.example.util.security;

import io.micronaut.core.annotation.Introspected;

@Introspected
public record UserDetails(String username, String password) {
}
