package com.api.library.repositories;

import com.api.library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAll();

    Book findById(long id);

    List<Book> findBooksByPriceBetween(Double startPrice,Double endPrice);
}
