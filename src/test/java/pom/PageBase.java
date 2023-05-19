package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {

    private WebDriver driver;

    public PageBase(WebDriver driver){
        this.driver = driver;
    }

    public void sendKeysToWebElement (By element,String value) throws Exception {
        try{
            WebElement webElement = driver.findElement(element);
            if(webElement != null){
                webElement.sendKeys(value);
            }else{
                throw new Exception("No se encontró el elemento: "+ element);
            }
        } catch (Exception e) {
            throw new Exception("No se pudo enviar las teclas sobre el elemento: " + element + " Error" + e.getMessage());
        }
    }

    public Boolean isDisplayed(By element) throws Exception {
        try{
            return driver.findElement(element).isDisplayed();
        }catch (Exception e) {
            throw new Exception("No se pudo visualizar el elemento: " + element + " Error" + e.getMessage());
        }
    }

    public void clickToElement(By element) throws Exception {
        try{
             driver.findElement(element).click();
        }catch (Exception e) {
            throw new Exception("No se pudo dar click al elemento: " + element + " Error" + e.getMessage());
        }
    }

    public String getTextToElement(By element) throws Exception {
        try{
            return driver.findElement(element).getText();
        }catch (Exception e) {
            throw new Exception("No se traer el texto del elemento: " + element + " Error" + e.getMessage());
        }
    }
}
