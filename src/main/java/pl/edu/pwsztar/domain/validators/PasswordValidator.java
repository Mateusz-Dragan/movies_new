package pl.edu.pwsztar.domain.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

  public static boolean isValid(final String password) {

    if(password == null) {
      return false;
    }

    String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{4,20}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(password);

    return matcher.matches();
  }
}
