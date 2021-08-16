package com.spring.books.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.books.entity.Book;

@Service
public interface BookService {

	Book addBook(Book book);

	List<Book> getallBooks();

	Book getBookById(int id);

	Book deleteBook(int id);
	
	Book bookWithAuthor (String bookName, String bookAuthor);
}
