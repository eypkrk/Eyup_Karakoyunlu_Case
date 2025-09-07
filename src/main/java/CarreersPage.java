import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarreersPage extends BasePage{
    Constants constants;
    WebElement wb;
    int loops;

    public CarreersPage(WebDriver driver) {
        super(driver);
        driver.get("https://useinsider.com/");
        constants = new Constants();
    }

    //Carrer sayfası kontrolü
    public boolean controlCarrerBtn() {
        waitElement(constants.companyBtn);
        findElement(constants.companyBtn);
        onButton(constants.companyBtn);
        findElement(constants.carrersBtn);
        clickElement(constants.carrersBtn);
        return getUrl("careers");
    }

    //Our location kontrolü
    public boolean locationsBtns()throws Exception{
        Boolean enableControlLocations;
        findElement(constants.cookies);
        clickElement(constants.cookies);
        scrollScreen(3200);

        wb = waitClick(constants.locationTitle);

        if (wb.isEnabled()){
            enableControlLocations = true;
        }
        else {
            enableControlLocations = false;
        }

        for (int i = 1; i <= getCount(constants.locations); i++){
            Thread.sleep(500);
            findElement(constants.forwardBtn);
            onButton(constants.forwardBtn);
            clickElement(constants.forwardBtn);
        }
        return enableControlLocations;
    }

    //Teams buton kontrolü
    public boolean teamsBtns()throws Exception{
        Boolean enableControlTeam;

        waitElement(constants.locationTitle);
        Thread.sleep(1000);
        scrollScreen(-600);

        waitElement(constants.teamsBtn);
        wb = waitClick(constants.teamsBtn);

        if (wb.isEnabled()){
            enableControlTeam = true;
        }else {
            enableControlTeam = false;
        }
        Thread.sleep(1000);
        waitElement(constants.teamsBtn);
        findElement(constants.teamsBtn);
        clickElement(constants.teamsBtn);
        scrollScreen(2000);
        waitElement(constants.marketBtn);
        findElement(constants.qaBtn);
        clickElement(constants.qaBtn);
        return enableControlTeam;
    }
}
