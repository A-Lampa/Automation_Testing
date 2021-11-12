package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest {

    public ChromeDriver driver; //выносим, чтобы из всех тестов было видно driver
    public WebDriverWait wait;

    @Before //то, что нужно сделать перед началом любого теста - чтобы не повторять строчки в каждом
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe"); //определение пути до драйвера и его настройка
        driver = new ChromeDriver(); //создание экземпляра драйвера
        driver.manage().window().maximize(); //окно разворачивается на полный экран
        System.out.println("Test start");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //неявное ожидание в 10сек для ожидания появления элемента
        wait = new WebDriverWait(driver, Duration.ofSeconds(1000)); //явное ожидание в 10сек (понадобится дальше)
    }

    @Test
    public void firstTest(){
        driver.get("https://www.delivery-club.ru");

        //проверим, что мы находимся на нужной странице - сравним тайтлы
        String titleActual = driver.getTitle();
        Assert.assertTrue(titleActual.equals("Delivery Club — Доставка еды и продуктов"));

        driver.quit();

    }

    @Test
    public void logIn() throws InterruptedException {
        driver.get("https://www.delivery-club.ru");
        Thread.sleep(2000); //задержка в 2 сек после запуска сайта, чтобы он всё отобразил

        WebElement entryButton = driver.findElement(By.xpath("//div[@class = 'header__buttons-container']"));
        entryButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='tel']")));
        WebElement phoneField = driver.findElement(By.xpath("//input[@type='tel']"));
        phoneField.sendKeys("9873090789");
        WebElement exit1 = driver.findElement(By.xpath("//div[@class='popup__close-button']"));
        exit1.click();


        WebElement shakshuchnaya = driver.findElement(By.xpath("//h3[@title='Меню ресторана Шакшучная']"));
        shakshuchnaya.click();
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='menu-product__img without-image lazyloaded']")));
        WebElement choice = driver.findElement(By.xpath("//div[@class='menu-product__img without-image lazyloaded']"));
        choice.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Укажите адрес доставки']")));
        WebElement address = driver.findElement(By.xpath("//input[@placeholder='Укажите адрес доставки']"));
        address.clear();
        address.sendKeys("Энгельс");
        }

    @After //то, что нужно сделать после выполнения любого теста - чтобы не повторять строчки в каждом
    public void close(){
        System.out.println("Test closed");
        //driver.quit();
    }

}


