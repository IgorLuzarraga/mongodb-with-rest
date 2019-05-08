package com.example.springboot.mongodbwithrest.services;

import com.example.springboot.mongodbwithrest.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    public Optional<Book> findById(String id);
    public List<Book> findAll();
    public List<Book> findByTitle(String title);
    public List<Book> findByAuthor(String author);
    public Book save(Book book);
    public void delete(Book book);
    public void deleteById(String id);
    public void deleteAll();
    public Long count();
}
