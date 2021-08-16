package com.spring.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.books.entity.Book;

import com.spring.books.service.BookService;

@RestController
@RequestMapping("/Library")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/addBook")
	Book addBook(@RequestBody Book book) {

		return bookService.addBook(book);

	}

	@GetMapping("/getAllBooks")
	List<Book> getAllBooks() {

		return bookService.getallBooks();

	}

	@GetMapping("/getBookById/{id}")
	Book getBookById(@PathVariable("id") int Id) {

		return bookService.getBookById(Id);

	}

	@GetMapping("/deleteBook/{id}")
	Book deleteBook(@PathVariable("id") int Id) {

		return bookService.deleteBook(Id);

	}

	@GetMapping("/getBookByItsNameAndAuthor/{bookAuthor}/{bookName}")
	Book getBookByNameAndItsAuthor(@PathVariable("bookAuthor") String bookAuthor,
			@PathVariable("bookName") String bookName) {

		return bookService.bookWithAuthor(bookAuthor, bookName);

	}
}
