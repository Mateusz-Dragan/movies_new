package pl.edu.pwsztar.domain.validators;

public class LastNameValidator {

  public static boolean isValid(final String lastName) {

    if(lastName == null || lastName.isEmpty()) {
      return false;
    }

    return true;
  }

}
