package tasks;

import fb.pageobjects.CheckpoinPageObjects;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Collection;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TheMessage {
    public static Question<Collection<String>> displayed() {
        WaitUntil.the(CheckpoinPageObjects.ERROR_MESSAGE, isVisible()).forNoMoreThan(25).seconds();

        return Text.ofEach(CheckpoinPageObjects.ERROR_MESSAGE).describedAs("the messages displayed");
    }
}
