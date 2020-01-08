package inbox;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tripadviser {
	
	public WebDriver driver;
	@BeforeMethod
	public void openapplication()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get(" https://www.tripadvisor.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void search()
	{
		WebElement ele=driver.findElement(By.xpath("//span[@class='brand-global-nav-action-search-Search__label--3PRUD']"));
		ele.sendKeys("Club Mahindra");
		WebElement auto= driver.findElement(By.xpath("//div[@class='first-row']"));
		auto.click();
		driver.findElement(By.xpath("//a[@class='ui_button primary']")).click();
		WebElement m=driver.findElement(By.xpath("//span[@id='bubble_rating']"));
		Actions act=new Actions(driver);
		act.moveToElement(m).perform();
		driver.findElement(By.xpath("//input[@name='ReviewTitle']")).sendKeys("good");
		
		WebElement r1=driver.findElement(By.xpath("//span[@id='qid12_bubbles']"));
		Actions act1=new Actions(driver);
		act.moveToElement(m).perform();
		
		WebElement r2=driver.findElement(By.xpath("//span[@id='qid190_bubbles']"));
		Actions act2=new Actions(driver);
		act.moveToElement(m).perform();
		
		WebElement r3=driver.findElement(By.xpath("//span[@id='qid47_bubbles']"));
		Actions act3=new Actions(driver);
		act.moveToElement(m).perform();
		
		WebElement auto1= driver.findElement(By.xpath("//input[@type='checkbox']"));
		Select sel = new Select(auto1);
		sel.selectByValue("1");
	}
		@AfterMethod
		public void closeapplication()
		{
			driver.quit();
		}
		
		
		
		
		
		
	}



