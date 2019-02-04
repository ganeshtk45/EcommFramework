package test.utilities;

import java.util.ArrayList;

/**
 * Created by ganesh on 30-01-2019.
 */
public class loginUtilities
{
    static Xls_Reader reader;
    public static ArrayList<Object[]> getDataFromExcel()
    {
        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        reader = new Xls_Reader("F:\\Java\\Selenium Projects\\Input\\Data.xlsx");
        for (int rowNum=2; rowNum<=reader.getRowCount("Test"); rowNum++)
        {
            String Username = reader.getCellData("Test","Username",rowNum);
            String Password = reader.getCellData("Test","Password",rowNum);

            Object ob[] = {Username, Password};
            myData.add(ob);
        }
        return myData;
    }

}
