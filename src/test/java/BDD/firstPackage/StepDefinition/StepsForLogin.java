package BDD.firstPackage.StepDefinition;

import BDD.firstPackage.Pages.ValidLoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
    @When(": user clicks signOut tab")
    public void user_clicks_sign_out_tab() {
        ValidLoginPage login1 = new ValidLoginPage(driver);

        Actions action = new Actions(driver);
        WebElement hover = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
        action.moveToElement(hover).perform();
        Actions action2 = new Actions(driver);
        WebElement logOut= driver.findElement(By.xpath("//*[contains(text(), 'Sign Out')] "));
        action2.moveToElement(logOut).click();
    }
    @Then(": previous sign it page is seen {string}")
    public void previous_sign_it_page_is_seen(String title2) {
    title2= driver.getTitle();
    Assert.assertEquals("Amazon.ca: Low Prices – Fast Shipping – Millions of Items", title2);
    }
    @Then(": browser is closed")
    public void browser_is_closed() {
       driver.quit();
    }
}
