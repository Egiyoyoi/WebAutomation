package orange_hrm.stepDefitinitons;

import com.openhtmltopdf.simple.extend.form.InputField;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;
import tasks.VerifyDisplayed;

public class PIMStepDefinitions {
    @And("{actor} access employee list")
    public void accessEmployee(Actor actor) throws Exception {
        actor.wasAbleTo(NavigateTo.theURL("HRM Employee List"));
    }

    @Then("{actor} can see new employee list result")
    public void listResult(Actor actor) throws Exception {
        actor.attemptsTo(
            VerifyDisplayed.element("Employee List"));
    }

    @And("{actor} search for new employee")
    public void filterEmployee (Actor actor) throws Exception {
        actor.attemptsTo(
                InputText.onField("employeeName", "Teguh"),
                ClickOn.button("Search")
        );
    }

    @When("{actor} add new employee with required field only")
    public void iAddNewEmployeeWithRequiredFieldOnly(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Add"),
                InputText.onField("firstname", "Teguh"),
                InputText.onField("lastname", "Pratama"),
                ClickOn.button("Save")
        );
    }

    @Then("{actor} can see my Personal Details")
    public void personalDetails(Actor actor) throws Exception {
        actor.attemptsTo(VerifyDisplayed.element("Personal Details"));
    }

    @When("{actor} update new employee's middle name")
    public void updateEmployee(Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.employeeList(),
                ClickOn.button("Edit"),
                InputText.onField("editMiddleName"," Tanjung"),
                ClickOn.button("Save")
        );
    }
}
