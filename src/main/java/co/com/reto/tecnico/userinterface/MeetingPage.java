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
}
