package pages;

import locators.FastSearchLocators;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


public class FastSearchPage {

    WebDriver driver;
    WebDriverWait wait;
    FastSearchLocators fastSearchLocators;

    public FastSearchPage(WebDriver driver)
    {
        this.driver = driver;
        fastSearchLocators = new FastSearchLocators();
        PageFactory.initElements(driver, fastSearchLocators);
        wait = new WebDriverWait(driver, 20);
    }

    public void zamknieciePopUpGoogle()
    {
        driver.switchTo().frame(0);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("introAgreeButton")));
        driver.findElement(By.id("introAgreeButton")).click();
    }

    public void searchFieldGoogle()
    {
        fastSearchLocators.getSearchFieldGoogle().sendKeys("otomoto");
        fastSearchLocators.getSearchFieldGoogle().sendKeys(Keys.ENTER);
        fastSearchLocators.getPageOtoMoto().click();
    }

    public void acceptCookie()
    {
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getAcceptOtoMotoCookie()));
        fastSearchLocators.getAcceptOtoMotoCookie().click();

        for (Cookie cookie : driver.manage().getCookies()) {
            System.out.println("\n" + cookie.getName() + " : " + cookie.getValue());
        }
    }

    public void selectMark(String mark) {

        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getMark()));
        fastSearchLocators.getMark().sendKeys(mark);
        fastSearchLocators.getMark().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getMark()));
    }

    public void selectModel(String model) {

        wait.until(ExpectedConditions.elementToBeClickable(fastSearchLocators.getModel()));
        fastSearchLocators.getModel().sendKeys(model);
        fastSearchLocators.getModel().sendKeys(Keys.ENTER);
    }

    public void selectCourseTo(String course) {
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getCourse()));
        fastSearchLocators.getCourse().sendKeys(course);
        fastSearchLocators.getCourse().sendKeys(Keys.ENTER);
    }

    public void selectYearOfProduction(String year) {
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getYear()));
        fastSearchLocators.getYear().sendKeys(year);
        fastSearchLocators.getYear().sendKeys(Keys.ENTER);
    }

    public void selectFuelType(String fuel) {
        wait.until(ExpectedConditions.visibilityOf(fastSearchLocators.getFuel()));
        fastSearchLocators.getFuel().sendKeys(fuel);
        fastSearchLocators.getFuel().sendKeys(Keys.ENTER);
    }

    public void selectAdvancedSearch() throws IOException {
        fastSearchLocators.getAdvanced().click();

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\testPhoto\\screen.jpeg"));

        wait.until(ExpectedConditions.elementToBeClickable(fastSearchLocators.getEquipment()));
        fastSearchLocators.getEquipment().click();

        wait.until(ExpectedConditions.elementToBeClickable(fastSearchLocators.getCheck()));
        fastSearchLocators.getEsp().click();
        fastSearchLocators.getAsystent().click();
        fastSearchLocators.getPanorama().click();
        fastSearchLocators.getFog().click();
        fastSearchLocators.getAirbags().click();

        File file2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file2, new File("C:\\testPhoto\\screen2.jpeg"));

        fastSearchLocators.getWybierz().click();

        File file3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file3, new File("C:\\testPhoto\\screen2.jpeg"));

        for (Cookie cookie : driver.manage().getCookies()) {
            System.out.println("\n" + cookie.getName() + " : " + cookie.getValue());
        }
    }


}
