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

public class Amnb {
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
	else if(Browser.equals("firefox"))
	{
		driver = new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(Property.getProperty("url"));
	WebElement U = driver.findElement(By.id("username"));
	U.clear();
	U.sendKeys(Property.getProperty("username"));
	WebElement P = driver.findElement(By.id("password"));
	P.clear();
	P.sendKeys(Property.getProperty("password"));
	WebElement B = driver.findElement(By.xpath("//button[text()='Sign in']"));
	B.submit();
}
}
