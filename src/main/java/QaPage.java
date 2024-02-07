import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QaPage extends BasePage {

    By seeAllJobslinkLocator = By.xpath("[class='btn btn-outline-secondary rounded " +
            "text-medium mt-2 py-3 px-lg-5 w-100 w-md-50']");

    By forVerificationPageLocator = By.className("big-title big-title-media mt-4 mt-lg-0");

    public boolean isOnQaPage(){
        return isDisplayed(forVerificationPageLocator);
    }

    public QaPage(WebDriver driver) {
        super(driver);
    }

    public void seeAllJobs() {
        click(seeAllJobslinkLocator);
    }
}
