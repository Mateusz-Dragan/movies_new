package pl.edu.pwsztar.domain.validators;

public class PeselValidator {


  public static boolean isValid(String pesel) {
    int PESEL[] = new int[11];
    if (pesel == null || pesel.length() != 11) {
      return false;
    } else {
      for (int i = 0; i < 11; i++) {
        PESEL[i] = Integer.parseInt(pesel.substring(i, i + 1));
      }
      if (checkDate(PESEL) && checkSum(PESEL)) {
        return true;
      } else {
        return false;
      }
    }
  }

  private static boolean checkDate(int[] pesel) {
    if(checkYear(pesel) && checkMonth(pesel) && checkDay(pesel)){
      return true;
    }
    else{
      return false;
    }
  }

  private static boolean checkDay(int[] pesel) {
    return true;
  }

  private static boolean checkYear(int[] pesel) {
    return true;
  }

  private static boolean checkMonth(int[] pesel) {
    return true;
  }

  private static boolean checkSum(int[] pesel){
    int sum = 1 * pesel[0] +
        3 * pesel[1] +
        7 * pesel[2] +
        9 * pesel[3] +
        1 * pesel[4] +
        3 * pesel[5] +
        7 * pesel[6] +
        9 * pesel[7] +
        1 * pesel[8] +
        3 * pesel[9];
    sum %= 10;
    sum = 10 - sum;
    sum %= 10;

    if (sum == pesel[10]) {
      return true;
    }
    else {
      return false;
    }
  }


}