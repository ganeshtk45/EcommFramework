package test.Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by ganesh on 30-12-2018.
 */
public class select
{
    public static void selectByIndex(WebElement element, int index)
    {
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public static void selectByValue(WebElement element, String value)
    {
        Select select = new Select(element);
        select.selectByValue(value);
    }
}
