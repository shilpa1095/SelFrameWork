package defaultpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunParameter {

	public void method()
	{
		//System.out.println("method running");
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
		
		WebDriver driver;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		String URL=System.getProperty("url");
		driver.get(URL);
		
		String USERNAME=System.getProperty("username");
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		
		String PASSWORD=System.getProperty("password");
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		
		driver.findElement(By.id("submitbutton")).click();
}
}