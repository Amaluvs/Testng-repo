package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Base
{
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser()
	{
		
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Amalu\\eclipse-workspace\\TestNgProjects\\src\\main\\resources\\resource\\chromedriver-win64" );
	driver =new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	driver.manage().window().maximize();
	}
	@AfterMethod
	public void driverQuit()
	{
		//driver.close();
		driver.quit();
	}

	public static void main(String[] args)
	{
		Base base=new Base();
		base.initializeBrowser();
		base.driverQuit();

	}

}
