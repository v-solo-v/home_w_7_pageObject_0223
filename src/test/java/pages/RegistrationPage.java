package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultModal;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    private CalendarComponent calendarComponent = new CalendarComponent();
    private RegistrationResultModal registrationResultModal = new RegistrationResultModal();
    private SelenideElement
            firstNameInputSelector = $("#firstName"),
            lastNameInputSelector = $("#lastName"),
            emailInputSelector = $("#userEmail"),
            genderWrapperSelector = $("#genterWrapper"),
            userNumberSelector = $("#userNumber"),
            dateOfBirthInputSelector = $("#dateOfBirthInput"),
            subjectSelector = $("#subjectsInput"),
            hobbiesSelector = $("#hobbiesWrapper"),
            fotoSelector = $("#uploadPicture"),
            adressSelector = $("#currentAddress"),
            stateSelector = $("#state"),
            citySelector = $("#city"),
            stateCitySelector = $("#stateCity-wrapper"),
            submit = $("#submit"),
            closeLargeModal = $("#closeLargeModal");
    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");

        return this;
    }
    public RegistrationPage setFirstName(String value) {
        firstNameInputSelector.setValue(value);

        return this;
    }
    public RegistrationPage setLastName(String value) {
        lastNameInputSelector.setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value){
        emailInputSelector.setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value){
        genderWrapperSelector.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setUserNumber(String value) {
        userNumberSelector.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        dateOfBirthInputSelector.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationPage setSubject(String value) {
        subjectSelector.setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setHobbies(String value) {
        hobbiesSelector.$(byText(value)).click();

        return this;
    }

    public RegistrationPage setFoto(String location) {
        fotoSelector.uploadFromClasspath(location);

        return this;
    }

    public RegistrationPage setAdress(String value) {
        adressSelector.setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        stateSelector.click();
        stateCitySelector.$(byText(value)).click();

        return this;
    }
    public RegistrationPage setCity(String value) {
        citySelector.click();
        stateCitySelector.$(byText(value)).click();

        return this;
    }

    public RegistrationPage submitButton() {
        submit.click();

        return this;
    }

    public RegistrationPage closeClick() {
        closeLargeModal.click();

        return this;
    }

    public RegistrationPage verifyResultModalAppears() {
        registrationResultModal.verifyModalAppears();

        return this;
    }

    public RegistrationPage verifyFormResult(String key, String value) {
        registrationResultModal.verifyFormResult(key, value);

        return this;

    }
}
