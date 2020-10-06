/**
 * @since 02|/11/2018
 */
package bel.enavarrete.auto;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@CucumberOptions ( features = "src/test/resources/features/esika.feature", tags = "@caso", snippets= SnippetType.CAMELCASE)

@RunWith(CucumberWithSerenity.class)
class RunnerTags {

}