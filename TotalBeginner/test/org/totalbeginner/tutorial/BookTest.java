package org.totalbeginner.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void testBook() {
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author);
		
	}
	
	@Test
	public void testGetPerson() {
		Book b2 = new Book("War and Peace");
		Person p2 = new Person();
		p2.SetName("Elvis");
		
		//new method to set the Person
		b2.setPerson(p2);
		
		//get the name of the person who has the book
		Person testPerson = b2.getPerson();
		String testPersonName = testPerson.GetName();
		
		assertEquals("Elvis", testPersonName);
	}

}
