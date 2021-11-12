package TestNG;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

//    @DataProvider(name = "dbProvider")
//    public static Object[][] dbData (){
//        return new Object[][] {
//                {"from Anna", new Integer(1)},
//                {"Not Anna", new Integer(2)}
//        };
//    }

//    @Parameters({"db"}) //аннотация, обозначает, что мы передаем некие параметры вместе с тестом и используем в методе

//    @Test(groups = {"smokeTest", "regress"}, dataProvider = "dbProvider")//аннотация, обозначает, что это именно тест. Можно написать или к конкр.методу, или к конкр.классу

//    @Test
//    public void test1() { //от этого теста зависит тест 12, т.е. он должен выполняться только после этого теста
//        System.out.println("Test 1 from ");
//    }
//
//    @Test (dependsOnMethods = {"test1"},
//            alwaysRun = true) //выполнится, даже если первый тест не запустится
//    public void test12() {
//        System.out.println("Test 12 from ");
//    }


//    @Test(groups = {"regress"})
//    public void test11() {
//        System.out.println("Test 11");
//    }
//
//    @Test(groups = {"regress"})
//    public void test111() {
//        System.out.println("Test 111");
//    }

    //ПОВТОРНЫЙ ЗАПУСК ТЕСТОВ (РЕАЛИЗАЦИЯ В КОДЕ)

    @Test (retryAnalyzer = Retry.class) //передав класс Retry нашему тесту, мы обязали его выполняться 3 раза, если он упадет
    public void test1(){
        System.out.println("Test 1");
        Assert.fail(); //специально делаем ошибку, чтобы посмотреть на рез-т повторения
    }
//Создаем класс, который будет заниматься повторением наших тестов (в отдельном файле) - Retry:
}


