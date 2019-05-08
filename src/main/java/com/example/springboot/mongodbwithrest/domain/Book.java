package com.example.springboot.mongodbwithrest.domain;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Book {

	@Id
    private String id;
    private String title;
    private String author;

    public Book(){}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
