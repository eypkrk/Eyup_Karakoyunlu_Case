import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class FirstPageTest extends BaseTest{
    @Test
    public void controlBtn(){

        firstPage.firstStep();

        try {
            Assert.assertTrue(firstPage.firstStep(),"Sayfa Açılmadı!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
