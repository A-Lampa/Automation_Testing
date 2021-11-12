import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MainPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

        try {
            driver.get("https://xxxxxx");
            Thread.sleep(5000);

            LoginPage lp = new LoginPage();
            lp.loginMethod("admin", "admin1234");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(20000); //задержка в 20 сек после выполнения кода, чтобы он сам закрылся
            driver.quit(); //чтобы драйвер отключился и закрыл окно
        }
    }
}
