package Pages;

import DriverUtil.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Login {
    private By loginEmail = By.id("Email");
    private By loginPass = By.id("Password");
    private By loginButton = By.xpath("//button[@class=\"button-1 login-button\"]");

    private By logoutButton = By.linkText("Log out");
    public void insertEmail(String email){
        DriverManager.getDriver().findElement(loginEmail).sendKeys(email);
    }
    public void insertPass(String pass){
        DriverManager.getDriver().findElement(loginPass).sendKeys(pass);
    }
    public void clickLogin(){
        DriverManager.getDriver().findElement(loginButton).click();
    }
    public boolean logoutExist() {
        List<WebElement> elements = DriverManager.getDriver().findElements(loginButton);
        boolean bool = false;
        if (elements.size() != 0) {
            bool = true;
        }
        return bool;
    }

}
