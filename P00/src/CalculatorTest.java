import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

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
	public void testAdd() {
		//Arrange
		int a = 4321;
		int b = 1234;
		
		//Act
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
		
		//Assert
		int expected = 5555;
		assertEquals (expected, actual);
		}

	@Test
	public void testSubtract() {
		//Arrange
		int a = 9876;
		int b = 4321;
		
		//Act
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
		
		//Assert
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testMultiple() {
		//Arrange
		int a = 4321;
		int b = 1234;
		
		//Act
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
			 
		//Assert
		int expected = 5332114;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testDivide() {
		//Arrange
		int a = 10;
		int b = 2;
		
		//Act
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
		
		//Assert
		int expected = 5;
		assertEquals (expected, actual);
		}

}
