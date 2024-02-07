import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {
    WebDriver chromeDriver = new ChromeDriver();

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        chromeDriver.get("https://useinsider.com/");

    }

    @AfterTest
    public void tearDown(){

        chromeDriver.quit();
    }
}
