import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase {

    @Test
    public void Test1(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://useinsider.com/");

        chromeDriver.quit();
    }
}
