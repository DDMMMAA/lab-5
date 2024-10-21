package use_case.logout;

/**
 * Output Data for the Logout Use Case.
 */
public class LogoutOutputData {

    private final String username;
    private final boolean useCaseFailed;

    public LogoutOutputData(String username, boolean useCaseFailed) {
        // * save the parameters in the instance variables.
        this.username = username;
        this.useCaseFailed = useCaseFailed;
    }

    public String getUsername() {
        return username;
    }

}
