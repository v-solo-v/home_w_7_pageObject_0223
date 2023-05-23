package pages.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultModal {
    public void verifyModalAppears () {
        $("#example-modal-sizes-title-lg").should(appear);
        $(".modal-open").shouldHave(text("Thanks for submitting the form"));
    }

    public void verifyFormResult (String key, String value) {
        $(".table-responsive").$(byText(key)).parent()
                .shouldHave(text(value));
    }
}
