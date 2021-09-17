package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.dashboardPage;
import pageobjects.signInPage;

public class loginSteps {

    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
    }


    @Given("^I am at SmartPyme Marketing Web Site$")
    public void openPage(){
        driver.manage().window().maximize();
        driver.get("https://enterprise-smartpyme-int.azurewebsites.net/");
    }

    @When("^I write my username \"([^\"]*)\"$")
    public void writeUsername(String username){
        signInPage signInElements = new signInPage(driver);
        signInElements.writeUserName(username);
    }

    @And("^I write my password \"([^\"]*)\"$")
    public void writePassword(String password){
        signInPage signInElements = new signInPage(driver);
        signInElements.writePassword(password);
    }

    @And("^I select the Sign In Button$")
    public void clickSignIn(){
        signInPage signInElements = new signInPage(driver);
        signInElements.clickSignIn();
    }

    @Then("^I verify what the label Admistration is \"([^\"]*)\"$")
    public void verifyLabelAdministration(String admin){
        dashboardPage dashboardElements = new dashboardPage(driver);

        String actual = dashboardElements.getAdministrationName();;
        String expected = admin;

        Assert.assertEquals(actual,expected,"Text Erroneo");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
