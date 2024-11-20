package com.example.pastebin.service;

import com.example.pastebin.dto.UserDTO;
import com.example.pastebin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDTO findUserById(Long id) {
        // Логика будет позже
        return new UserDTO();
    }

    public void updateUserDetails(UserDTO userDTO) {
        // Логика будет позже
    }

}
