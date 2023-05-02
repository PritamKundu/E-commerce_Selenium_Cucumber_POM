package DriverUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public static WebDriver wd;
    public static void initDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        wd = new ChromeDriver(options);
        DriverManager.setDriver(wd);
    }

    public static void tearDown(){

        DriverManager.getDriver().quit();
    }

//    public static void main(String[] args) throws InterruptedException {
//        initDriver();
//        DriverManager.getDriver().get("https://www.google.com/");
//        Thread.sleep(3000);
//        tearDown();
//    }
}
