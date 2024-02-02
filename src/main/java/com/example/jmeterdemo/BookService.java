package com.example.jmeterdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookService {

    ServiceA serviceA = new ServiceA();

    public Book getBookPerformanceTesting(String id) {
        serviceA.methodA();
        Book book = new Book();
        book.setId(id);
        book.setTitle("Book " + id);
        return book;
    }
}
