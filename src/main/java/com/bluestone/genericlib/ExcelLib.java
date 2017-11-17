package com.bluestone.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;
/**
 * 
 * @author Snehal
 *
 */

public class ExcelLib
{
	public String getExcelData(String sheetName, int rowNum, int columnNum) throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Excel 2013");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.getRow(rowNum);
		String Data = rw.getCell(columnNum).getStringCellValue();
		wb.close();
		return Data;
	}
	public void setExcelData(String sheetName, int rowNum, int columnNum, String data) throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Excel 2013");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row rw = sh.getRow(rowNum);
		Cell cel = rw.createCell(columnNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Excel 2013");
		wb.write(fos);
		wb.close();
		
	}

}







