package Test;

import Pages.CheckBoxesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest{

    private CheckBoxesPage page;

    @BeforeMethod
    public void setUp(){
        page = new CheckBoxesPage(driver);
    }

    @Test(description = "Проверка не отмеченного checkbox1")
    public void uncheckedToCheckedBox(){
        page.open();
        if (page.isCheckboxSelected(0)){
            page.activate(0);
        }
    }
    @Test(description = "Проверка отмеченного checkbox2")
    public void checkedToUncheckedBox(){
        page.open();
        if(page.isCheckboxSelected(1)){
            page.unactivate(1);
        }
    }
}
