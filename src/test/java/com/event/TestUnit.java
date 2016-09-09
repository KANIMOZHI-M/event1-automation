package src.test.java.com.event;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUnit {
private int value1;
	private int value2;
	
	@Before
	protected void setUp() throws Exception {
	super.setUp();
	value1 = 3;
	value2 = 5;
	}
	
	@After
	protected void tearDown() throws Exception {
	super.tearDown();
	value1 = 0;
	value2 = 0;
	}
	
	@Test
	public void testSum() {
	int total = 8;
	int sum = SimpleMath.sum(value1, value2);
	assertEquals(sum, total);
	}
	
	@Test
	public void testFailedSum() {
	int total = 9;
	int sum = SimpleMath.sum(value1, value2);
	assertNotSame(sum, total);
	}
	
	@Test
	public void testSubtraction() {
	int total = 0;
	int sub = SimpleMath.subtraction(4, 4);
	assertEquals(sub, total);
	}
	
	@Test
	public void testMultiplication() {
		int total=15;
		int mul=SimpleMath.multiplication(value1, value2);
		assertEquals(mul,total);
	}
	
	@Test
	public void testDivision() {
		int total=1;
		int div=SimpleMath.division(4,4);
		assertEquals(div,total);
	}
	
	@Test
	public void testEqualIntegers() {
		boolean result=true;
		boolean equalInt=SimpleMath.equalIntegers(4,4);
		assertEquals(equalInt,result);
				
	}
	
	@Test
	public void testEqualIntegers() {
		boolean result=true;
		boolean equalInt=SimpleMath.equalIntegers(value1 , value2);
		assertnotSame(equalInt,result);
				
	}
	
	@Test
	public void testValidateFirstName() {
		boolean result=true;
		boolean valFirstName=UserRegistration.validateFirstName("kani");
		assertEquals(valFirstName,result);
				
	}
	
	@Test
	public void testValidateFirstNameCheck() {
		boolean result=false;
		boolean valFirstName=UserRegistration.validateFirstName("");
		assertEquals(valFirstName,result);
				
	}
	
	@Test
	public void testValidateAge() {
		boolean total=true;
		boolean valAge=UserRegistration.validateAge(0);
		assertEquals(valAge,total);
		
	}
	
	@Test
	public void testFailedValidateAge() {
		boolean total=false;
		boolean valAge=UserRegistration.validateAge(113);
		assertnotSame(valAge,total);
		
	}
	
	@Test
	public void testGetUsersByName() {
		String result="";
		boolean getUsersByName=UserService.getUsersByName("");
		assertEquals(getUsersByName,result);
		
	}
	
	@Test
	public void testFailedGetUsersByName() {
		String result="";
		boolean getUsersByName=UserService.getUsersByName("kani");
		assertnotSame(getUsersByName,result);
		
	}

	

}
