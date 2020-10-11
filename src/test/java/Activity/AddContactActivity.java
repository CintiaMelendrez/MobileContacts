package Activity;

import AppiumControl.Button;
import AppiumControl.TextBox;
import org.openqa.selenium.By;

public class AddContactActivity {
    public TextBox contactName;
    public TextBox contactLastName;
    public TextBox contactCompany;
    public TextBox contactNumber;
    public TextBox contactEmail;
    public Button saveButton;

    public AddContactActivity(){
        contactName= new TextBox(By.xpath("//android.widget.EditText[1][@text=\"Nombre\"]"));
        contactLastName= new TextBox(By.xpath("//android.widget.EditText[2][@text=\"Apellido\"]"));
        contactCompany= new TextBox(By.xpath("//android.widget.EditText[1][@text=\"Empresa\"]"));
        contactNumber= new TextBox(By.xpath("//android.widget.EditText[1][@text=\"Tel\u00e9fono\"]"));
        contactEmail= new TextBox(By.xpath("//android.widget.EditText[1][@text=\"Correo electr\u00f3nico\"]"));
        saveButton= new Button(By.id("com.google.android.contacts:id/menu_save"));
    }
}
