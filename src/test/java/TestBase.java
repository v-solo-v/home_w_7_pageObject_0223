import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    @BeforeAll
    public static void beforeAllMethod() {
        Configuration.browserSize = System.getProperty("browserSize","1920x1080");
        Configuration.browser = System.getProperty("browser", "firefox");
        Configuration.pageLoadStrategy = "eager";
    }
}
