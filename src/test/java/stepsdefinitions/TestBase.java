package stepsdefinitions;

import org.openqa.selenium.WebDriver;
import pom.InventoryPage;
import pom.LoginPage;

public class TestBase {

    protected WebDriver driver = HookDriver.getDriver();

    protected LoginPage loginPage = new LoginPage(driver);
    protected InventoryPage inventoryPage = new InventoryPage(driver);

}
