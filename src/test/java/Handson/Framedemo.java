package Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Framedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
	    
	    driver.get("https://demoqa.com/frames");
	    driver.manage().window().maximize();
	    
	    driver.switchTo().frame(0);
	    WebElement frametext = driver.findElement(By.id("https://demoqa.com/frames"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;  
	    js.executeScript("arguments[0].scrollIntoView();", frametext);
	    System.out.println("Text of first screen : " + frametext.getText());
	    
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame("frame2");
	    WebElement secondframetext = driver.findElement(By.id("https://demoqa.com/frames"));
	    System.out.println("Text of first screen : " + secondframetext.getText());
	    driver.switchTo().defaultContent();
	    driver.quit();
	}

}
