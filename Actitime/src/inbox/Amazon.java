package inbox;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
	public WebDriver driver;
	@BeforeMethod
	public void openapplication()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void search()
	{
		WebElement ele=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		ele.sendKeys(" iPhone XR (64GB) - Yellow");
		WebElement ele1=driver.findElement(By.xpath("//input[@type='submit']"));
		ele1.click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		String s1=driver.findElement(By.xpath("//span[contains(@id,'priceblock_ourprice')]")).getText();
		
		String windowHandle = driver.getWindowHandle();
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	    ArrayList tabs = new ArrayList (driver.getWindowHandles());
	    System.out.println(tabs.size());
	    driver.switchTo().window((String) tabs.get(0)); 
	    driver.get("https://www.flipkart.com");
	    WebElement ele4=driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys(" iPhone XR (64GB) - Yellow");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String s2=driver.findElement(By.xpath("//div[@class='_1vC4OE _2rQ-NK']")).getText();
		
		int i=Integer.parseInt(s1);

		int j=Integer.parseInt(s2);

		if(i<j)
		{
		System.out.println("value is"+i);
		}
		else
		{
		System.out.println("value is"+j);
		}
				
				

		
		
		}
		
		


@AfterMethod
public void closeapplication()
{
	driver.quit();
}
}