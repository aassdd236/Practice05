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
		this.stateCode = 1;
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
		for(int i=0; i<books.length; i++) {
			if(num==books[i].getBookNo()) {
				books[i].stateCode=0;
			}
		}
	}
	
	public void print() {
		String code="재고있음";
		if(stateCode==1) {
			code="재고있음";
		}else {
			code="대여중";
		}
		System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + code);
	}
}
	
