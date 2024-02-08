package Handson;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteTest {
public static void main(String[] args) {
		
}
	public void remoteTest() {
		ChromeOptions options = new ChromeOptions();

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME,"chrome");
		
		caps.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = null;
		try {
			driver = new RemoteWebDriver(URI.create("https://localhost:4444/").toURL(),caps);
		} catch(MalformedURLException e){
			e.printStackTrace();
		}
		driver.navigate().to("https://www.google.com");
		WebElement searchbox = driver.findElement(By.name("q"));
		System.out.println(searchbox.isDisplayed());
}
	
}
