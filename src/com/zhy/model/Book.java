package com.zhy.model;

public class Book {
	private int id;
	private String name;
	private String author;
	private Integer price;
	private Category category;
	public Book() {
		super();
	}
	public Book(String name, String author, Integer price, Category category) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "[id="+id+",name="+name+",author="+author+",price="+price+"]";
	}
}
