package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Write {
public static void writedata() throws IOException {
	File f = new File("C:\\Users\\SSD-ADMIN\\eclipse-workspace\\Maven_Project\\Excel\\Data_write.xlsx"); 
	FileInputStream f1 = new FileInputStream(f);
	Workbook wa = new XSSFWorkbook(f1);
Sheet createSheet = wa.createSheet("data");
Row createRow = createSheet.createRow(0);
Cell createCell = createRow.createCell(0);
createCell.setCellValue("kholi");
wa.getSheet("data").getRow(0).createCell(1).setCellValue("100");
wa.getSheet("data").getRow(0).createCell(2).setCellValue("run");
wa.getSheet("data").createRow(1).createCell(0).setCellValue("dhoni");
wa.getSheet("data").getRow(1).createCell(1).setCellValue("50");
wa.getSheet("data").getRow(1).createCell(2).setCellValue("run");
FileOutputStream fos = new FileOutputStream(f);
wa.write(fos);
}
public static void main(String[] args) throws IOException {
	writedata();
}
}
