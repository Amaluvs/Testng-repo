package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base
{
	@Test
public void webElementsMethods()
{
		
		
		
		
		String input=" hello";
	WebElement singleinputtest=driver.findElement(By.xpath("//input[@id='single-input-field']"));
singleinputtest.sendKeys("hello");
WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
WebElement yourmessage=driver.findElement(By.xpath(" //div[@id=\"message-one\"]"));
button.click();


			
String yourmessagetext=yourmessage.getText();
String backgroundcolor=button.getCssValue("background-color");
String className=button.getAttribute("class");
String tagNmae=button.getTagName();
boolean isShowMessageButtonDisplayed=button.isDisplayed();
		}


public void twoInputField()
{
	
WebElement entervalueA=driver.findElement(By.xpath("//input[@id='value-a']"));
entervalueA.sendKeys("2");
WebElement entervalueB=driver.findElement(By.xpath("//input[@id='value-b']"));
entervalueB.sendKeys("3");
WebElement gettotal=driver.findElement(By.xpath("//button[@id='button-two']"));
gettotal.click();




	
}
}
