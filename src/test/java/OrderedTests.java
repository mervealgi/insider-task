import org.testng.Assert;
import org.testng.annotations.Test;
import org.junit.jupiter.api.Order;

public class OrderedTests extends BaseTest{

    HomePage homePage;
    CareerPage careerPage;
    QaPage qaPage;
    QaaDetailsPage qaDetailsPage;

    @Test
    @Order(1)
    public void goPage(){
        homePage = new HomePage(driver);
        careerPage = new CareerPage(driver);
        qaPage = new QaPage(driver);

        homePage.goCareerPage();
        Assert.assertTrue(careerPage.isOnCareerPage() , "Not on Career Page!");

        careerPage.goQaPage();
        Assert.assertTrue(qaPage.isOnQaPage() , "Not on QA Page!");
    }

    //@Test
    //@Order(2)
    public void filterFields(){
        qaDetailsPage = new QaaDetailsPage(driver);
        qaPage.seeAllJobs();
        qaDetailsPage.selectLocationAndDepartment();

        Assert.assertTrue(qaDetailsPage.checkAllJobs , "Jobs are not founded!");
    }

    //@Test
    //@Order(3)
    public void goMainJob(){
        qaDetailsPage.goMainJob();

        Assert.assertTrue(qaDetailsPage.checkMainJobLink ,
                "Sorry for not able to directing to the main job page :(");

    }
}
