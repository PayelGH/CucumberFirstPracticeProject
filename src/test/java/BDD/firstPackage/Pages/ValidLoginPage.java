package BDD.firstPackage.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidLoginPage {
    public WebDriver driver;
    //webelement locators

    @FindBy(xpath = "//*[contains(text(), 'Hello, Sign in')]")
    private WebElement helloSignInTab;

    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"continue\" ]")
    private WebElement continueBtn;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    private WebElement submitBtn;

    //constructor to create pages
    public ValidLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Getters
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setHelloSignInTab(WebElement helloSignInTab) {
        this.helloSignInTab = helloSignInTab;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public void setContinueBtn(WebElement continueBtn) {
        this.continueBtn = continueBtn;
    }

    public void setPassword(WebElement password) {
        this.password = password;
    }

    public void setSubmitBtn(WebElement submitBtn) {
        this.submitBtn = submitBtn;
    }

    //action methods to be called in test cases
    public ValidLoginPage getHelloSignIn() {
        this.helloSignInTab.click();
        return new ValidLoginPage(driver);
    }

    public ValidLoginPage getEmail(String email) {
        this.email.clear();
        this.email.sendKeys("ghosh.p189@gmail.com");
        return this;
    }

    public ValidLoginPage getcontinueBtn() {
        this.continueBtn.click();
        return new ValidLoginPage(driver);
    }

    public ValidLoginPage getpassword(String password) {
        this.password.clear();
        this.password.sendKeys("Sarit@1983");
        return this;
    }

    public ValidLoginPage getsubmitBtn() {
        this.submitBtn.click();
        return new ValidLoginPage(driver);
    }
}

