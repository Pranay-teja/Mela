package com.accenture.mela.Repository;

import com.accenture.mela.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//TODO: fix
@Repository
public interface BooksRepository extends JpaRepository<Book,Book> {

}
