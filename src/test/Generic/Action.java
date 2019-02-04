package test.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by ganesh on 30-12-2018.
 */
public class Action
{
    public static void doubleClick(WebDriver driver, WebElement target)
    {
        Actions a = new Actions(driver);
        a.doubleClick(target);
    }
    public static void contextClick(WebDriver driver, WebElement target)
    {
        Actions a = new Actions(driver);
        a.contextClick(target);
    }
}
