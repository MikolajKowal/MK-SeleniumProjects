package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FastSearchLocators {

    @FindBy(css="button#onetrust-accept-btn-handler")
        private WebElement acceptOtoMotoCookie;
        public WebElement getAcceptOtoMotoCookie() { return acceptOtoMotoCookie; }
        public void setAcceptOtoMotoCookie(WebElement acceptOtoMotoCookieCookie) { this.acceptOtoMotoCookie = acceptOtoMotoCookieCookie; }

    @FindBy(css="input.gLFyf.gsfi")
        private WebElement searchFieldGoogle;
        public WebElement getSearchFieldGoogle() { return searchFieldGoogle; }
        public void setSearchFieldGoogle(WebElement searchFieldGoogle) { this.searchFieldGoogle = searchFieldGoogle; }

    @FindBy(xpath = "//span[contains(text(),'OTOMOTO - nowe i używane samochody i motocykle ora')]")
        private WebElement pageOtoMoto;
        public WebElement getPageOtoMoto() { return pageOtoMoto; }
        public void setPageOtoMoto(WebElement pageOtoMoto) { this.pageOtoMoto = pageOtoMoto; }

    @FindBy(xpath = "//input[@id='filter_enum_make']")
        private WebElement mark;
        public WebElement getMark() {  return mark;  }
        public void setMark(WebElement mark) {  this.mark = mark; }

    @FindBy(xpath = "//input[@id='filter_enum_model']")
        private WebElement model;
        public WebElement getModel() {  return model;  }
        public void setModel(WebElement model) {  this.model = model; }

    @FindBy(xpath = "//input[@id='filter_float_mileage:to']")
        private WebElement course;
        public WebElement getCourse() {  return course;  }
        public void setCourse(WebElement course) {  this.course = course;  }

    @FindBy(xpath = "//input[@id='filter_float_year:from']")
        private WebElement year;
        public WebElement getYear() {  return year;  }
        public void setYear(WebElement year) {  this.year = year;  }

    @FindBy(xpath = "//input[@id='filter_enum_fuel_type']")
        private WebElement fuel;
        public WebElement getFuel() {  return fuel;  }
        public void setFuel(WebElement fuel) {   this.fuel = fuel;  }

   @FindBy(css = "button.ds-button.ds-width-full.ds-neutral")
        private WebElement advanced;
        public WebElement getAdvanced() {  return advanced;  }
        public void setAdvanced(WebElement advanced) {  this.advanced = advanced;  }


    @FindBy(xpath = "//body/div[@id='siteWrap']/div[@id='form']/div[@id='searchbox']/div[1]/form[1]/noindex[1]/fieldset[2]/ul[1]/li[15]/div[1]/div[1]/a[1]")
        private WebElement equipment;
        public WebElement getEquipment() {   return equipment; }
        public void setEquipment(WebElement equipment) { this.equipment = equipment; }

    @FindBy(css = "li#param_features.grid-li.fblock.param.paramEnum ")
        private WebElement check;
        public WebElement getCheck() {
        return check;
    }
        public void setCheck(WebElement check) {
        this.check = check;
    }

    @FindBy (xpath = "//label[contains(text(),'ESP (stabilizacja toru jazdy)')]")
        private WebElement esp;
        public WebElement getEsp() {
        return esp;
    }
        public void setEsp(WebElement esp) {
        this.esp = esp;
    }

    @FindBy (xpath = "//label[contains(text(),'Dach panoramiczny')]")
        private WebElement panorama;
        public WebElement getPanorama() {  return panorama;  }
        public void setPanorama(WebElement panorama) {  this.panorama = panorama; }

    @FindBy (xpath = "//label[contains(text(),'Asystent pasa ruchu')]")
        private WebElement asystent;
        public WebElement getAsystent()    {   return asystent;  }
        public void setAsystent(WebElement asystent) {        this.asystent = asystent;    }

    @FindBy (xpath = "//label[contains(text(),'Światła przeciwmgielne')]")
        private WebElement fog;
        public WebElement getFog()    {   return fog;  }
        public void setFog(WebElement fog) {        this.fog = fog;    }

    @FindBy (xpath = "//label[contains(text(),'Boczne poduszki powietrzne')]")
    private WebElement airbags;
    public WebElement getAirbags()    {   return airbags;  }
    public void setAirbags(WebElement airbags) {        this.airbags = airbags;    }

    @FindBy (linkText = "Wybierz")
    private WebElement wybierz;
    public WebElement getWybierz()    {   return wybierz;  }
    public void setWybierz(WebElement wybierz) {        this.wybierz = wybierz;    }
}

