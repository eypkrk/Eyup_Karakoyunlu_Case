import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class CarrersPageTest extends BaseTest {

    @Test
    public void companyBtn()throws Exception{

        carreersPage.controlCarrerBtn();
        carreersPage.locationsBtns();
        carreersPage.teamsBtns();

        try{
            Assert.assertTrue(carreersPage.controlCarrerBtn(),"Carreer page is not open!");
            Assert.assertTrue(carreersPage.locationsBtns(),"Location button is open");
            Assert.assertTrue(carreersPage.teamsBtns(),"Teams button is not open");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
