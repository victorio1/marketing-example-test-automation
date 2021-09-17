package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dashboardPage {

    WebDriver driver;

    // Constructor

    public dashboardPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver,this);
    }

    // Locators

    @FindBy(xpath = "//p[contains(text(),'ALAIN MARCEL MOSCOSO MORALES')]")
    private WebElement lblAdministrationName;

    // Actions

    public String getAdministrationName(){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.visibilityOf(lblAdministrationName));
        return lblAdministrationName.getText();
    }

}
