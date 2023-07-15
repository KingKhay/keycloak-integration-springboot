package com.khaydev.keycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String adminEndpoint(){
        return "Admin Page";
    }

    @GetMapping("/users")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String userEndpoint(){
        return "User Page";
    }
}
