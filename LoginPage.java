import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver = new ChromeDriver();

    WebElement loginInput = driver.findElement(By.id("login"));
    WebElement passwordInput = driver.findElement(By.id("pass"));
    WebElement enterButton = driver.findElement(By.id("enter"));

    public void loginMethod(String login, String pass){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(pass);
        enterButton.click();
    }



}
