package com.example.pastebin.service;

import com.example.pastebin.dto.PostDTO;
import com.example.pastebin.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<PostDTO> getAllPosts() {
        // Логика будет позже
        return new ArrayList<>();
    }

    public PostDTO createPost(PostDTO postDTO) {
        // Логика будет позже
        return postDTO;
    }

    public void deletePost(Long id) {
        // Логика будет позже
    }

}
