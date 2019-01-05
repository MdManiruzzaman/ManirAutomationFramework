package homePage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import javax.xml.xpath.XPath;

public class MainPage extends CommonAPI {

    @FindBy(xpath = "//img[@alt = 'Santander Bank N.A.']")
    public static WebElement viewSantanderLogo;

    public void checkviewSantanderLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewSantanderLogo.click();
    }

    @FindBy(xpath = "//input[@type ='text' and @id = '_P001_Header_WAR_P001_Headerportlet_search']")
    public static WebElement viewSearchBox;

    public void checkviewSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewSearchBox.click();
    }

    @FindBy(xpath = "//a[@class = 'txtOpts active' and @target = '_self']")
    public static WebElement viewPersonal;

    public void checkviewPersonal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewPersonal.click();
    }

    @FindBy(xpath = "//a[text()='Business' and @class='txtOpts ']")
    public static WebElement viewBusiness;

    public void checkviewBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewBusiness.click();
    }

    @FindBy(xpath = "//a[text()='Commercial']")
    public static WebElement viewCommercial;

    public void checkviewCommercial() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewCommercial.click();
    }

    //li[@class='active']
    @FindBy(xpath = "//a[text()='About' and @class='txtOpts ']")
    public static WebElement viewAbout;

    public void checkviewAbout() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewAbout.click();
    }

    @FindBy(xpath = "//h1[@class='titpage alignC']")
    public static WebElement viewSantanderCommercialBanking;

    public void checkviewSantanderCommercialBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewSantanderCommercialBanking.click();
    }

    @FindBy(xpath = "//span[text()='Banking']")
    public static WebElement viewBanking;

    public void checkviewBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewBanking.click();
    }

    @FindBy(xpath = " //span[text()='Borrowing']")
    public static WebElement viewBorrowing;

    public void checkviewBorrowing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewBorrowing.click();
    }

    @FindBy(xpath = " //span[text()='Investments and Protection']")
    public static WebElement viewInvestmentsAndProtection;

    public void checkviewInvestmentsAndProtection() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewInvestmentsAndProtection.click();
    }

    @FindBy(xpath = " //span[text()='Credit Cards']")
    public static WebElement viewCreditCards;

    public void checkviewCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewCreditCards.click();
    }

    @FindBy(xpath = "//span[text()='Prosper and Thrive']")
    public static WebElement viewProsperAndThrive;

    public void checkviewProsperAndThrive() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        viewProsperAndThrive.click();
    }

}





