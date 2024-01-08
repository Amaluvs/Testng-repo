package testScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends Base
{
	@Test
public void annotation_test()
{
	System.out.println("@test");
}
	@Test
	public void annotation_test2()
	{
		System.out.println("test2");
	}
	@BeforeMethod
	
public void annotation_Before_Method()
{
	System.out.println("before method");
}
	@AfterMethod
	public void annotation_After_Method()
	{
		System.out.println("After method");
	}
	@BeforeClass
	public void annotation_Before_class()
	{
		System.out.println("After class");
	}
	@AfterClass
	public void annotation_After_class()
	{
		System.out.println("After method");
	}
	@BeforeTest
	public void annotation_Before_Test()
	{
		System.out.println("before test");
	}
	@AfterTest
	public void annotation_After_Test()
	{
		System.out.println("After test");
	}
	@BeforeSuite
	public void annotation_Before_Suite()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void annotation_After_Suite()
	{
		System.out.println("After suite");
	}
	
	
}
