package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Kfgh {
public static void main(String[] args) throws IOException {
	FileInputStream File = new FileInputStream("./src/test/resourse/Ex.properties");
	Properties Property = new Properties();
	Property.load(File);
	String Url = Property.getProperty("url");
	System.out.println(Url);
}
}
