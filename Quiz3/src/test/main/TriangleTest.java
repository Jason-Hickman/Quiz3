package main;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestTriangle() throws TriangleException {
		Triangle t = new Triangle(3.0,4.0,5.0);
		assertEquals(12.0, t.getPerimeter());
		assertEquals(6.0, t.getArea());
		Triangle notReal = new Triangle(1.0,1.0,2.0);
	}

}
