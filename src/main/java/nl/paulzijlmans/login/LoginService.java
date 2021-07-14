package nl.paulzijlmans.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public boolean isUserValid(String user, String password) {
        return user.equalsIgnoreCase("paul") && password.equals("dummy");
    }
}
