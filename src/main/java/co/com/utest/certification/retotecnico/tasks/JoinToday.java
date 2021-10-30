package co.com.utest.certification.retotecnico.tasks;

import co.com.utest.certification.retotecnico.userinterface.UTestAcademyLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

/**
 * @author: Jennifer Gomez Diaz
 * @version: 29/10/2021
 * @see <a href = "jennifergomezdiaz1104@gmail.com" /> jennifergomezdiaz1104@gmail.com </a>
 */
public class JoinToday implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private int intDay;
    private int intYear;
    private String strMobileDevice;
    private String strModel;
    private String strOS;
    private String strClave;

    public JoinToday(String strFirstName, String strLastName, String strEmail, String strMonth, int intDay, int intYear,
                     String strMobileDevice, String strModel, String strOS, String strClave) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.intDay = intDay;
        this.intYear = intYear;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strOS = strOS;
        this.strClave = strClave;
    }

    public static JoinToday onThePage(){
        return Tasks.instrumented(JoinToday.class);
    }

    public static JoinToday onThePage(String strFirstName, String strLastName, String strEmail, String strMonth,
                                      int intDay, int intYear, String strMobileDevice, String strModel, String strOS,
                                      String strClave){
        return Tasks.instrumented(JoinToday.class, strFirstName, strLastName, strEmail, strMonth,
                intDay, intYear, strMobileDevice, strModel, strOS, strClave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestAcademyLoginPage.BUTTON_JOIN),

                Enter.theValue(strFirstName).into(UTestAcademyLoginPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UTestAcademyLoginPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UTestAcademyLoginPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(UTestAcademyLoginPage.INPUT_BIRTHDAY_MONTH),
                SelectFromOptions.byVisibleText(String.valueOf(intDay)).from(UTestAcademyLoginPage.INPUT_BIRTHDAY_DAY),
                SelectFromOptions.byVisibleText(String.valueOf(intYear)).from(UTestAcademyLoginPage.INPUT_BIRTHDAY_YEAR),
                Click.on(UTestAcademyLoginPage.BUTTON_NEXT_LOCATION),

                Click.on(UTestAcademyLoginPage.BUTTON_NEXT_DEVICES),

                Click.on(UTestAcademyLoginPage.BUTTON_NEXT_LAST_STEP),

                Enter.theValue(strClave).into(UTestAcademyLoginPage.INPUT_CLAVE),
                Enter.theValue(strClave).into(UTestAcademyLoginPage.INPUT_CLAVE_CONFIRM),
                Click.on(UTestAcademyLoginPage.BUTTON_COMPLETE_SETUP)
        );
    }
}
