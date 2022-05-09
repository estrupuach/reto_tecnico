package co.com.reto.tecnico.tasks;

import co.com.reto.tecnico.model.BusinessUnit;
import co.com.reto.tecnico.userinterface.BusinessUnitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;
import org.openqa.selenium.Keys;

import java.util.List;

public class Business implements Task {
    private List<BusinessUnit> businessUnitList;

    public Business(List<BusinessUnit> businessUnitList) {
        this.businessUnitList = businessUnitList;
    }

    public static Business createBusinessUnit(List<BusinessUnit> businessUnitList) {
        return Tasks.instrumented(Business.class, businessUnitList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BusinessUnitPage.LIST_ORGABIZATION),
                Click.on(BusinessUnitPage.OPTION_BUSINESS_UNIT),
                Click.on(BusinessUnitPage.BUTTON_NEW_BUSINESS_UNIT),
                Enter.theValue(businessUnitList.get(0).getStrName()).into(BusinessUnitPage.INPUT_NAMEBUSINESS),
                Click.on(BusinessUnitPage.OPEN_LIST_PARENT_UNIT),
                Enter.theValue(businessUnitList.get(0).getStrParentUnit()).into(BusinessUnitPage.INPUT_PARENTTYPE),
                Hit.the(Keys.ENTER).into(BusinessUnitPage.INPUT_PARENTTYPE),
                Click.on(BusinessUnitPage.BUTTON_SAVE)
        );
    }
}
