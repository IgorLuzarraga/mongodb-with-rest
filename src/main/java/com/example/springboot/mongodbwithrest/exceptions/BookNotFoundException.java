package com.example.springboot.mongodbwithrest.exceptions;

public class BookNotFoundException extends RuntimeException {

    private final static String NOT_FOUND_BOOK = "Not found book ";

    public BookNotFoundException(Long id) {
        super(NOT_FOUND_BOOK + id);
    }

    public BookNotFoundException(String author) {
        super(NOT_FOUND_BOOK + author);
    }
}