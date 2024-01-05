package com.javaex.ex10;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	public Book(int bookNo, String title, String author, int stateCode) {
		this(bookNo, title, author);
		this.stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public void rent(int num, Book[] books) {
		for(int i=0; i<10; i++) {
			if(num==i) {
			}
		}
	}
	
	public void print() {
		
	}
	
	
	
    
    
    
    
    
}
