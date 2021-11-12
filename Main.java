import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe"); //подключили драйвер для управления браузером Chrome
//        WebDriver driver = new ChromeDriver(); //создали экземпляр класса
//
//        Задаем неявное ожидание 10 сек:
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //но метод ImplicityWait c TimeUnit уже устарел. Можно задать это же по-другому:
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        Теперь зададим явное ожидание в 10 секунд появления этого объекта (по локатору):
//        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));
//
//        сначала просто запустим браузер и откроем сайт гугл:
//        driver.get("https://google.com");
//
//        Найдем какой-нибудь элемент на странице - создаем переменную WebElement с любым именем (тут input) и методом поиска эл-та:
//        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));
//
//        теперь кликнем на найденный элемент:
//        input.click();
//        Можно найти сразу несколько элементов на странице:
//        WebElement inputs = driver.findElements()

        //СВОЙСТВА АТРИБУТОВ

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver myDriver = new ChromeDriver();
        myDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        myDriver.get("https://www.avito.ru/rossiya/avtomobili");
//
//        WebElement audiElement = myDriver.findElement(By.xpath("(//a[@title='Audi'])[1]"));
//        String parameter = audiElement.getAttribute("offsetTop"); //чтобы узнать значение какого-то св-ва (вкладка Properties в DevT)
//        System.out.println("Запрашиваемый параметр = " + parameter);

        //МЕТОД НАЙДИ ТЕКСТ
//        WebElement elementNumber = myDriver.findElement(By.cssSelector(".popular-rubricator-count-CX8Mx"));
//        String output = elementNumber.getText();
//        System.out.println("Текст элемента: " + output);

        //ТЕСТИРОВАНИЕ ВЕРСТКИ
//        myDriver.get("https://headache.ru/");
//        WebElement element = myDriver.findElement(By.xpath("//div[text()='Запись на приём']"));
//        String output = element.getCssValue("display");
//        element.click(); //кликнуть по элементу

        //МЕТОД ДЛЯ ВВОДА В ПОЛЕ
//        myDriver.get("https://www.udemy.com/");
//        WebElement element = myDriver.findElement(By.xpath("//input[@name='q']"));
//        element.sendKeys("Java", Keys.ENTER); //ввели в поле слово и нажали кнопку Enter

        //БОЛЕЕ СЛОЖНЫЕ ДЕЙСТВИЯ ЧЕРЕЗ КЛАСС ACTIONS
//        Сначала все делали как обычно, а чтобы вставить задержку, нужно было облачить её в try-catch. И туда в try мы перенесли и запуск сайта, и поиск элемента
//        try {
//            myDriver.get("https://crossbrowsertesting.github.io/drag-and-drop");
//            Thread.sleep(2000); //задержка в 2 сек после запуска сайта, чтобы он всё отобразил
//
//            WebElement element = myDriver.findElement(By.id("draggable"));
//            WebElement element1 = myDriver.findElement(By.id("droppable"));
//
//            Actions action = new Actions(myDriver);
//            action.moveToElement(element).clickAndHold().moveToElement(element1).release().build().perform();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } finally {
//            Thread.sleep(20000); //задержка в 20 сек после выполнения кода, чтобы он сам закрылся
//            myDriver.quit(); //чтобы драйвер отключился и закрыл окно
//        }

        //ОЖИДАНИЕ ИСЧЕЗНОВЕНИЯ ЭЛЕМЕНТА ИЗ DOM
//        WebDriverWait wait = new WebDriverWait(myDriver, Duration.ofSeconds(10));
//
//        try {
//            myDriver.get("https://pagination.js.org/");
//            Thread.sleep(2000); //задержка в 2 сек после запуска сайта, чтобы он всё отобразил
//
//            List<WebElement> elements = myDriver.findElements(By.xpath("//div[@class='data-container']/ul/li")); //забираем все элементы, поэтому засовываем их в Лист
//            List<WebElement> pages = myDriver.findElements(By.xpath("//div[@class='paginationjs-pages']/ul/li")); //забираем все страницы, поэтому засовываем их в Лист
//
//            String output = elements.get(5).getText(); //выведем элемент
//            System.out.println("Элемент до перелистывания страницы: " + output);
//
//            теперь нужно переключить страницу на 2ю, поэтому берем из листа 2й элемент и кликаем по нему
//            pages.get(2).click();
//            но Selenium может это так быстро сделать, поэтому нам нужно подождать, пока появится эта новая информация на экране - то есть уйдет старая
//            wait.until(ExpectedConditions.stalenessOf(elements.get(5))); //ждем, пока уйдет 6й элемент на странице
//            теперь в Листе elements нужно сохранить новую информацию
//            elements = myDriver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
//
//            output = elements.get(5).getText(); //еси все правильно, теперь это должен быть элемент 16
//            System.out.println("Элемент после перелистывания страницы: " + output);
//
//        } catch (InterruptedException e) {
//        e.printStackTrace();
//        } finally {
//        Thread.sleep(20000); //задержка в 20 сек после выполнения кода, чтобы он сам закрылся
//        myDriver.quit(); //чтобы драйвер отключился и закрыл окно
//        }

        //РАБОТА С МОДАЛЬНЫМИ ОКНАМИ
