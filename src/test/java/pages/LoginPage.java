package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }




    //@FindBy(id ="account-menu")
    //public WebElement loginIcon;

    @FindBy(id = "account-menu")
    public WebElement loginIcon;

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(xpath ="//span[contains(text(),'Sign in')]")
    public WebElement signInLink;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath ="//a[@href='/logout']")
    public WebElement signOut;

    @FindBy(xpath="//button[@class='btn btn-secondary']")
    public WebElement cancelButton;





}
