package com.api.library.conrollers;


import com.api.library.model.Book;
import com.api.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookservice;
    @GetMapping("/books")
    List<Book> findAllBooks() {
        return null;
    }
}
