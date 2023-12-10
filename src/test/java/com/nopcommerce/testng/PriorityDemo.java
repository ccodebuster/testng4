package com.nopcommerce.testng;

import org.testng.annotations.Test;

public class PriorityDemo {

    @Test (priority = 1)
    public void test1(){
        System.out.println(" i am test 1");
    }

    @Test(priority = 2)
    public void test3(){
        System.out.println(" i am test 3");
    }

    @Test (priority = 11)
    public void test2(){
        System.out.println(" i am test 2");
    }

}

