package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/"); 
		driver.findElement(By.xpath("//*[@id=\"headerControllerId\"]/div[3]/header/div/div/div/div/ul/li[3]/ul/li[2]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"login\"]/login/div/form/div[1]/div[1]/label[1]")).sendKeys("bhanu");
		driver.findElement(By.xpath("//*[@id=\"login\"]/login/div/form/div[1]/div[2]/label[1]")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"login\"]/login/div/form/button")).click();
        driver.close();
	}

}
