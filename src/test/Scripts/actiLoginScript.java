package test.Scripts;

import test.Generic.baseTest;
import test.Generic.getData;
import test.POM.actitimeLogin;
import org.testng.annotations.Test;

import static test.Generic.AutoConstant.excel;

/**
 * Created by ganesh on 19-11-2018.
 */
public class actiLoginScript extends baseTest
{
    @Test(groups = {"smoke"})
    public void loginScript()
    {
        actitimeLogin ob = new actitimeLogin(driver);
        ob.setUsernameTextbox(getData.getData(excel,"sheet1",0,1));
        ob.setPasswordTextbox(getData.getData(excel,"sheet1",1,1));
        ob.clickLogin();
        ob.titleWait("actiTIME - Enter Time-Track");
    }
}
