package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_09 {

    public US_09(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement loginIcon;

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
    @FindBy(linkText = "My Operations")
    public WebElement myOperations;
    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement manageCustomerButton;

    @FindBy(linkText = "Create a new Customer")
    public WebElement createNewCustomerButton;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/span[1]")
    public WebElement createorEditaCustomerText;

    @FindBy(xpath = "//input[@id='search-ssn']")
    public WebElement SSNtextbox;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/button[1]")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@id='tp-customer-firstName']")
    public WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-lastName']")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-middleInitial']")
    public WebElement middleInitialTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-mobilePhoneNumber']")
    public WebElement mobilePhoneTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-phoneNumber']")
    public WebElement phoneTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-zipCode']")
    public WebElement zipCodeTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-address']")
    public WebElement adressTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-city']")
    public WebElement cityTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-ssn']")
    public WebElement SsnTextBox;

    @FindBy(xpath = "//input[@id='tp-customer-createDate']")
    public WebElement createDateTextBox;

    @FindBy(xpath = "//select[@id='tp-customer-country']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//input[@id='tp-customer-state']")
    public WebElement stateTextBox;

    @FindBy(xpath = "//select[@id='tp-customer-user']")
    public WebElement userDropdown;

    @FindBy(xpath = "//select[@id='tp-customer-account']" )
    public WebElement accountDropdown;

    @FindBy(xpath = "//input[@id='tp-customer-zelleEnrolled']")
    public WebElement zelleCheckBox;

    @FindBy(xpath = "//a[@id='cancel-save']")
    public WebElement backButton;

    @FindBy(linkText = "Save")
    public WebElement saveButton;

}
