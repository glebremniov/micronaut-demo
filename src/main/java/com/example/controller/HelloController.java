package com.example.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import java.util.Map;

@Controller(value = "/hello")
public class HelloController {

    @Get(uri = "/{name}")
    public HttpResponse<Map<String, String>> hello(@PathVariable String name) {
        return HttpResponse
                .status(HttpStatus.OK)
                .headers(Map.of("Hyi", "pizda"))
                .body(Map.of("name", name));
    }

}
