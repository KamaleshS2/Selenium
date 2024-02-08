//package utilities;
//
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//public class ScreenshotwithfolderExample {
//	
//
//		public static String captureScreenshot (WebDriver driver, String screenshotName) {
//			
//			String timestamp =  new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//			TakesScreenshot ts = (TakesScreenshot)driver;
//			File source = ts.getScreenshotAs(OutputType.FILE);
//			//String destination = "./Screenshots/"screenshotName + "_" + timestamp + ".png";
////			try { 
////		    	FileUtils.copyFile(source, new File(destination));
////		    	System.out.println("Screenshot captured and saved to" +destination );
////		    }catch (IOException e) {
////		    	System.out.println("Failed to get screenshot" + e.getMessage());
////		    }
////			return screenshotName;
//			
//	}
//
//}
