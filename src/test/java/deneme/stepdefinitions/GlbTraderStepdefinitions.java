package deneme.stepdefinitions;

import deneme.pages.GlbTrader_Pages;
import deneme.utilities.ConfigReader;
import deneme.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class GlbTraderStepdefinitions {

    GlbTrader_Pages glbTrader_pages = new GlbTrader_Pages();

    @Given("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("gt_url"));
    }

    @Given("Sign In butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        glbTrader_pages.signInButton.click();
    }

    @Given("email textbox ina email girer")
    public void email_textbox_ina_email_girer() {
        glbTrader_pages.emailTextBox.sendKeys(ConfigReader.getProperty("gt_emailAdress"));
    }

    @Given("password textbox ina password girer")
    public void password_textbox_ina_password_girer() {
        glbTrader_pages.passwordTextBox.sendKeys(ConfigReader.getProperty("gt_Password"));
    }

    @Then("Login butonuna tiklar")
    public void login_butonuna_tiklar() {
        glbTrader_pages.logInButton.click();
    }

    @Then("hesabina basariyla girdigini test eder")
    public void hesabinaBasariylaGirdiginiTestEder() {
        Assert.assertTrue(glbTrader_pages.deneme375Dogrulama.isDisplayed());
    }

    @Then("kullanici All Categories dropDown indan Computer&Office kategorisini secer")
    public void kullaniciAllCategoriesDropDownIndanComputerOfficeKategorisiniSecer() {
        Select select = new Select(glbTrader_pages.allCategoriesDropDown);
        select.selectByValue("41");
    }

    @Then("kullanici arama butonuna tiklar")
    public void kullaniciAramaButonunaTiklar() throws InterruptedException {
        Thread.sleep(3000);
        glbTrader_pages.searhButton.submit();
    }

    @Then("kullanici ilk urune tiklar")
    public void kullaniciIlkUruneTiklar() throws InterruptedException {
        Thread.sleep(3000);
        glbTrader_pages.ilkUrun.click();
    }


    @Given("kullanici hesabina giris yaptiktan sonra LogOut butonuna tiklayarak cikar")
    public void kullaniciHesabinaGirisYaptiktanSonraLogOutButonunaTiklayarakCikar() {
        glbTrader_pages.logOut.click();
    }


    @And("hesaptan ciktigini test eder")
    public void hesaptanCiktiginiTestEder() {
        Assert.assertTrue(glbTrader_pages.signInButton.isDisplayed());
    }
/*
    @And("GlobalTrader Login")
    public void GlobalTraderLogin(){
        ReusableMethods.globalTraderSingIn();
    }
*/
    @And("dropDown")
    public void dropdown() {
        Select select = new Select(glbTrader_pages.allCategoriesDropDown);

        List<WebElement> kategoriSayisi = select.getOptions();

        System.out.println("kategori sayisi : " + kategoriSayisi.size());
        for (WebElement w: kategoriSayisi
             ) {
            System.out.println(w.getText());
        }


    }
}
