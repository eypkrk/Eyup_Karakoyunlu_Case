import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    JavascriptExecutor js;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void waitElement(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public WebElement waitClick(By by){
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement findElement(By by){
        waitElement(by);
        return driver.findElement(by);
    }

    public void clickElement (By by){
        findElement(by).click();
    }

    public void onButton(By by){
        actions = new Actions(driver);
        actions.moveToElement(findElement(by)).perform();
    }

    public void scrollScreen(int number){
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+number+")");
    }

    public Boolean getUrl(String text){
        return driver.getCurrentUrl().contains(text);
    }

    public String getText(By by){
        return findElement(by).getText();
    }

    public int getCount(By by){
        List<WebElement> count = driver.findElements(by);
        return count.size();
    }

    public void newScreen(int number){
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(number));
    }


}
