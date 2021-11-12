import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileImport {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("https://yapx.ru/");
            driver.manage().window().maximize();
            Thread.sleep(5000);

            WebElement downloader = driver.findElement(By.xpath("//input[@type='file']"));

            js.executeScript("document.querySelector('//input[@type='file']').setAttribute('style', 'display: block')");
            WebElement inputFile = driver.findElement(By.id("upload-input"));
            inputFile.sendKeys("C:\\Users\\light\\Pictures\\Screenpresso\\2021-08-20_11h30_54.png");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(20000); //задержка в 20 сек после выполнения кода, чтобы он сам закрылся
            driver.quit(); //чтобы драйвер отключился и закрыл окно
        }


    }
}
