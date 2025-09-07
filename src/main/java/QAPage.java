import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class QAPage extends BasePage{
    Constants constants;
    Boolean control;
    public QAPage(WebDriver driver) {
        super(driver);
        driver.get("https://useinsider.com/careers/quality-assurance/");
        constants = new Constants();
    }
    //QA sayfası kontrolü
    public boolean controlQaPage(){
        control = null;
        if (getUrl("quality")){
            control =  true;
        }else {
            control = false;
        }
        return control;
    }
    //QA jobs un lislenmesi ve kontrolü
    public boolean seeQajob(){
        control = null;
        findElement(constants.cookies);
        clickElement(constants.cookies);
        waitElement(constants.allQaBtn);
        findElement(constants.allQaBtn);
        clickElement(constants.allQaBtn);
        findElement(constants.locationFilter);
        scrollScreen(450);
        waitElement(constants.jobType);
        findElement(constants.jobType);
        clickElement(constants.locationFilter);
        findElement(constants.locationList);
        onButton(constants.locationList);
        scrollScreen(500);
        waitElement(constants.chooseCountry);
        findElement(constants.chooseCountry);
        clickElement(constants.chooseCountry);
        findElement(constants.departmantFilter);
        clickElement(constants.departmantFilter);
        findElement(constants.departmantList);
        onButton(constants.departmantList);
        scrollScreen(500);
        findElement(constants.chooseDepartmant);
        clickElement(constants.chooseDepartmant);
        waitElement(constants.jobList);

        if (getCount(constants.jobList) != 0){
            control = true;
        }
        else {
            control = false;
        }
        return control;
    }
    //QA jobs kontrolleri
    public boolean checkAllJobs(){
        waitElement(constants.jobList);
        for (WebElement postion: driver.findElements(constants.position)){
            control = null;
            if (postion.getText().equalsIgnoreCase("Senior Software Quality Assurance Engineer")){
                control = true;
            }else {
                control = false;
            }
        }
        for (WebElement department: driver.findElements(constants.department)){
            if (department.getText().equalsIgnoreCase("Quality Assurance")){
                control = true;
            }else {
                control = false;
            }
        }

        for (WebElement location: driver.findElements(constants.location)){
            if (location.getText().equalsIgnoreCase("Istanbul, Turkiye")){
                control = true;
            }else{
                control = false;
            }
        }

        return control;
    }

    //QA View Role kontrolü
    public boolean controlRole(){
        control = null;
        for (WebElement button:driver.findElements(constants.viewRoleButtons)){
            actions.moveToElement(button).perform();
            findElement(constants.viewRoleButtons);
            clickElement(constants.viewRoleButtons);
            newScreen(1);

            if (getUrl("lever")){
                control = true;
            }else {
                control = false;
            }
            driver.close();
            newScreen(0);
        }
        return control;
    }
}
