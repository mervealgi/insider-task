import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareerPage extends BasePage{

    By lifeAtInsiderLocator = By.xpath("div[class='elementor-element elementor-element-21cea83 " +
            "elementor-widget elementor-widget-heading']");
    By seeAllTeamsButtonLocator = By.xpath("btn btn-outline-secondary rounded text-medium " +
            "mt-5 mx-auto py-3 loadmore");
    By qaLinklocator = By.xpath("//h3[contains(@class, 'text-center mb-4 mb-xl-5') ," +
            "and text() = 'Quality Assurance']");

    public boolean isOnCareerPage(){
        return isDisplayed(lifeAtInsiderLocator);
    }

    public CareerPage(WebDriver driver) {
        super(driver);
    }

    public void goQaPage() {
        click(seeAllTeamsButtonLocator);
        click(qaLinklocator);
    }
}
