package test.Generic;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

/**
 * Created by ganesh on 30-12-2018.
 */
public class getData
{
    static String value;
    public static String getData(String path, String sheet, int row, int column)
    {
        try {
            FileInputStream f = new FileInputStream(path);
            Workbook book = WorkbookFactory.create(f);
            value = book.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
        }
        catch (Exception e)
        {

        }
        return value;
    }
}
