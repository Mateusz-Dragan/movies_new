package pl.edu.pwsztar.domain.validators;

public class FirstNameValidator {

    public static boolean isValid(final String firstName) {

        if(firstName == null || firstName.isEmpty()) {
            return false;
        }

        return true;
    }

}
