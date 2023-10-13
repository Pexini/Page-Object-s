package test;

import com.codeborne.selenide.Condition;
import data.DataHelper;
import org.junit.jupiter.api.Test;
import page.LoginPageV1;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TransferTest {
    @Test
    void shouldTransferMoney() {
        open("http://localhost:9999");

        var loginPage = new LoginPageV1();
        var authInfo = DataHelper.getAuthInfo();
        loginPage.validLogin((authInfo));



        $ ("[data-test-id = 'code'] input").shouldBe(visible);
    }
}
