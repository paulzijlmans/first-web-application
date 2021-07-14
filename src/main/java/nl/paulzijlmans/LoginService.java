package nl.paulzijlmans;

public class LoginService {

    public boolean isUserValid(String user, String password) {
        return user.equalsIgnoreCase("paul") && password.equals("dummy");
    }
}
