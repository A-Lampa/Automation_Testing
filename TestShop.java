import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestShop {

    public ChromeDriver driver; //выносим, чтобы из всех тестов было видно
    public WebDriverWait wait; //выносим, чтобы из всех тестов было видно

    @Before //то, что нужно сделать перед началом любого теста - чтобы не повторять строчки в каждом
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe"); //определение пути до драйвера и его настройка
        driver = new ChromeDriver(); //создание экземпляра драйвера
        driver.manage().window().maximize(); //окно разворачивается на полный экран

        System.out.println("Test start");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //неявное ожидание в 20сек для ожидания появления элемента
        wait = new WebDriverWait(driver, Duration.ofSeconds(1000)); //явное ожидание в 10сек (понадобится дальше)
        }

    @Test
    public void TestTitle(){
        driver.get("https://www.zarahome.com/ru/");

        //проверим, что мы находимся на нужной странице - сравним тайтлы
        String titleActual = driver.getTitle();
        Assert.assertTrue(titleActual.equals("Zara Home | Официальный сайт"));
        driver.quit();
        }

    @Test
    public void LogIn() throws InterruptedException{
        driver.get("https://www.zarahome.com/ru/");
        Thread.sleep(20000); //задержка в 20 сек после запуска сайта, чтобы он всё отобразил

        WebElement logInButton = driver.findElement(By.xpath("//div[@class = 'login-link']"));
        logInButton.click();

        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class = 'md-dialog-focus-trap']")));
        Thread.sleep(10000); //задержка в 10 сек после запуска сайта, чтобы он всё отобразил
        WebElement newAccountButton = driver.findElement(By.linkText("Создать новый аккаунт"));
        newAccountButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//md-content[@class = 'login-component _md']")));
        WebElement nameField = driver.findElement(By.xpath("//input[@id = 'createForm_namePerson']"));
        nameField.sendKeys("Anna's Test");
        WebElement emailField = driver.findElement(By.xpath("//input[@id = 'createForm_email']"));
        emailField.sendKeys("example@gmai.com");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id = 'createForm_password']"));
        passwordField.sendKeys("12345");
        WebElement eye = driver.findElement(By.xpath("//a[@class = 'icon-password-hidden']"));
        eye.click();
        WebElement readPolicy = driver.findElement(By.xpath("//div[@class = 'md-container']"));
        readPolicy.click();
        WebElement emailNews = driver.findElement(By.xpath("(//div[@class = 'md-container'])[2]"));
        emailNews.click();

    }
}
