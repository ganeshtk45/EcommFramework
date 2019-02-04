package test.Scripts;

import com.theoryinpractice.testng.util.TestNGUtil;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.Generic.baseTest;
import test.utilities.loginUtilities;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ganesh on 06-01-2019.
 */

public class test extends baseTest
{
    @DataProvider
    public Iterator<Object[]> getTestData()
    {
        ArrayList<Object[]> testData = loginUtilities.getDataFromExcel();
        return testData.iterator();
    }

    @Test(dataProvider = "getTestData")
    public void loginScript(String Username, String Password)
    {
        driver.findElement(By.id("email")).sendKeys(Username);
        driver.findElement(By.id("pass")).sendKeys(Password);
    }
}
