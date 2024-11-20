package com.example.pastebin.service;

import com.example.pastebin.dto.LoginRequest;
import com.example.pastebin.dto.RegisterRequest;
import com.example.pastebin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public String login(LoginRequest loginRequest) {
        // Логика будет позже
        return "Token";
    }

    public void register(RegisterRequest registerRequest) {
        // Логика будет позже
    }

}
