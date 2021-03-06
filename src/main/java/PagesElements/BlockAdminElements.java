package PagesElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BlockAdminElements {

    public SelenideElement adminHeaderTitle = $x("//*[contains(text(),'ADMIN Verwaltung')]");
    public SelenideElement searchFieldText = $x("//*[contains(@id,'searchFieldText')]");
    public SelenideElement searchFieldButton = $x("//*[contains(@class,'search-field_button')]");
    public SelenideElement keypad = $x("//*[contains(@id,'searchKeypad')]");
    public SelenideElement pickupTableHeader = $x("//*[contains(@class,'pickup-table-header')]");
    public SelenideElement depotStringWithInfo = $x("//div[2]/div/div[2]/div[2]/table/tbody/tr[1]");
    public SelenideElement depotUniqueNumber = $x("//*[@id=\"depotMessage\"]/b");
    public SelenideElement suchenButton = $x("//*[contains(text(),'Suchen')]");
    public SelenideElement entnahmeButton = $x("//*[contains(text(),'ENTNAHME')]");
    public SelenideElement adminEntnahmeTitle = $x("//*[contains(text(),'ADMIN Entnahme')]");
    public SelenideElement value69 = $x("/html/body/div[2]/div/div[2]/div[2]/table/tbody/tr[69]/td[2]");
}