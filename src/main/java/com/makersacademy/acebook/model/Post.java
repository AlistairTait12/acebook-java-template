package com.makersacademy.acebook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
@Entity
@Table(name = "POSTS")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generates each unique ID for the db records?
    private Long id;        // ID of post
    private String content; // String content of the post

    private Post() {}

    public Post(String content) { // Constructor of the post
        this.content = content;   // Notice that the id does not need to be handled in the constructor
    }

}
