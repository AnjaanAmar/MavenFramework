package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ofghbn {
public static WebDriver driver;
public static void main(String[] args) throws IOException {
	FileInputStream File = new FileInputStream("./src/test/resourse/Ex.properties");
	Properties Property = new Properties();
	Property.load(File);
	String Browser = Property.getProperty("browser");
	if(Browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(Property.getProperty("url"));
	WebElement UN = driver.findElement(By.id("username"));
	UN.clear();
	UN.sendKeys(Property.getProperty("username"));
	WebElement P = driver.findElement(By.id("password"));
	P.clear();
	P.sendKeys(Property.getProperty("password"));
}
}
