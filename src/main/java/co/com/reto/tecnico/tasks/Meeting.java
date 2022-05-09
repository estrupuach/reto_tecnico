package co.com.reto.tecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Meeting implements Task {
    public static Meeting createMeetingAssociateBusiness() {
        return Tasks.instrumented(Meeting.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
