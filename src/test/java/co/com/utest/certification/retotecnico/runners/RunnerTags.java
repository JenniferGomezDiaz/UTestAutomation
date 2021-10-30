package co.com.utest.certification.retotecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/utest_academy.feature",
        tags = "@stories",
        glue ="co.com.utest.certification.retotecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

/**
 * @author: Jennifer Gomez Diaz
 * @version: 29/10/2021
 * @see <a href = "jennifergomezdiaz1104@gmail.com" /> jennifergomezdiaz1104@gmail.com </a>
 */
public class RunnerTags {

}