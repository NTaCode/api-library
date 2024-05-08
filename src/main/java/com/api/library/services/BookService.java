package com.api.library.services;

import com.api.library.entities.Book;
import com.api.library.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    Book saveBook(Book book){
        return bookRepository.save(book);
    }
    public Book getBook(long id){
        return bookRepository.findById(id);
    }
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public List<Book> getBooksByPrices(Double priceStart,Double priceEnd){
        return bookRepository.findBooksByPriceBetween(priceStart,priceEnd);
    }

    public Book updateBorrowingStatus(long bookId){
       Book existingBook=bookRepository.findById(bookId);
        if(!existingBook.getBorrowed()){
            existingBook.setBorrowed(true);
        }else {
            existingBook.setBorrowed(false);
        }
        bookRepository.save(existingBook);
        return existingBook;
    }

    public void deleteBook(long bookId){
        bookRepository.deleteById(bookId);
    }
}


