package decisiontable;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleLoginFormTest {

    @Test
    public void testValidCredentials() {
        assertEquals("success", SimpleLoginForm.login("testuser", "testpass"));
    }

    @Test
    public void testInvalidUsername() {
        assertEquals("username mismatch", SimpleLoginForm.login("invalid", "testpass"));
    }

    @Test
    public void testInvalidPassword() {
        assertEquals("password mismatch", SimpleLoginForm.login("testuser", "wrongpass"));
    }

    @Test
    public void testBlankUsername() {
        assertEquals("username mismatch", SimpleLoginForm.login("", "testpass"));
    }

    @Test
    public void testBlankPassword() {
        assertEquals("password mismatch", SimpleLoginForm.login("testuser", ""));
    }

    @Test
    public void testBothFieldsBlank() {
        assertEquals("username mismatch", SimpleLoginForm.login("", ""));
    }
}