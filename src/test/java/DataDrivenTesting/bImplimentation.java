package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.hpsf.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bImplimentation 
{
	public static WebDriver driver;
public static void main(String[] args) throws IOException {
	FileInputStream File = new FileInputStream("./src/test/resourse/Maven.properties");
	Properties Property = new Properties();
	Property.load(File);
	String Browser = Property.getProperty("browser");
	if(Browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(Browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(Property.getProperty("url"));
	WebElement Username = driver.findElement(By.id("username"));
	Username.clear();
	Username.sendKeys(Property.getProperty("username"));
	WebElement Password = driver.findElement(By.id("password"));
	Password.clear();
	Password.sendKeys(Property.getProperty("password"));
}
}
