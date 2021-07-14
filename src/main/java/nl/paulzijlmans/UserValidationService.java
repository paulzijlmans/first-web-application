package nl.paulzijlmans;

public class UserValidationService {

    public boolean isUserValid(String user, String password) {
        return user.equals("paul") && password.equals("dummy");
    }
}
