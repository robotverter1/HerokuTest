package Test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemoveTest extends BaseTest{

    @Test
    public void checkAddedElems(){
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        }
        driver.findElement(By.xpath("//button[text()='Delete'")).click();
        int count;
        List<WebElement> deleteList= driver.findElements(By.xpath("//button[text()='Delete'"));
        count = deleteList.size();
        System.out.println("Осталось элементов:" + count);
    }

}
