import org.openqa.selenium.By;

public class Constants {
public static By companyBtn = By.xpath("//div[@id='navbarNavDropdown']/ul/li[6]");
public static By carrersBtn = By.xpath("//div[@id='navbarNavDropdown']/ul/li[6]/div/div[2]/a[2]");
public static By cookies = By.cssSelector("a[id='wt-cli-reject-btn']");
public static By locationTitle = By.cssSelector("h3[class ='category-title-media ml-0'");
public static By locations = By.cssSelector("div[id='location-slider'] div ul li");
public static By forwardBtn = By.xpath("//div[@class='col-md-6 mt-3 mt-md-0 d-flex justify-content-between justify-content-md-end align-items-end']/a[2]/i");
public static By teamsBtn = By.cssSelector("a[class='btn btn-outline-secondary rounded text-medium mt-5 mx-auto py-3 loadmore']");
public static By qaBtn = By.xpath("//div[@class = 'col-12 d-flex flex-wrap p-0 career-load-more']/div[12]/div[1]/a");
public static By marketBtn = By.xpath("//div[@class='job-item col-12 col-lg-4 mt-5'][5]/div[2]/a");
public static By allQaBtn = By.xpath("//div[@class='col-12 col-lg-7 order-2 order-lg-1']/div/div/a");
public static By locationFilter = By.cssSelector("div[id='top-filter'] div div span[id='select2-filter-by-location-container']");
public static By departmantFilter = By.cssSelector("div[id='top-filter'] div div[data-animate-delay='7'] span[id='select2-filter-by-department-container']");
public static By jobType = By.xpath("//div[@class='col-12 col-lg-6 form-group d-flex flex-column mb-0'][2]/span/span/span/span[@title='Quality Assurance']");
public static By locationList = By.cssSelector("ul[id='select2-filter-by-location-results']");
public static By departmantList = By.cssSelector("ul[class='select2-results__options']");
public static By chooseCountry = By.xpath("//ul[@class='select2-results__options']/li[contains(text(),'Istanbul, Turkiye')]");
public static By chooseDepartmant = By.xpath("//ul[@class='select2-results__options']/li[contains(text(),'Quality Assurance')]");
public static By jobList = By.cssSelector("div[id = 'jobs-list'] div[class='position-list-item col-12 col-lg-4 qualityassurance istanbul-turkiye full-timeremote']");
public static By position = By.cssSelector("p.position-title");
public static By department = By.cssSelector("span.position-department");
public static By location = By.cssSelector("div.position-location");
public static By viewRoleButtons = By.cssSelector("div[id = 'jobs-list'] div[class='position-list-item col-12 col-lg-4 qualityassurance istanbul-turkiye full-timeremote'] a");
}
