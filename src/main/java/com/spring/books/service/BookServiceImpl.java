package com.spring.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.books.entity.Book;
import com.spring.books.repositary.BookRepositary;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepositary bookRepositary;

	@Override
	public Book addBook(Book book) {

		return bookRepositary.save(book);
	}

	@Override
	public List<Book> getallBooks() {

		return bookRepositary.findAll();
	}

	@Override
	public Book getBookById(int id) {

		return bookRepositary.findById(id).get();
	}

	@Override
	public Book deleteBook(int id) {

		bookRepositary.deleteById(id);

		return null;

	}

	@Override
	public Book bookWithAuthor(String bookAuthor, String bookName) {
		
		return bookRepositary.findByBookNameAndAuthorName(bookAuthor, bookName);
	}

	

}
