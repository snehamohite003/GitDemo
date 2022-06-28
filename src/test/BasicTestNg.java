package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTestNg {
	
	@Test(priority=2)
	public void HellpWord()
	{
		System.out.println("Hello TestNG");
	}
	@Test(priority=0)
	public void HellpWord1()
	{
		System.out.println("Hello TestNG demo");
	}
	
	@Test(priority=1)
	public void HellpWord2()
	{
		System.out.println("Hello TestNG demo of testng");
	}
	
	@BeforeSuite
	public void CANCE1L()
	{
		System.out.println("cancel suitHello TestNG demo of testng");
	}
	
	@Test(groups= {"Smoke"})
	public void CANCEL()
	{
		System.out.println("Hello TestNG demo of testng");
	}
	@Parameters({"URL"})
	@Test
	public void method(String abc)
	{
		System.out.println("Before method Hello TestNG demo of testng"+abc);
	}
	
	
	@BeforeTest
	public void prere()
	{
		System.out.println("Before Hello TestNG demo of testng");
	}
	
	@AfterTest
	public void After()
	{
		System.out.println("After Hello TestNG demo of testng");
	}
	
	@AfterSuite
	public void CANCE1L1()
	{
		System.out.println("cancel suit last Hello TestNG demo of testng");
	}
	
	
	}


	
	


