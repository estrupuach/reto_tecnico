package co.com.reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MeetingPage extends PageObject {
    public static final Target LIST_MEETING = Target.the("").
            located(By.cssSelector("a[href='#nav_menu1_3_2']"));
    public static final Target OPTION_MEETING = Target.the("").
            located(By.cssSelector("a[href='/demo/Meeting/Meeting']"));
    public static final Target BUTTON_CREATE_MEETING = Target.the("").
            located(By.xpath("//span[text()=' New Meeting']"));
    public static final Target INPUT_NAME = Target.the("").
            located(By.name("MeetingName"));
    public static final Target LIST_TYPE = Target.the("").
            located(By.id("select2-chosen-6"));
    public static final Target INPUT_TYPE = Target.the("").
        located(By.id("s2id_autogen6_search"));
    public static final Target INPUT_NUMBER = Target.the("").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));
    public static final Target INPUT_DATE_START = Target.the("").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));
    public static final Target SELECT_HOUR_START =Target.the("").
            located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[4]/select"));
    public static final Target INPUT_END_DATE = Target.the("").
            located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
    public static final Target SELECT_END_HOUR = Target.the("").
            located(By.xpath("//*[@id='Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid']/div/div/div[5]/select"));
    public static final Target LIST_LOCATION = Target.the("")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId"));
    public static final Target INPUT_LOCATION = Target.the("")
            .located(By.id("s2id_autogen7_search"));
    public static final Target INPUT_UNIT = Target.the("")
            .located(By.id("s2id_autogen8_search"));
    public static final Target INPUT_ORGANIZEDBY = Target.the("")
            .located(By.id("s2id_autogen9_search"));
    public static final Target INPUT_REPORTER = Target.the("")
            .located(By.id("s2id_autogen10_search"));
    public static final Target INPUT_ATTENDEE = Target.the("")
            .located(By.id("s2id_autogen12_search"));
    public static final Target LIST_UNIT = Target.the("")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId"));
    public static final Target LIST_ORGANIZED_BY = Target.the("")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId"));
    public static final Target LIST_REPORTER = Target.the("")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId"));
    public static final Target LIST_ATTENDEE = Target.the("")
            .located(By.id("s2id_autogen11"));
    public static final Target BUTTON_SAVE = Target.the("")
            .located(By.xpath("//span[text()=' Save']"));
}
