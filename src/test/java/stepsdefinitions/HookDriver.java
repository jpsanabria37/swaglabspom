package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HookDriver {

    private static WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");

        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com/");
    }
    @After
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
