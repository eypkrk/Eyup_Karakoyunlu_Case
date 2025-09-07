import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class QaPageTest extends BaseTest{

    @Test
    public void qaPageControl(){

        qaPage.controlQaPage();
        qaPage.seeQajob();
        qaPage.checkAllJobs();
        qaPage.controlRole();

        try{
            Assert.assertTrue(qaPage.controlQaPage(),"Quality Assurance is not open.");
            Assert.assertTrue(qaPage.seeQajob(),"The jobs are not here");
            Assert.assertTrue(qaPage.checkAllJobs(),"The jobs positions,departments or locations have error");
            Assert.assertTrue(qaPage.controlRole(),"The page is not Lever");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
