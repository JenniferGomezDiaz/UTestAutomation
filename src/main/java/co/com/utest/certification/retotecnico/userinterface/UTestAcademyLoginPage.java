package co.com.utest.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * @author: Jennifer Gomez Diaz
 * @version: 29/10/2021
 * @see <a href = "jennifergomezdiaz1104@gmail.com" /> jennifergomezdiaz1104@gmail.com </a>
 */
public class UTestAcademyLoginPage {

    public static final Target BUTTON_JOIN = Target.the("button that shows us the form to register").located(By.xpath(
            "//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));

    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.name("lastName"));

    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));

    public static final Target INPUT_BIRTHDAY_MONTH = Target.the("where do we write the birthday month")
            .located(By.xpath("//div[@id='birthDate']//select[@id='birthMonth']"));

    public static final Target INPUT_BIRTHDAY_DAY = Target.the("where do we write the birthday day ")
            .located(By.xpath("//div[@id='birthDate']//select[@id='birthDay']"));

    public static final Target INPUT_BIRTHDAY_YEAR = Target.the("where do we write the birthday year ")
            .located(By.xpath("//div[@id='birthDate']//select[@id='birthYear']"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("button that shows us the next step location").located(By.xpath(
            "//div[@class='form-group col-xs-12 text-right']//a[@class='btn btn-blue']"));

    public static final Target BUTTON_NEXT_DEVICES = Target.the("button that shows us the next step devices").located(By.xpath(
            "//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));

    public static final Target BUTTON_NEXT_LAST_STEP = Target.the("button that shows us last step").located(By.xpath(
            "//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));

    public static final Target INPUT_CLAVE = Target.the("where do we write the password")
            .located(By.id("password"));

    public static final Target INPUT_CLAVE_CONFIRM = Target.the("where do we write the password confirm")
            .located(By.name("confirmPassword"));

    public static final Target BUTTON_COMPLETE_SETUP = Target.the("button that shows us complete setup").located(By.xpath(
            "//div[@class='pull-right next-step']//a[@class='btn btn-blue']"));
}
