package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class RemovablePage extends BasicPage{

    private static final String URL = "https://the-internet.herokuapp.com/add_remove_elements/";
    private static final By ADD_BUTON = By.xpath("//button[text()='Add Element']");
    private static final By DELETE_BUTTON = By.xpath("//button[text()='Delete']");

    public RemovablePage(WebDriver driver){
        super(driver);
    }

    public void open() {
        driver.get(URL);
    }

    private void clickAddButton(){
        wait.until(ExpectedConditions.elementToBeClickable(ADD_BUTON)).click();
    }

    public void clickAddButton(int times) {
        for (int i = 0; i < times; i++) {
            clickAddButton();
        }
    }

    public void clickDeleteButton(int index) {
        List<WebElement> deleteButtons = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(DELETE_BUTTON)
        );
        deleteButtons.get(index).click();
    }

    public int getDeleteButtonsCount() {
        return driver.findElements(DELETE_BUTTON).size();
    }

    public void waitForDeleteButtonsCount(int expectedCount) {
        wait.until(ExpectedConditions.numberOfElementsToBe(DELETE_BUTTON, expectedCount));
    }
}
