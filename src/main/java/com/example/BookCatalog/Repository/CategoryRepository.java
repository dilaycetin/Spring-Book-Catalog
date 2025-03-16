package com.example.BookCatalog.Repository;

import com.example.BookCatalog.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}