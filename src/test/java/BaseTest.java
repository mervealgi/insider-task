import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        driver.get("https://useinsider.com/");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
