import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeadacheDoctor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://headache.ru/");
        driver.manage().window().maximize(); //развернуть окно браузера


        WebElement zapis = driver.findElement(By.xpath("//div[text()='Запись на приём']"));
        zapis.click();
        //далее необходимо немного подождать, пока появится еще одно окно, так как Java быстрее браузера
        WebElement doctor = (new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@onclick='ShowDoctorPopup(1255);']"))));
        doctor.click();
        WebElement day = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-date='20210930']"))));
        day.click();
        //WebElement time = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-time='1900']")))); //не нажимается.
        // Скорее всего, он не в DOM
        //time.click();
        WebElement phone = driver.findElement(By.xpath("//input[@placeholder='+7 (ХХХ) ХХХ-ХХ-ХХ']"));
        phone.sendKeys("9835557889");



    }
}
