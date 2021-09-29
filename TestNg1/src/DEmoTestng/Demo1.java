package DEmoTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("This will execute first ");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("This will execute before all the test");
	}
	
	@BeforeClass
	public void BC()
	{
		System.out.println("This will execute before the class start");
	}
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("This will execute before each method");
	}
	
	@Test
	public void sutest()
	{
		System.out.println("This is my first Testcase");
	}

	@Test
	public void sutest1()
	{
		System.out.println("This is my second Testcase");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("This will execute after each method");
	}
	
	@AfterClass
	public void AC()
	{
		System.out.println("This will execute after all classess");
	}
	
	@AfterTest
	public void AT()
	{
		System.out.println("This will execute after all the Test");
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("This will execute last");
	}
}
