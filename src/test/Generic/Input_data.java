package test.Generic;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ganesh on 29-01-2019.
 */
public class Input_data
{
    public void readExcel(String filePath, String fileName, String sheetName)
    {
        //File file = new File(filePath);
        try
        {
            FileInputStream inputsteram = new FileInputStream(filePath);
            Workbook dataWorkbook = null;
            String fileExtensionName = fileName.substring(fileName.indexOf("."));
            if (fileExtensionName.equals(".xlxs"))
            {
                dataWorkbook = new XSSFWorkbook(inputsteram);
            }
            else if (fileExtensionName.equals(".xls"))
            {
                dataWorkbook = new HSSFWorkbook(inputsteram);
            }
            Sheet dataSheet = dataWorkbook.getSheet(sheetName);

            int totalNoOfColumns = dataSheet.getRow(0).getLastCellNum();
            int totalNoOfRows = dataSheet.getLastRowNum();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
