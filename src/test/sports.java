package test;

import java.util.Iterator;
import java.util.Set;

//import org.junit.Test;
//import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sports {
	
	public static WebDriver driver;
@Test
	public static void  data() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.skysports.com/");
		driver.findElement(By.xpath("//ul[@class='site-nav-desktop__body']/li[8]/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='site-nav-desktop__menu site-nav-desktop__menu--right']/div/ul/li[16]/a")).sendKeys(Keys.CONTROL,Keys.ENTER);;
		
	int count=	driver.findElements(By.xpath("//div[@class='site-nav-desktop__menu site-nav-desktop__menu--right']/div/ul/li[16]/a")).size();	
	System.out.println(count);
		for(int i=1;i<count;i++)
		{driver.findElements(By.xpath("//div[@class='site-nav-desktop__menu site-nav-desktop__menu--right']/div/ul/li[16]/a")).get(i);

		
		Set<String> h=	driver.getWindowHandles();
		Iterator<String> it=h.iterator();
		Thread.sleep(2000l);
		while(it.hasNext())
		{
			System.out.println(driver.switchTo().window(it.next()).getTitle());
			//get the title of the url opened in seperate tab.
		}
		}
		
		
		
	}

}
