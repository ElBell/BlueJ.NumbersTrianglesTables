


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
      return getRange(start, stop, 1);
    }
    
    public static String getRange(int start, int stop, int step) {
      return getRange(start, stop, step, 1);  
    }

    public static String getRange(int start, int stop, int step, int expo) {
       StringBuilder range = new StringBuilder(stop-start);
       for (int i = start; i < stop; i += step) {
         range.append(Math.round(Math.pow(i, expo)));
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
        return getRange(start, stop + 1, 1, exponent);
     }
}
