package com.event.spring.event.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    public Post(String content) {
        this.content = content;
    }
}
