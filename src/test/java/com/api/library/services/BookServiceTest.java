package com.api.library.services;

import com.api.library.entities.Book;
import com.api.library.repositories.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void saveBook() {
        // Create a sample Book object
        Book book = new Book("Effective Java", "Joshua Bloch", "9780134685991", 2018, 45.00, false);

        // Mock the behavior of the repository's save method
        when(bookRepository.save(book)).thenReturn(book);

        // Call the service method
        Book savedBook = bookService.saveBook(book);

        // Verify the save method was called
        verify(bookRepository, times(1)).save(book);

        // Validate the result
        assertEquals(book, savedBook);
    }

    @Test
    void getBook() {
        // Create a sample Book object
        Book book = new Book("Effective Java", "Joshua Bloch", "9780134685991", 2018, 45.00, false);
        book.setId(1L);

        // Mock the behavior of the repository's findById method
        when(bookRepository.findById(1L)).thenReturn(book);

        // Call the service method
        Book retrievedBook = bookService.getBook(1L);

        // Verify the findById method was called
        verify(bookRepository, times(1)).findById(1L);

        // Validate the result
        assertEquals(book, retrievedBook);
    }

    @Test
    void testGetBook_NotFound() {

    }

    @Test
    void getBooks() {
    }

    @Test
    void getBooksByPrices() {
    }

    @Test
    void updateBorrowingStatus() {
    }

    @Test
    void deleteBook() {
    }
}