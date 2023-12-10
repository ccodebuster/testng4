package com.nopcommerce.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAssert {
  // hard assert
    @Test
    public  void  test1(){
        int a=5;
        int b = 6;
        int sum = a + b;
        System.out.println("test start");
        Assert.assertEquals(sum, 12);
        System.out.println("test end");
        System.out.println("I am rest of the code");

    }

    // soft assert
    @Test
    public  void  test2(){

        SoftAssert softAssert = new SoftAssert();
        int a=5;
        int b = 6;
        int sum = a + b;
        System.out.println("test start");
        softAssert.assertTrue(sum ==12);
        System.out.println("test end");
        System.out.println("I am rest of the code");
        softAssert.assertAll(); // log assertion

    }


}
