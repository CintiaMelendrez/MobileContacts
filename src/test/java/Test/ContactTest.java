package Test;

import Activity.AddContactActivity;
import Activity.MainActivity;
import Activity.VerifyActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import SessionManager.Session;
import java.net.MalformedURLException;

public class ContactTest {

    MainActivity mainActivity= new MainActivity();
    AddContactActivity addContactActivity= new AddContactActivity();
    VerifyActivity verifyActivity = new VerifyActivity();

    @Test
    public void verifyCreateContact() throws MalformedURLException {

        String nameContact="Test";

        mainActivity.addContactButton.click();
        addContactActivity.contactName.type(nameContact);
        addContactActivity.contactLastName.type("Automation");
        addContactActivity.contactCompany.type("UCB");
        addContactActivity.contactNumber.type("66666666");
        addContactActivity.contactEmail.type("test@ucb.com");
        addContactActivity.saveButton.click();
        verifyActivity.returnButton.click();

        // Verification
        Assert.assertFalse("ERROR, the contact wasn't create",mainActivity.isDisplayedContact(nameContact));
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
