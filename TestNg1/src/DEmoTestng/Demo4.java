package DEmoTestng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Demo4 {
	
	
	
	@Test(groups={"Smoke"},priority=1)
	public void Test1()
	{
		System.out.println("Executing smoke test1");
	}
	@Test(groups={"Smoke"},priority=2)
	public void Test2()
	{
		System.out.println("Executing smoke test2");
	}
	@Test(groups={"regression"},priority=3)
	public void Test3()
	{
		System.out.println("Executing regression test 1");
	}

}
