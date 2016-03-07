package base;

/**
 * This junit class tests the Triangle class using accepted values taken from 
 * a outside calculations.
 * It creates a new Triangle called tri and it tests getArea() and getPerimeter()
 * 
 * @author Colby Banbury
 *
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {
	
	Triangle tri1;
	Triangle tri2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tri1 = new Triangle();
		
		tri2 = new Triangle(2,2,2);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testgetPerimeter() {
		assertEquals(tri1.getPerimeter(), 3.0, 0.1);
		assertEquals(tri2.getPerimeter(), 6.0, 0.1);
		
	}
	
	@Test
	public void testgetArea() {
		assertEquals(tri1.getArea(), 0.433, 0.1);
		assertEquals(tri2.getArea(), 1.7321, 0.1);
	}
	
	@Test
	public void testtoString() {
		System.out.print(tri1.toString());
		assertEquals(tri1.toString(), "This is a triangle with sides: 1.0, 1.0, 1.0");
		
	}
	
	
	
		
		

}
