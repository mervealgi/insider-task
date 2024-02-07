import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QaaDetailsPage extends BasePage{

    By locationDropdownLocator = By.id("select2-filter-by-location-container");
    By departmentDropdownLocator = By.id("select2-filter-by-department-container");
    By locationSelectionLocator = By.id("id=select2-filter-by-location-result-ughj-Istanbul, Turkey");
    By departmentSelectionLocator = By.id("select2-filter-by-department-result-97hb-Quality Assurance");

    public boolean checkAllJobs;
    public boolean checkMainJobLink;

    public QaaDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void goMainJob() {
    }

    public void selectLocationAndDepartment() {
        click(locationDropdownLocator);
        implWait(2);
        click(locationSelectionLocator);
        implWait(2);
        click(departmentDropdownLocator);
        implWait(2);
        click(departmentSelectionLocator);
        implWait(2);
    }
}
