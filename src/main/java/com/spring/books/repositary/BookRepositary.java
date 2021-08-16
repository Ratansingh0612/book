package com.spring.books.repositary;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.books.entity.Book;


@Repository
public interface BookRepositary extends JpaRepository<Book, Integer>{
	@Query("SELECT u FROM Book u WHERE u.authorName =:bookAuthor and u.bookName =:bookName")
	Book findByBookNameAndAuthorName(@Param("bookAuthor") String bookAuthor, @Param("bookName") String bookName);
	
}
