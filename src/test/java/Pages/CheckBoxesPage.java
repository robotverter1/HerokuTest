package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CheckBoxesPage extends BasicPage{

    private static final String URL = "http://the-internet.herokuapp.com/checkboxes";
    private final By checkBox = By.cssSelector("input[type='checkbox']");

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(URL);
    }

    private List<WebElement> getCheckboxes(){
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(checkBox));
    }

    public boolean isCheckboxSelected(int value){
        return getCheckboxes().get(value).isSelected();
    }

    public void activate(int value){
        WebElement checkbox = getCheckboxes().get(value);
        if (!checkbox.isSelected()){
            checkbox.click();
        }
    }

    public void unactivate(int value){
        WebElement checkbox = getCheckboxes().get(value);
        if (checkbox.isSelected()){
            checkbox.click();
        }
    }
}
