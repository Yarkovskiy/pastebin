package com.example.pastebin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "post_stats")
public class PostStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @Column(name = "views", nullable = false)
    private Long views;

    @Column(name = "likes", nullable = false)
    private Long likes;

    @Column(name = "favs", nullable = false)
    private Long favourites;

    @Column(name = "date", nullable = false)
    private LocalDate date;

}
