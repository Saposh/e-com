package com.example.demo.api.controller.auth;

import com.example.demo.api.model.Registration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @PostMapping("/register")
    public void registerUser(@RequestBody Registration registration) {

        System.out.println(registration.getLastName());

    }

}
