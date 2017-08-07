package com.zhy.model;

import java.util.List;

public class Category {
	private int id;
	private String code;
	private String name;
	private List<Book> books;
	public Category() {
		super();
	}
	public Category(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "[id="+id+",code="+code+",name="+name;
	}
}
