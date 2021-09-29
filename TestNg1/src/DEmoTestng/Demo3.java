package DEmoTestng;

import org.testng.annotations.Test;

public class Demo3 {

	
		@Test(priority=1)
		public void Lion()
		{
			System.out.println("This is first method");
		}
		@Test(priority=2)
		public void Elephant()
		{
			System.out.println("This is my second method");

	}
		@Test(priority=3)
		public void Tiger()
		{
			System.out.println("This is my third method");
		}
		
		@Test
		public void z()
		{
			System.out.println("This is a");
		}
		
		@Test
		public void testcase()
		{
			System.out.println("This is b");
		}

}
