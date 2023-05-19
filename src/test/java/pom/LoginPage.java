package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

    private By user_name_input = By.id("user-name");
    private By password_input = By.id("password");
    private By login_button = By.id("login-button");

    private By message_error_lbl = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");


    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void enterCredentials(String username, String password) throws Exception {
        this.sendKeysToWebElement(user_name_input, username);
        this.sendKeysToWebElement(password_input, password);
        this.clickToElement(login_button);
    }

    public Boolean validateLogin() throws Exception {
        return this.isDisplayed(login_button);
    }

    public Boolean validateMessageError() throws Exception {
        return this.isDisplayed(login_button);
    }

}
