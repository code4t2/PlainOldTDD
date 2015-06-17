package org.totalbeginner.tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		Person p1 = new Person();
		assertEquals("Anonymous", p1.GetName());
		assertEquals(3, p1.getMaximumBooks());
	}

	@Test
	public void testSetName() {
		Person p2 = new Person();
		p2.SetName("Jason");
		assertEquals("Jason", p2.GetName());
	}

	@Test
	public void testSetMaximumBooks() {
		Person p3 = new Person();
		p3.setMaximumBooks(10);
		assertEquals(10, p3.getMaximumBooks());
	}
	
	@Test
	public void testToString() {
		Person p4 = new Person();
		p4.SetName("Fred Flintstone");
		p4.setMaximumBooks(7);
		String testString = "Fred Flintstone (7 books)";
		assertEquals(testString, p4.toString());
	}

}
