import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
    FirstPage firstPage;
    CarreersPage carreersPage;
    QAPage qaPage;

    @BeforeAll
    public static void setup(){
        WebDriverManager.chromedriver();
    }

    @BeforeEach
    public void seTup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        firstPage = new FirstPage(driver);
        carreersPage = new CarreersPage(driver);
        qaPage = new QAPage(driver);
    }

    @AfterEach
    public void teardown(){
        driver.quit();
    }
}
