import org.openqa.selenium.WebDriver;

public class FirstPage extends BasePage{
    Constants constants;
    public FirstPage(WebDriver driver) {
        super(driver);
        driver.get("https://useinsider.com/");
        constants = new Constants();
    }
    //Insider sayfası kontrolü
    public boolean firstStep(){
        waitElement(constants.companyBtn);
        findElement(constants.companyBtn);
        onButton(constants.companyBtn);
        return driver.getTitle().contains("Insider");
    }
}
