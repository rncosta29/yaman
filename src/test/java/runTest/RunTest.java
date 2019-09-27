package runTest;

import br.com.yaman.srBarriga.commons.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "pretty",
        "json:target/cucumber.json" }, features = { "./src//test/java/features/" }, glue = {
        "steps","br.com.yaman.srBarriga.commons" },

//Limpar RunTest antes de subir

        tags = {"@Login"})


public class RunTest extends BaseTest {

}