package Activity;

import AppiumControl.Button;
import AppiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addContactButton;

    public MainActivity(){
        addContactButton= new Button(By.id("com.google.android.contacts:id/floating_action_button"));
    }

    public static boolean isDisplayedContact(String nameContact){
        String locator="//android.widget.TextView[@content-desc='"+nameContact+"']";
        Label contact = new Label(By.xpath(locator));
        return contact.isDisplayed();
    }

}
