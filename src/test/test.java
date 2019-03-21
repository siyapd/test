package test;


import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class test {
	
	public static WebDriver driver;
	
	@Test
	public  void getdata()
	{  System.setProperty("webdriver.chrome.driver", "E:\\java\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());
		
	}

}
