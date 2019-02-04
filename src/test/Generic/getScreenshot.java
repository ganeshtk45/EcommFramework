package test.Generic;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;

/**
 * Created by ganesh on 30-12-2018.
 */
public class getScreenshot
{
    public static void getImages(WebDriver driver, String name)
    {
        TakesScreenshot t = (TakesScreenshot)driver;
        File source = t.getScreenshotAs(OutputType.FILE);
        File dest = new File("F:\\Java\\Selenium Projects\\Images"+name+".png");
        try {
            FileUtils.copyFile(source,dest);
        } catch (IOException e) {
            Reporter.log("Screenshot not captured",true);
        }
    }
}
