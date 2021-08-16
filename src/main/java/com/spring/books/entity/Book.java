package com.spring.books.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String authorName;
	private String bookName;
	private int bookPrice;
	private String qty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", authorName=" + authorName + ", bookName=" + bookName + ", bookPrice=" + bookPrice
				+ ", qty=" + qty + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String authorName, String bookName, int bookPrice, String qty) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.qty = qty;
	}
	public Book(String authorName, String bookName, int bookPrice, String qty) {
		super();
		this.authorName = authorName;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.qty = qty;
	}
	

}
