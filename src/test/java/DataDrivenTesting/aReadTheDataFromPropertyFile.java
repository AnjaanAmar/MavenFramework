package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class aReadTheDataFromPropertyFile {
public static void main(String[] args) throws IOException {
	FileInputStream File = new FileInputStream("./src/test/resourse/Maven.properties");
	Properties Property = new Properties();
	Property.load(File);
	String URL = Property.getProperty("url");
	System.out.println("App URL "+URL);
	String UserName = Property.getProperty("username");
	System.out.println("UserName "+UserName);
	String Password = Property.getProperty("password");
	System.out.println("Password "+Password);
}
}
