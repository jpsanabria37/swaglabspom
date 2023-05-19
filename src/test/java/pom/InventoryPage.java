package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends PageBase {

    private By title_label = By.xpath("//*[@id=\"header_container\"]/div[2]/span");


    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public Boolean validateTitle(String title) throws Exception {
        return this.getTextToElement(title_label) .equals(title);
    }
}
