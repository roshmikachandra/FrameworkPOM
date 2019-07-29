package com.facebook.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	//read test data from the excel file
	XSSFWorkbook wb;
	
	public ExcelDataProvider() 
	{
		File src= new File ("./TestData/TestData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			System.out.println("Cannot read data"+e.getMessage());
			
		
		}
		
	}
	
	public String getStringData(int sheetNum, int row, int col)
	
	{
		return wb.getSheetAt(sheetNum).getRow(row).getCell(col).getStringCellValue();
		
	}
	
	public double getNumericData(String sheetName, int row, int col)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(col).getNumericCellValue();
	}
	
	public int getRowCount(int sheetIndex)
	{
		int row= wb.getSheetAt(sheetIndex).getLastRowNum();
		row=row+1;
		return row;
	}
	
	
	
	
}
