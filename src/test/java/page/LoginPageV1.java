package page;

import com.codeborne.selenide.Condition;
import data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageV1 {
    public void validLogin(DataHelper.AuthInfo info){
        $("[data-test-id= login] input ").setValue(info.getLogin());
        $("[data-test-id= password] input ").setValue(info.getPassword());
        $("button.button").click();

    }
}
