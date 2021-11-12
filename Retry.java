package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
    private int actualRetry = 0; //это счетчик - здесь лежит текуще кол-во повторений
    private static final int MAX_RETRY = 3; //это максимальное число наших повторений - неизменная переменная

    @Override
    public boolean retry (ITestResult result){
        if (actualRetry < MAX_RETRY){
            actualRetry++;
            return true;
        } else {
            return false;
        }
    }
}
