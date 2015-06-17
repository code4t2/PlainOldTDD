package org.totalbeginner.tutorial;

public class Person {
	
	private String name;
	private int maximumBooks;
	
	public Person() {
		name = "Anonymous";
		maximumBooks = 3;
	}
	
	public final String GetName() {
		return name;
	}
	
	public final void SetName(String someName) {
		name = someName;
	}

	public final int getMaximumBooks() {
		return maximumBooks;
	}

	public final void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String toString() {
		return this.GetName() + " (" + this.getMaximumBooks() + " books)";
	}
}
