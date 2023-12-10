package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "loginData")
    public static Object[][] createData() {
        Object[][] data = new Object[][]{
                {"test1@gmail.com", "123456"},
                {"test2@gmail.com", "123456"},
                {"test3@gmail.com", "123456"},
                {"test4@gmail.com", "123456"}
        };
        return data;
        /*return new Object[][] {

        };*/
    }

    @DataProvider(name = "loginData1")
    public static Object[][] createData1() {
        Object[][] data1 = new Object[][]{
                {"test1@gmail.com", 123456},
                {"test2@gmail.com", 123456},
                {"test3@gmail.com", 123456},
                {"test4@gmail.com", 123456}
        };
        return data1;
        /*return new Object[][] {

        };*/
    }
}


