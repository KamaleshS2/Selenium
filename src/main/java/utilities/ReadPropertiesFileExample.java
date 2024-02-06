package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = new File("./configuration.properties");
		System.out.println(src);
		FileInputStream fis = new FileInputStream(src);
		System.out.println(fis);
		Properties obj = new Properties();
		obj.load(fis);
		System.out.println(obj.getProperty("name"));
		System.out.println(src);
	}

}
