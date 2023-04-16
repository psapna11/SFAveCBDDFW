package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class signin_page extends Config{
    public signin_page(WebDriver driver){
        PageFactory.initElements(driver,this);
        Config.driver=driver;
    }
    //locators
    @FindBy(how = How.ID,using = "email")
    public WebElement emaillocator;
    @FindBy(how = How.ID,using = "pw-input")
    public WebElement passwordlocator;
    @FindBy(how = How.XPATH, using = "//*[@id=/'sign-in/']")
    public WebElement Signinbuttonlocator;
    @FindBy(how = How.XPATH, using = "//*[@id=/'account-sect/']/section[1]/div/div/div[1]/div[1]")
    public WebElement loyaltyGreetingmessLocator;

//functions
    public void enterEmailAddress(String email){emaillocator.sendKeys(email);}
    public void enterPassword(String pass){passwordlocator.sendKeys(pass);}
    public void clickOnSigninButton(){Signinbuttonlocator.click();}
    public void verifyusersuccessfullylogin(){
        String act = loyaltyGreetingmessLocator.getText();
        String exp = "greeting msg";
        Assert.assertEquals(act, exp);
    }
}