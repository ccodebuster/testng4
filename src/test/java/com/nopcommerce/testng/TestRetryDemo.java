package com.nopcommerce.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryDemo {

    @Test
    public void test1(){
        System.out.println("i am test 1");
    }

    @Test
    public void test2(){
        System.out.println("i am test 2");
    }

    @Test(retryAnalyzer = RetryAnalyserDemo.class)
    public void test3(){
        System.out.println("i am test 3");
        Assert.assertTrue(false);
    }
}
