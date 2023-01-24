package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TechGlobalLoginFormPage extends TechGlobalBasePage {
    public TechGlobalLoginFormPage() {
        super();
    }

    @FindBy(id = "main_heading")
    public WebElement mainHeading;

    @FindBy(css = "label[for='username']")
    public WebElement usernameLabel;

    @FindBy(id = "username")
    public WebElement usernameInputField;

    @FindBy(css = "label[for='password']")
    public WebElement passwordLabel;

    @FindBy(id = "password")
    public WebElement passwordInputField;

    @FindBy(id = "login_btn")
    public WebElement loginButton;

    @FindBy(id = "forgot-password")
    public WebElement forgotPasswordLink;
}
