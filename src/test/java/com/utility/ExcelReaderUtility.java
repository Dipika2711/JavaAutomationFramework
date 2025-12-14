package com.utility;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojo.User;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;



public class ExcelReaderUtility {
	public static Iterator<User> readExcelFile(String fileName) {
		File xlsxFile = new File(System.getProperty("user.dir")+"//testData//"+fileName);
		

		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(xlsxFile);
		
		List<User> userList =  new ArrayList<User>();
		Row row;
		Cell emailAddressCell;
		Cell passwordCell;
		User user;
		
		XSSFSheet xssfsheet = xssfWorkbook.getSheet("LoginTestData");
		Iterator<Row>rowIterator= xssfsheet.iterator();
		rowIterator.next();

		while(rowIterator.hasNext()) {
			
			 row =rowIterator.next();
			 emailAddressCell = row.getCell(0);
			 passwordCell = row.getCell(0);
			 user= new User(emailAddressCell.toString(),passwordCell.toString());
			userList.add(user);
			System.out.println(emailAddressCell.toString());
			System.out.println(passwordCell.toString());

			
			
			
		}
		return  userList.iterator;
		
		
		xssfWorkbook.close();
	}
	
	
	
	
	

}
