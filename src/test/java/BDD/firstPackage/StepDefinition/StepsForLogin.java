package BDD.firstPackage.StepDefinition;

import BDD.firstPackage.Pages.ValidLoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class StepsForLogin {
  public WebDriver driver;

    @Given(": user launches browser")
    public void user_launches_browser() {
       System.setProperty("webdriver.chrome.driver", "C:/Pragra/Downloaded tools/all Webdrivers/chromedriver.exe");
       driver= new ChromeDriver();
    }
    @When(": user opens link {string}")
    public void user_opens_link(String string) {
        driver.get("https://www.amazon.ca/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, SECONDS);
    }
    @When(": user clicks HelloSignIn tab")
    public void user_clicks_hello_sign_in_tab() throws InterruptedException {
        ValidLoginPage login1 = new ValidLoginPage(driver);
        login1.getHelloSignIn();

    }
    @When(": user enters valid email as {string} , clicks continue")
    public void user_enters_valid_email_clicks_continue(String email) {
        ValidLoginPage login1 = new ValidLoginPage(driver);
        login1.getEmail(email)
              .getcontinueBtn();
    }
    @When(": user enters valid password as {string}, clicks submit")
    public void user_enters_valid_password_clicks_submit(String password) {
        ValidLoginPage login1 = new ValidLoginPage(driver);
        login1.getpassword(password)
                .getsubmitBtn();
    }
    @Then(": homepage after sign in is seen with title {string}")
    public void homepage_after_sign_in_is_seen(String title) {
        title= driver.getTitle();
        Assert.assertEquals("Amazon Sign In", title);
    }

    @Then(": browser is closed")
    public void browser_is_closed() {
       driver.quit();
    }
}
