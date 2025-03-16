package com.example.BookCatalog.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookCatalog.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}