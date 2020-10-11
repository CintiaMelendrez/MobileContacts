package Activity;

import AppiumControl.Button;
import org.openqa.selenium.By;

public class VerifyActivity {

    public Button returnButton;

    public VerifyActivity(){
        returnButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]"));
    }
}
