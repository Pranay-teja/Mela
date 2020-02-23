package com.accenture.mela.controller;

import com.accenture.mela.Model.Book;
import com.accenture.mela.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/all")
    public List<Book> listAllBooks() {
        return bookService.listAllBooks();
    }

    @PostMapping(value = "/add")
    public void insertBook(@RequestBody Book book) {
        System.out.println("checkin"+book.getGenre());
        bookService.saveBooks(book);
    }

}

