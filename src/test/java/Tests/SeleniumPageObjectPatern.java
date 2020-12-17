package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FastSearchPage;

import java.io.IOException;


public class SeleniumPageObjectPatern {

    private WebDriver driver;
    private String model;

    @Before
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/mikik/Desktop/JAVA/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.pl");

    }

    @Test
    public void pageGoogle() throws IOException {
        FastSearchPage fastSearchPage = new FastSearchPage(driver);
        fastSearchPage.zamknieciePopUpGoogle();
        fastSearchPage.searchFieldGoogle();
        fastSearchPage.acceptCookie();
        fastSearchPage.selectMark("Ford");
        fastSearchPage.selectModel("EDGE");
        fastSearchPage.selectCourseTo("30000");
        fastSearchPage.selectYearOfProduction("2018");
        fastSearchPage.selectFuelType("Diesel");
        fastSearchPage.selectAdvancedSearch();

    }

    @After
    public void closeWindow() {driver.quit();}

}

