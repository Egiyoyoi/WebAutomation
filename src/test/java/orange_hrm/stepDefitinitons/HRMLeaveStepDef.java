package orange_hrm.stepDefitinitons;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import tasks.ClickOn;
import tasks.InputText;
import tasks.NavigateTo;
import tasks.VerifyDisplayed;

public class HRMLeaveStepDef {
    @When("{actor} add entitlements employee with required field only")
    public void addEntitlements (Actor actor) throws Exception {
        actor.attemptsTo(
                ClickOn.button("Add"),
                InputText.onField("Employee", "Teguh Pratama"),
                ClickOn.button("Save")
        );
    }

    @Then("{actor} can see Leave Entitlements detail")
    public void listResult (Actor actor) throws Exception {
        actor.attemptsTo(
                VerifyDisplayed.element("Employee Entitlements")
        );
    }

    @Then("{actor} can see new employee leave list result")
    public void employeeLeaveListResult(Actor actor) throws Exception {
        actor.attemptsTo(
                VerifyDisplayed.element("Leave List"));
    }
}
