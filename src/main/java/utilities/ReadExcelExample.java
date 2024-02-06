package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 

public class ReadExcelExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = new File("./testingdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb1= new XSSFWorkbook(fis);
		XSSFSheet sheet1= wb1.getSheet("Sheet1");
		System.out.println(sheet1.getLastRowNum());
		System.out.println(sheet1.getRow(0).getCell(1).getStringCellValue());
		
	}

}
