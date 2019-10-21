package qeq;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;

public class OzonSearchPage {

    public SelenideElement katalog(){
        return $(By.xpath("//button[@value='Каталог']"));
    }

    public  SelenideElement moveToBooks(){
        return $(By.xpath("//span[contains(text(),'Книги')]"));
    }

    public SelenideElement computerTech(){
        return $(By.linkText("Компьютерные технологии"));
    }
    public SelenideElement checkBoxBest(){
        return $(By.xpath("//span[text() ='Бестселлеры']"));
    }

    public SelenideElement checkBoxLanguages(){
        return $(By.xpath("//span[contains(text(),'Языки программирования')]"));
    }

    public SelenideElement anyBookToBasket(){
        return $(By.xpath("//div[@data-index='1']//span[text()='В корзину']"));
    }

    public SelenideElement buttonWarp(){
        return $(By.xpath("//div[@class='count-button-wrap']"));
    }

    public SelenideElement busket(){
        return $(By.xpath("//a[@href='/cart']"));
    }


}
