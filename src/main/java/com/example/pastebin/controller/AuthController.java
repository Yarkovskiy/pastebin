package com.example.pastebin.controller;

import com.example.pastebin.dto.LoginRequest;
import com.example.pastebin.dto.RegisterRequest;
import com.example.pastebin.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        // Логика будет позже
        return ResponseEntity.ok("Login successful");
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest registerRequest) {
        // Логика будет позже
        return ResponseEntity.ok("Registration successful");
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        // Логика будет позже
        return ResponseEntity.ok("Logout successful");
    }

}
