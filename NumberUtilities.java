


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
      return getRange(start, stop, 1);
    }

    public static String getRange(int start, int stop, int step) {
       StringBuilder range = new StringBuilder(stop-start);
       for (int i = start; i<stop; i += step) {
         range.append(i);
       }
       return range.toString();
    }

    public static String getEvenNumbers(int start, int stop) {
       return start%2 != 0 ? getRange(start +1, stop, 2) : getRange(start, stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
        return start%2 == 0 ? getRange(start +1, stop, 2) : getRange(start, stop, 2);
    }


    public static String getExponentiations(int start, int stop, int exponent) {

      StringBuilder expoRange = new StringBuilder(stop-start);
        for (int i = start; i<=stop; i++) {
             long expo = Math.round(Math.pow(i, exponent)); 
             expoRange.append(expo);
       }
       return expoRange.toString();
     }
}
