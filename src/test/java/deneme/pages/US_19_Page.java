package deneme.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import deneme.utilities.Driver;

public class US_19_Page {

    public US_19_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//*[.='Manage Accounts']")
    public WebElement manageAccounts;

    @FindBy(id = "jh-create-entity")    //       // a[@id='jh-create-entity']
    public WebElement createNewAccount;

    @FindBy(id = "tp-account-description")
    public WebElement description;

    @FindBy(id = "tp-account-balance")
    public WebElement balance;

    @FindBy(id = "tp-account-accountType")
    public WebElement accountTypeDropdown;

    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusType;

    @FindBy(id = "tp-account-createDate")
    public WebElement createDate;

    @FindBy(id = "tp-account-closedDate")
    public WebElement closeDate;

    @FindBy (xpath = "//*[.='Save']")
    public WebElement saveButton;


}
