package com.example.springboot.mongodbwithrest.controllers;

import com.example.springboot.mongodbwithrest.domain.Book;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class jsonMapper {

     public static List<String> getListIdFromJson(String jsonBookList) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<String> booksIdList = new ArrayList<>();

        JsonNode rootNode = mapper.readTree(jsonBookList);
        JsonNode _embeddedNode = rootNode.path("_embedded");
        JsonNode bookListNode = _embeddedNode.path("bookList");

        Iterator<JsonNode> elements = bookListNode.elements();
        while(elements.hasNext()) {
            JsonNode element = elements.next();
            JsonNode idNode = element.path("id");
            booksIdList.add(idNode.asText());
        }

        return booksIdList;
    }

    public static String getJsonFromBook(Book book) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(book);
    }
}
