package com.api.library.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String author;
    private String isbn;
    private Double price;
    private Boolean isBorrowed;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getBorrowed() {
        return isBorrowed;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }
}
