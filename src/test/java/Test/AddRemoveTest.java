package Test;

import Pages.RemovablePage;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class AddRemoveTest extends BaseTest{

    protected RemovablePage removablePage;

    @BeforeMethod
    public void setUp(){
        removablePage = new RemovablePage(driver);
    }

    @Test
    public void checkAddedElems(){
        removablePage.open();
        removablePage.clickAddButton(2);
        removablePage.clickDeleteButton(0);
        int count = removablePage.getDeleteButtonsCount();
        System.out.println("Осталось элементов:" + count);
    }
}
