package title;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {

	public static void main(String[] args) throws Exception {
		//abc();
		
		
	
		
		
		
		
		
	
		//rdex.writeexcel(0, 1, 3,"notPass");
		
		
		//rdex.writeexcel(0, 2, 3, "pass");
		
		
	
		
				 
	}
	static void abc() {
		WebDriver driver =new EdgeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		System.out.println(title);
		 String cWIND =driver.getWindowHandle();
		 System.out.println(cWIND);
		 if(cWIND==cWIND) {
			 System.out.println("yes it's true");
		 }else {
			 System.out.println("no it's not true");
		 }
		 
		  Set<String>  winds =driver.getWindowHandles();
		  System.out.println(winds);
		 
		String mWIND= driver.getPageSource();
		System.out.println(mWIND);
	}
   public String Readexcel(int sheetindex, int rnum , int cnum) throws Exception {
	   String Data ="";
	   
	   File file = new File("./File input/Practice1.xlsx");
	   FileInputStream fis =new FileInputStream(file);
	   Workbook wb= WorkbookFactory.create(fis);
	   Sheet sh= wb.getSheetAt(sheetindex);
	   Row r= sh.getRow(rnum);
	   Cell cl =r.getCell(cnum);
	   Data = cl.getStringCellValue();
	   
	   return Data;
		
	}
	public void writeexcel(int sheetindex, int rnum ,int cnum, String data) throws Exception {
		File file = new File("./File input/Practice1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh= wb.getSheetAt(sheetindex);
		Row rw=sh.getRow(rnum);
		
		Cell cl =rw.createCell(cnum);
		cl.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("./Fileoutput/output.xlsx");
		wb.write(fos);
	}
	 public static String Readexcelconsole(int sheetindex, int rnu , int cnu) throws Exception {
		   String Data ="";
		   
		   File file = new File("./File input/Practice1.xlsx");
		   FileInputStream fis =new FileInputStream(file);
		   Workbook wb= WorkbookFactory.create(fis);
		   Sheet sh= wb.getSheetAt(sheetindex);
		int rnu1= sh.getPhysicalNumberOfRows();
		for(int i=0; i<rnu1; i++) {
			Row r=sh.getRow(i);
			int cnu1=r.getPhysicalNumberOfCells();
			for(int j=0; j<cnu1; j++) {
				Cell c=r.getCell(j);
			}
		}
		return Data;
 }

	
}