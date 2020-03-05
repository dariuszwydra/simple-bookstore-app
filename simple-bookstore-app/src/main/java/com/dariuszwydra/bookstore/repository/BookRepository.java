package com.dariuszwydra.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dariuszwydra.bookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	
	
}
