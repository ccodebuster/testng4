package com.nopcommerce.testng;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class ParamterDemo extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test (dataProvider = "loginData", dataProviderClass = TestData.class)
    public void verifyingLoginToNopCommerce(String username, String password){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
    }


    @Test
    @Parameters({"first-name", "sur-name"})
    public void displayName(String name, String surname){
        System.out.println(name);
        System.out.println(surname);
    }

}
