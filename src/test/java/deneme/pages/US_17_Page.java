package deneme.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import deneme.utilities.Driver;

public class US_17_Page {

    public US_17_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[.='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//*[.='User management']")
    public WebElement userManagement;

   // @FindBy(xpath = "//tbody//tr[11]//td[6]")
   // public WebElement rollUser;

    @FindBy(xpath = "(//*[.='ROLE_USER'])[1]")
    public WebElement rollUser;

    @FindBy(xpath = "//*[.='View']")
    public WebElement viewButton;

    @FindBy(xpath = "//*[.='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//*[.='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[.='Cancel']")
    public WebElement cancelButton;

}
