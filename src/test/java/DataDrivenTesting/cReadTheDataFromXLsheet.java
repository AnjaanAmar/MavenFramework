package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class cReadTheDataFromXLsheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream File = new FileInputStream("./src/test/resourse/Details.xlsx");
	Workbook XL = WorkbookFactory.create(File);
	Sheet Sheet = XL.getSheet("sheet1");
	Row Row = Sheet.getRow(1);
	Cell Cell = Row.getCell(0);
	 String Name = Cell.getStringCellValue();
	 System.out.println(Name);
	 org.apache.poi.ss.usermodel.Cell cell2 = Row.getCell(1);
	 long Number = (long)cell2.getNumericCellValue();
	 System.out.println(Number);
	org.apache.poi.ss.usermodel.Cell cell3 = Row.getCell(2);
	String Email = cell3.getStringCellValue();
	System.out.println(Email);
	org.apache.poi.ss.usermodel.Row Row2 = Sheet.getRow(2);
	org.apache.poi.ss.usermodel.Cell Cell0 = Row2.getCell(0);
	String Messi = Cell0.getStringCellValue();
	System.out.println(Messi);
	org.apache.poi.ss.usermodel.Row Row3 = Sheet.getRow(3);
	org.apache.poi.ss.usermodel.Cell cell9 = Row3.getCell(1);
	long Num = (long)cell9.getNumericCellValue();
	System.out.println(Num);
	org.apache.poi.ss.usermodel.Row Sac = Sheet.getRow(4);
	org.apache.poi.ss.usermodel.Cell Ten = Sac.getCell(2);
	String EmailId = Ten.getStringCellValue();
	System.out.println(EmailId);
}
}
