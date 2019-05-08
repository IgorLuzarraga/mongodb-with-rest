package com.example.springboot.mongodbwithrest.repositories;

import com.example.springboot.mongodbwithrest.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
}