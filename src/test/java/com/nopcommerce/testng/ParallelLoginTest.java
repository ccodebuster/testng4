package com.nopcommerce.testng;

import com.nopcommerce.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelLoginTest extends Utility {

    //String browser = PropertyReader.getInstance().getProperty("browser");
    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser){
        selectBrowser(browser);
    }


    @Test
    public void test1(){

    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
