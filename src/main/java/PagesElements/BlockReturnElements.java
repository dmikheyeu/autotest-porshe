package PagesElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BlockReturnElements {

    public SelenideElement pickupListItem = $x("//*[contains(@class, 'pickup-list-item pickup-status2')]");
    public SelenideElement carKeyButton = $x("//*[contains(@class, 'return-btn-small return-btn-key')]");
    public SelenideElement scanObjectButtonOnReturnBlock = $x("//*[contains(@class, 'btn-block return-btn')]");
    public SelenideElement finalReturnButton = $x("//*[contains(@id, 'nextbutton')]");
    public SelenideElement popupWithInfoParking = $x("//*[contains(text(), 'Ist der angezeigte Stellplatz korrekt?')]");
    public SelenideElement confirmLocationButtonInPopup = $x("//*[@id=\"exampleModal3\"]/div/div/div[2]/button[2]");
    public SelenideElement pickupDetailsBox = $x("//*[contains(@class, 'pickup-detail-box')]");
    public SelenideElement returnDetailsBox = $x("//*[contains(@id, 'returndetails')]");
    public SelenideElement saveButton = $x("//*[contains(@class, 'footer-block-right')]");
    public SelenideElement disabledSaveButton = $x("//*[contains(@class, 'btn btn-primary btn-lg mb-4 disabled')]");
    public SelenideElement enabledSaveButton = $x("//*[contains(@class, 'btn btn-primary btn-lg mb-4')]");
    public SelenideElement fullstandButtonWithValue50 = $x("//*[contains(@id, '50')]");
    public SelenideElement uniqueDepotAfterClickOnSaveButton = $x("//*[@id=\"depotMessage\"]/b");
}
