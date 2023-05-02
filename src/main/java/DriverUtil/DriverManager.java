package DriverUtil;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver ref) {
        driver = ref;
    }
}
