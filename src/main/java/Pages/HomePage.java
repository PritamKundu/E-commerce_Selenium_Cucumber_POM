package Pages;

import DriverUtil.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver drv = DriverManager.getDriver();
    private By currencySelector = By.id("customerCurrency");
    private By register = By.linkText("Register");
    private By logIn = By.linkText("Log in");
    private By wishList = By.linkText("Wishlist");
    private By cart = By.linkText("Shopping cart");
    private By seachBox = By.name("q");
    private By searchBtn = By.xpath("//button[text()=\"Search\"]");
//    private By catComp = By.linkText("Computers ");
//    private By catElect = By.linkText("Electronics ");
//    private By catApp = By.linkText("Apparel ");
//    private By catDig = By.linkText("Digital downloads ");
//    private By catBooks = By.linkText("Books ");
//    private By catJewel = By.linkText("Jewelry ");
//    private By catGifts = By.linkText("Gift Cards ");

    public Select getCurrency() {
        Select currency = new Select(drv.findElement(currencySelector));
        return currency;
    }

    public Registation clkRegister(){
        drv.findElement(register).click();
        return new Registation();
    }

    public Login clkLogin(){
        drv.findElement(logIn).click();
        return new Login();
    }
    public Cart ClkCart(){
        drv.findElement(cart).click();
        return new Cart();
    }

    public void SearchItem(String itemName){
        drv.findElement(seachBox).sendKeys(itemName);
        drv.findElement(searchBtn).click();
    }








}
