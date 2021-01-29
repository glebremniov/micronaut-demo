package com.example.controller;

import com.example.service.security.SecurityService;
import com.example.util.security.UserDetails;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import java.util.Map;

@Controller(value = "/api/auth")
public class AuthController {

    @Inject
    SecurityService securityService;

    @Post("/login")
    HttpResponse<?> login(@Body UserDetails userDetails) {
        if (userDetails == null) {
            return HttpResponse.status(HttpStatus.BAD_REQUEST);
        }

        var token = securityService.generateToken(userDetails);
        return HttpResponse.ok(Map.of("token", token));
    }

}
