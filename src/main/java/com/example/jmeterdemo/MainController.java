package com.example.jmeterdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {

    @Autowired
    private final BookService bookService = new BookService();

    @GetMapping("/perf/book/{id}")
    Book getBookPerformanceTest(@PathVariable String id) {
        log.info("Got request");
        Book book = bookService.getBookPerformanceTesting(id);
        log.info("Sending response");
        return book;
    }
}
