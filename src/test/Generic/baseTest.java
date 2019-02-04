package test.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by ganesh on 17-12-2018.
 */
public abstract class baseTest implements AutoConstant
{
    public WebDriver driver;
    static
    {
        System.setProperty(chromeKey,chromeValue);
        System.setProperty(geckoKey,geckoValue);
    }
    @BeforeMethod()
    public void beforeMethod()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://wwww.facebook.com");
    }
    @AfterMethod()
    public void afterMethod(ITestResult res)
    {
        int status = res.getStatus();
        String name = res.getMethod().getMethodName();
        if (status == 2)
        {
            getScreenshot.getImages(driver,name);
        }
        driver.close();
    }
}
