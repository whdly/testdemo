package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoEnvController {

    private final Environment environment;

    @Autowired
    public EchoEnvController(Environment ev) {
        this.environment = ev;
    }
    @GetMapping("/echo/env/{name}")
    public String environment(@PathVariable String name){

        return environment.getProperty(name);
    }
}
