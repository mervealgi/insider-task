import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class BasePage {
    WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void implWait(int i) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(i));

    }

}
