package com.example.BookCatalog.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookCatalog.Entity.Book;

import java.util.List;
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByUserId(Long userId);
}