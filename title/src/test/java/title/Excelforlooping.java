package title;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.edge.EdgeDriver;





public class Excelforlooping {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		File file= new File("./File input/Practice1.xlsx");
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbookFactory().create(fis);
		Sheet s =wb.getSheetAt(0);
		int rowcount =s.getLastRowNum();
		for(int i=0; i<=rowcount; i++) {
			//System.out.println(rowcount);
			Row r= s.getRow(i);
		int cellcount=r.getPhysicalNumberOfCells();
		for(int j=0; j<=cellcount; j++) {
	     Cell c=r.getCell(j);{
	   //String data=  c.getRow().getStringCellValue()
		//if(data=="k098") {
			
		}
	     
	     System.out.print("||  "+" "+c);
		}
		
		System.out.println("  ");
		}
		
		

	}
	
		
			
		}
//}
