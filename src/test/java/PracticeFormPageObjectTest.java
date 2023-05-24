
import org.junit.jupiter.api.Test;

public class PracticeFormPageObjectTest extends TestBase {
    @Test
    void automationPracticeForm() {
        String firstName = "Diego";
        String lastName = "Maradona";
        String eMail = "special_one@gmail.ru";
        String gender = "Male";
        String phoneNumber = "9991112233";
        String birthDay_day = "30";
        String birthDay_month = "March";
        String birthDay_year = "1960";
        String subject = "Commerce";
        String hobbies = "Sports";
        String youFoto = "ImForPageOpject.jpg";
        String adress = "Lanus, Buenos Aires, Argentina";
        String state = "Haryana";
        String city = "Panipat";

        registrationPage.openPage()
                //Заполнение формы
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setEmail(eMail)
                        .setGender(gender)
                        .setUserNumber(phoneNumber)
                        .setBirthDate(birthDay_day, birthDay_month, birthDay_year)
                        .setSubject(subject)
                        .setHobbies(hobbies)
                        .setFoto(youFoto)
                        .setAdress(adress)
                        .setState(state)
                        .setCity(city)
                        .submitButton()
                //Верификация результатов
                        .verifyResultModalAppears()
                        .verifyFormResult("Student Name", firstName + " " + lastName)
                        .verifyFormResult("Student Email", eMail)
                        .verifyFormResult("Gender", gender)
                        .verifyFormResult("Mobile", phoneNumber)
                        .verifyFormResult("Date of Birth", birthDay_day + " " + birthDay_month + "," + birthDay_year)
                        .verifyFormResult("Subjects", subject)
                        .verifyFormResult("Hobbies", hobbies)
                        .verifyFormResult("Address", adress)
                        .verifyFormResult("State and City", state + " " + city)
                        .closeClick();

    }
}
