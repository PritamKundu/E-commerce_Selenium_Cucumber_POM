package Pages;

import DriverUtil.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registation {
    WebDriver regDriver = DriverManager.getDriver();
    private By male = By.id("gender-male");
    private By female = By.id("gender-female");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By day_DOB = By.name("DateOfBirthDay");
    private By month_DOB = By.name("DateOfBirthMonth");
    private By year_DOB = By.name("DateOfBirthYear");
    private By email = By.name("Email");
    private By pass = By.name("Password");
    private By confPass = By.name("ConfirmPassword");
    private By registerButton = By.name("register-button");

    public void InsertName(String first, String last) {
        regDriver.findElement(firstName).sendKeys(first);
        regDriver.findElement(lastName).sendKeys(last);
    }

    public By getMale() {
        return male;
    }

    public By getFemale() {
        return female;
    }

    public void clKGender(By gender) {
        regDriver.findElement(gender).click();
    }

    public void dob(int date, int month, int year) {
        Select selectDay = new Select(regDriver.findElement(day_DOB));
        selectDay.selectByIndex(date);

        Select selectMonth = new Select(regDriver.findElement(month_DOB));
        selectMonth.selectByIndex(month);

        Select selectYear = new Select(regDriver.findElement(year_DOB));
        selectYear.selectByIndex(year);
    }

    public void insertEmail(String emailID) {
        regDriver.findElement(email).sendKeys(emailID);
    }

    public void InsertPass(String password) {
        regDriver.findElement(pass).sendKeys(password);
    }

    public void insertConfPass(String cnfPassword){
        regDriver.findElement(confPass).sendKeys(cnfPassword);
    }

    public void clkRegister() {
        regDriver.findElement(registerButton).click();
    }


}
