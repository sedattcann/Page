package TEST;

import BASE.BaseTest;
import PAGE.practice_form;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMain extends BaseTest {
    practice_form practice_form;

    @BeforeTest
    public void before() {
        practice_form = new practice_form(getWebDriver());

    }

    @Test
    public void test(){
        practice_form
                .setName()
                .setLastName();
        
    }
}
