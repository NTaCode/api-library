package com.api.library.conrollers;


import com.api.library.entities.Book;
import com.api.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BookService bookservice;
    @GetMapping("/books")
    List<Book> findAllBooks() {
       return bookservice.getBooks();
    }
    @GetMapping("/book")
    public ResponseEntity<Book> getBook(@RequestParam long bookId) {
        Book book = bookservice.getBook(bookId);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
    @GetMapping("/booksPrices")
    public List<Book> getProduct(@RequestParam double priceStart,@RequestParam double priceEnd ) {
        List<Book> books = bookservice.getBooksByPrices(priceStart,priceEnd);
        return books;
    }

    @PatchMapping("/book")
    public ResponseEntity<Book> updateBorrowingStatus(@RequestParam long bookId){
          Book updatedBook= bookservice.updateBorrowingStatus(bookId);
          return new ResponseEntity<>(updatedBook,HttpStatus.OK);
    }

    @DeleteMapping("/book")
    public ResponseEntity<Book> deleteBook(@RequestParam long bookId) {
        bookservice.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);    }
}
