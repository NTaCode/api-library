package com.api.library.service;

import com.api.library.model.Book;
import com.api.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}


