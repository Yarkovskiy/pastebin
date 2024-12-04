package com.example.pastebin.entity;

import com.example.pastebin.enums.PostVisibility;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "uuid", unique = true, nullable = false)
    private UUID uuid;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Enumerated(EnumType.STRING)
    @Column(name = "visibility", nullable = false)
    private PostVisibility visibility;

    @Column(name = "expire_at")
    private LocalDateTime expireAt;

    @Column(name = "create_at", nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "total_views", nullable = false)
    private Integer totalViews;

    @Column(name = "total_likes", nullable = false)
    private Integer totalLikes;

    @Column(name = "total_favs", nullable = false)
    private Integer totalFavourites;
}


