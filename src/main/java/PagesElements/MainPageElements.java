package PagesElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {

    public SelenideElement blockReservation = $x("//*[contains(text(),'Meine')]");
    public SelenideElement blockReturn = $x("//*[contains(text(),'Schlüssel und')]");
    public SelenideElement blockAdmin = $x("//*[contains(text(),'Verwaltung')]");
    public SelenideElement blockBarcode = $x("//*[contains(text(),'Barcode scannen')]");

    public SelenideElement idUser =  $x("//div[2]/div[3]/p[contains(text(), 'P32')]");
    public SelenideElement logoPorshe = $x("//*[contains(@src,'logo.png')]");
    public SelenideElement backButton = $x("//*[contains(text(), 'ZURÜCK')]");
    }
