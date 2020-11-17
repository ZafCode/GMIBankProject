package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignPageElements {

    @FindBy(xpath = "//input[@name='username']")
    public static WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public static WebElement password;

    @FindBy(xpath = "//div[text()='Username cannot be empty!']")
    public static WebElement usernameCannotBeEmpty;

    @FindBy(xpath = "//div[text()='Password cannot be empty!']")
    public static WebElement passwordCannotBeEmpty;

    @FindBy(xpath = "//span[text()='Cancel']")
    public static WebElement cancelButton;

    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement signInButton;

    @FindBy(xpath = "//strong[text()='Failed to sign in!']")
    public static WebElement failedToSignIn;

    public SignPageElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
