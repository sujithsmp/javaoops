package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead
{
	XSSFSheet sh;
	public  ExcelRead() throws IOException
	{
		FileInputStream fp=new FileInputStream("C:\\Users\\Sujith\\git\\javaoops\\mymaven\\src\\main\\resources\\Book1.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(fp);
		sh=w.getSheet("Sheet1");
	}
	public void readExcel()
	{
		for(Row r:sh)
		{
			for(Cell c:r)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	public String readData(int i,int j)
	
	{
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int cellType=c.getCellType();
		switch(cellType)
		{
			case Cell.CELL_TYPE_STRING:
				String data=c.getStringCellValue();
				return data;
				
			case Cell.CELL_TYPE_NUMERIC:
				double number=c.getNumericCellValue();
				return String.valueOf(number);
				
			default:
				return null;
		}
	}

}
