package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(id="register-title")
    public WebElement registrationPageTitle;

    @FindBy(id="ssn")
    public WebElement ssnInput;

    @FindBy(xpath = "//*[contains(text(),'Your SSN is required')]")
    public WebElement ssnRequiredMessage;


    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameInput;


    @FindBy(xpath = "//*[contains(text(),'Your First Name is required')]")
    public WebElement firstNameRequiredMessage;


    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//*[contains(text(),'Your Last Name is required')]")
    public WebElement lastNameRequiredMessage;


    @FindBy(id="address")
    public WebElement addressInput;


    @FindBy(xpath = "//input[@name='mobilephone']")
    public WebElement phoneNumberInput;


    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//*[contains(text(),'Your username is required')]")
    public WebElement usernameRequiredMessage;


    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;


    @FindBy(xpath = "//*[contains(text(),'Your email is required')]")
    public WebElement emailRequiredMessage;


    @FindBy(id = "firstPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[contains(text(),'Your password is required')]")
    public WebElement passwordRequiredMessage;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li)[1]")
    public WebElement strengthBar1;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li)[2]")
    public WebElement strengthBar2;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li)[3]")
    public WebElement strengthBar3;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li)[4]")
    public WebElement strengthBar4;

    @FindBy(xpath = "(//ul[@id='strengthBar']/li)[5]")
    public WebElement strengthBar5;


    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement secondPasswordInput;

    @FindBy(xpath = "//*[contains(text(),'Your confirmation password is required')]")
    public WebElement confirmationPasswordRequiredMessage;


    @FindBy(id = "register-submit")
    public WebElement registerButton;


    @FindBy(xpath ="//*[contains(text(),'Please check your email for confirmation')]")
    public WebElement successMessage;


}

