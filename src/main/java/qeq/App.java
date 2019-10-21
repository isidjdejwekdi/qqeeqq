package qeq;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import org.openqa.selenium.By;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        System.setProperty("webdriver.chrome.driver",
                "C:\\chromedriver\\chromedriver.exe");
        OzonSearchPage ozonSearchPage = new OzonSearchPage();
        open("http://www.ozon.ru");


        ozonSearchPage.katalog().click();
        ozonSearchPage.moveToBooks().hover();
        ozonSearchPage.computerTech().click();
        ozonSearchPage.checkBoxBest().click();
        ozonSearchPage.checkBoxLanguages().click();
        ozonSearchPage.anyBookToBasket().click();
        ozonSearchPage.buttonWarp().shouldBe(Condition.visible);
        ozonSearchPage.busket().click();

    }
}
