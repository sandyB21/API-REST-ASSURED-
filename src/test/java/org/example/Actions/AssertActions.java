package org.example.Actions;
import io.restassured.response.Response;

import static org.testng.AssertJUnit.assertEquals;

public class AssertActions {

    public void verifyStatusCode(Response response) {
        assertEquals(String.valueOf(String.valueOf(response.getStatusCode()).startsWith("20")), true,
                "value of status code is" + response.getStatusCode());

    }

    public void verifyResponseBody(String actual, String expected, String description) {
        assertEquals(actual, expected, description);
    }

    public void verifyResponseBody(int actual, int expected, int description) {
        assertEquals(actual, expected, description);
    }

    public void verifyResponseBody(double actual, double expected, String description) {
        assertEquals(description, actual, expected);
    }

    public void verifyResponseBody(float actual, float expected, String description) {
        assertEquals(description, actual, expected);
    }

    public void verifyResponseBody(boolean actual, boolean expected, String description) {
        assertEquals(description, actual, expected);
    }
}