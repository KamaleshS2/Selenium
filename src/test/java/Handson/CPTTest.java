package Handson;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.network.model.RequestWillBeSent;
import org.openqa.selenium.devtools.v120.network.Network;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CPTTest {
	ChromiumDriver driver; 
	DevTools devTools;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		devTools = driver.getDevTools();
		devTools.createSession();
	}
	
	@Test
	public void deviceModeTest() {
		Map deviceMetrics = new HashMap() {
			{
				put("width", 800);
				put("height", 1000);
				put("deviceScaleFactor", 50);
				put("mobile", true);
			}
		};
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		driver.get("https://www.selenium.dev");
	}
	
	/**
	 * 
	 */
//	@Test
//	public void CaptureNWTrafficTest() {
//		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//		devTools.addListener(Network.requestWillBeSent(), new Consumer<RequestWillBeSent>() {
//			public void accept(RequestWillBeSent entry) {
//				System.out.println("RequestU URI" + entry.getRequest().getUrl()+ "\n" + "With method :" + entry.getRequest().getMethod() + "\n");
//				entry.getRequest().getMethod();
//			}
//		});
//		driver.get("https://www.selenium.dev");
//		
	}


