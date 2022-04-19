package pl.edu.pwsztar.domain.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidator {

    public static boolean isValid(final String login) {
        final int LOGIN_MIN_LENGTH = 4;

        if(login == null || login.length() < LOGIN_MIN_LENGTH) {
            return false;
        }

        String regex = "^[a-zA-Z0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(login);

        return matcher.matches();
    }
}
