package deneme.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import deneme.utilities.Driver;

public class GlbTrader_Pages {
    public GlbTrader_Pages(){
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(linkText = "Sign In")
    public WebElement signInButton;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@value='Login']")
    public WebElement logInButton;

    @FindBy (linkText = "Welcome deneme375")
    public WebElement deneme375Dogrulama;

    @FindBy(linkText = "Logout")
    public WebElement logOut;


    @FindBy(xpath = "//select[@id='header_search_category']")
    public WebElement allCategoriesDropDown;

    @FindBy(xpath = "//button[@class='btn btn-warning']")
    public WebElement searhButton;

    @FindBy(xpath = "(//div[@class='img-box'])[1]")
    public WebElement ilkUrun;

}
