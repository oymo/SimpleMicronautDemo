package com.example.web;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloWorldController {

    @Get(value = "hello/{name}", produces = MediaType.TEXT_PLAIN)
    public String hello(String name){
        return "Hello " + name + "!";
    }
}
