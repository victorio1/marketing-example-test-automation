package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signInPage {

    WebDriver driver;

    // Constructor

    public signInPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver,this);
    }

    // Locators

    @FindBy(id = "userOrEmail")
    private WebElement txtboxusername;

    @FindBy(id = "password")
    private WebElement txtboxpassword;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement buttonsignin;

    // Actions

    public void writeUserName(String username){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(txtboxusername));
        txtboxusername.sendKeys(username);
    }

    public void writePassword(String password){
        WebDriverWait wait = new WebDriverWait(driver,1000);
        wait.until(ExpectedConditions.visibilityOf(txtboxpassword));
        txtboxpassword.sendKeys(password);
    }

    public void clickSignIn(){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.visibilityOf(buttonsignin));
        buttonsignin.click();
    }



}
