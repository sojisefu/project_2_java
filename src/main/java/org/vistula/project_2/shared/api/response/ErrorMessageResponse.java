package org.vistula.project_2.shared.api.response;

//public record ErrorMessageResponse(String message) {
//
//}
public class ErrorMessageResponse {

    private final String message;

    public ErrorMessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}