//        WebDriverWait wait = new WebDriverWait(myDriver, 1000);
//        try {
//        myDriver.get("https://xxxxxxxxxxxxx");
//        Thread.sleep(5000);
//
//        WebElement element = myDriver.findElement(By.id("a"));
//        WebElement element2 = myDriver.findElement(By.id("b"));
//        WebElement element3 = myDriver.findElement(By.id("c"));
//
//        element.click();
//
//             Alert alert = wait.until(alertIsPresent());
//             alert.accept(); //это нажатие на кнопку ОК всплывающего окна
//
//             Alert prompt = wait.until(alertIsPresent());
//             prompt.sendKeys("Super!"); //это ввод текста во всплывающее окно
//             prompt.accept(); //это нажатие на кнопку ОК всплывающего окна
//
//             Alert alert2 = wait.until(alertIsPresent());
//             Thread.sleep(2000);
//             alert2.accept();
//
//             element3.click();
//            Alert alert3 = wait.until(alertIsPresent());
//            alert3.dismiss(); //это кнопка отмена
//
//        } catch (InterruptedException e) {
//        e.printStackTrace();
//         } finally {
//        Thread.sleep(20000); //задержка в 20 сек после выполнения кода, чтобы он сам закрылся
//        myDriver.quit(); //чтобы драйвер отключился и закрыл окно
//        }

        //РАБОТА С ОКНАМИ И ВКЛАДКАМИ
//        WebDriverWait wait = new WebDriverWait(myDriver, Duration.ofSeconds(1000));
//        JavascriptExecutor js = (JavascriptExecutor) myDriver;
//
//        try {
//            myDriver.get("https://xxxxxx");
//            Thread.sleep(5000);
//
//            String window1 = myDriver.getWindowHandle(); //сохраняем то окно, в котором сейчас работаем, в переменную window1
//            js.executeScript("window.open()"); //это нужно для того, чтобы открыть новое окно, так как в Selenium такого метода нет. Теперь у нас открыто 2 окна
//
//            Set<String> currentWindows = myDriver.getWindowHandles(); //окна, которые мы открываем, сохраняем в набор строк
//            String window2 = null; //создаем переменную для второго окна
//
//            for (String window : currentWindows){ //перебираем все окна из списка
//                if (!window.equals(window1)){
//                    window2 = window; //сохраняем второе окно, отличное от первого
//                    break;
//                }
//            }
//
//            myDriver.switchTo().window(window2); //переключаемся на второе окно
//            myDriver.get("http://yyyyyy"); //во втором окне можем открыть уже какой-то новый урл и делать свои действия
//            myDriver.close(); //закрываем окно, но мы автоматически не перейдем на первую вкладку
//            myDriver.switchTo().window(window1); //вот так мы перешли на первое окно
//
//        } catch (InterruptedException e) {
//        e.printStackTrace();
//        } finally {
//        Thread.sleep(20000); //задержка в 20 сек после выполнения кода, чтобы он сам закрылся
//        myDriver.quit(); //чтобы драйвер отключился и закрыл окно
//        }

        //ИМПОРТ ФАЙЛА

//        WebDriverWait wait = new WebDriverWait(myDriver, Duration.ofSeconds(1000));
//        JavascriptExecutor js = (JavascriptExecutor) myDriver;
//
//        try {
//            myDriver.get("https://xxxxxx");
//            Thread.sleep(5000);
//
//            WebElement downloader = myDriver.findElement(By.xpath("//input[@type='file']"));
//
//            js.executeScript("document.querySelector('//input[@type='file']').setAttribute('style', 'opacity:1')"); //применяем скрипт, чтобы изменить стиль окна для импорта (сделать его видимым)
//            //так необх.сделать еще с некоторыми атрибутами, потом найти элемент по локатору, передать файл через sendKeys()
//
//        } catch (InterruptedException e) {
//        e.printStackTrace();
//        } finally {
//        Thread.sleep(20000); //задержка в 20 сек после выполнения кода, чтобы он сам закрылся
//        myDriver.quit(); //чтобы драйвер отключился и закрыл окно
//        }

        //ASSERT ПРОВЕРКИ

        WebDriverWait wait = new WebDriverWait(myDriver, Duration.ofSeconds(1000));

        try {
            myDriver.get("https://xxxxxx");
            Thread.sleep(5000);

            String title = myDriver.getTitle();

            Assert.assertEquals(title, "Document"); //здесь мы задаем актуальный результат и результат, который мы ожидаем (сначала actual, потом expected result)
            //например, здесь мы проверяем, соответствует ли заголовок страницы слову "Document"



        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(20000); //задержка в 20 сек после выполнения кода, чтобы он сам закрылся
            myDriver.quit(); //чтобы драйвер отключился и закрыл окно
        }











    }
}
