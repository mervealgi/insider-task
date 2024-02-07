import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By companyPageLocator = By.xpath("//a[text()='Company']");
    By careersPageLocator = By.xpath("//a[text()='Careers']");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void goCareerPage() {
        click(companyPageLocator);
        click(careersPageLocator);
    }
}
