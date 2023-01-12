package my.groupid.automation.practice.selenium.pages;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    //Locators
    private By emailAddressLocator = By.id("email_create");
    private By submitBtnLocator = By.id("SubmitCreate");
    private By emailLocator = By.id("email");
    private By alertAdditionalInformationLocator = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[11]");
    private By firstNameLocator = By.id("firstname");
    private By lastNameLocator = By.id("lastname");
    //Locators YOUR PERSONAL INFORMATION
    private By genderFemaleLocator = By.id("id_gender2");
    private By customerFirstNameLocator = By.id("customer_firstname");
    private By customerLastNameLocator = By.id("customer_lastname");
    private By passwordLocator = By.id("password");
    private By daysLocator = By.id("days");
    private By monthsLocator = By.id("months");
    private By yearsLocator = By.id("years");
    private By newsletterLocator = By.id("newsletter");
    private By receiveOffersLocator = By.id("uniform-option");
    //Locators YOUR ADDRESS
    private By companyLocator = By.id("company");
    private By address1Locator = By.id("address1");
    private By address2Locator = By.id("address2");
    private By cityLocator = By.id("city");
    private By stateLocator = By.id("id_state");
    private By postCodeLocator = By.id("postcode");
    private By countryLocator = By.id("id_country");
    private By additionalInformationLocator = By.name("other");
    private By homePhoneLocator = By.id("phone");
    private By mobilePhoneLocator = By.id("phone_mobile");
    private By futureAddressLocator = By.id("alias");
    private By registerBtnLocator = By.id("submitAccount");
    private By welcomeMessageLocator = By.cssSelector("#center_column > p");


    public void insertEmailToRegister() {
        if(super.isDisplayed(emailAddressLocator)) {
            type("deborareis0@hotmail.com", emailAddressLocator);
            click(submitBtnLocator);
        } else {
            System.out.println("email textbox was not present");
        }
    }

    public String getEmailNewAccount() {
        super.waitVisibilityOfElementLocated(alertAdditionalInformationLocator);
        return super.getTextByAttribute(this.emailLocator, "value");
    }

    public void fillOutForm() {
        this.insertEmailToRegister();
        super.waitVisibilityOfElementLocated(additionalInformationLocator);
        if(super.isDisplayed(genderFemaleLocator)) {
            super.click(genderFemaleLocator);
            super.type("Debora", customerFirstNameLocator);
            super.type("Reis", customerLastNameLocator);
            super.type("123456789", passwordLocator);
            super.selectByValue(daysLocator, "03");
            super.selectByValue(monthsLocator, "9");
            super.selectByValue(yearsLocator, "1996");
            super.click(newsletterLocator);
            super.click(receiveOffersLocator);
            super.type("GFT", companyLocator);
            super.type("Street Name, 123", address1Locator);
            super.type("xxxxx", address2Locator);
            super.type("Rio de Janeiro", cityLocator);
            super.selectByValue(stateLocator, "21");
            super.selectByValue(countryLocator, "55");
            super.type("12345", postCodeLocator);
            super.type("Additionl Information Test", additionalInformationLocator);
            super.type("99999999", homePhoneLocator);
            super.type("99999999", mobilePhoneLocator);
            super.clear(futureAddressLocator);
            String addressLocatorFuture = getTextByAttribute(address1Locator, "value");
            super.type(addressLocatorFuture, futureAddressLocator);
            super.click(registerBtnLocator);
        } else {
            System.out.println("message was not found.");
        }
    }

    public String getWelcomeMessage() {
        super.waitVisibilityOfElementLocated(welcomeMessageLocator);
        return super.getText(welcomeMessageLocator);
    }
}