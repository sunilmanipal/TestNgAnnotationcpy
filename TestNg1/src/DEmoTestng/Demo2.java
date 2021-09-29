package DEmoTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	
	@BeforeClass
	public void BC1()
	{
		System.out.println("This is my second class");
	}
	
	@Test
	public void sutest3()
	{
		System.out.println("This is my third test");
	}
	
	@AfterClass
	public void AC1()
	{
		System.out.println("This is my second class");
	}
	
}
