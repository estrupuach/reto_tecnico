package co.com.reto.tecnico.tasks;

import co.com.reto.tecnico.model.MeetingModel;
import co.com.reto.tecnico.userinterface.MeetingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Meeting implements Task {
    private List<MeetingModel> meetingModelList;

    public Meeting(List<MeetingModel> meetingModelList) {
        this.meetingModelList = meetingModelList;
    }

    public static Meeting createMeetingAssociateBusiness(List<MeetingModel> meetingModelList) {
        return Tasks.instrumented(Meeting.class, meetingModelList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MeetingPage.LIST_MEETING),
                Click.on(MeetingPage.OPTION_MEETING),
                Click.on(MeetingPage.BUTTON_CREATE_MEETING),
                Enter.theValue(meetingModelList.get(0).getNameMeeting()).into(MeetingPage.INPUT_NAME)
        );
    }
}
