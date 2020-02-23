package com.accenture.mela.service;

import com.accenture.mela.Model.Book;
import com.accenture.mela.Repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BooksRepository booksRepository;

    public List<Book> listAllBooks(){
        return booksRepository.findAll();
    }

    public void saveBooks(Book book){
        booksRepository.save(book);
    }
}
