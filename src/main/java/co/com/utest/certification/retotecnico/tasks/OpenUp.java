package co.com.utest.certification.retotecnico.tasks;


import co.com.utest.certification.retotecnico.userinterface.UTestAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

/**
 * @author: Jennifer Gomez Diaz
 * @version: 29/10/2021
 * @see <a href = "jennifergomezdiaz1104@gmail.com" /> jennifergomezdiaz1104@gmail.com </a>
 */
public class OpenUp implements Task {
    private UTestAcademyPage uTestAcademyPage;

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestAcademyPage));
    }
}
