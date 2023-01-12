package my.groupid;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
private WebDriver driver;
@Test
    public void helloSelenium() {
//https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); //último parenteses é a pasta onde está o driver, conferir no meu pc, ou na coluna do lado da ide//
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get ("https://automationexercise.com/index.php");

        String currentUrl = driver.getCurrentUrl();
        String expected = "http://automationpractice.com/index.php";

        Assertions.assertEquals(expected, currentUrl);

        //driver.quit();
    }
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

}