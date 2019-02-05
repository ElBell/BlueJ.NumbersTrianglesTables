


public class NumberUtilities {

    public static String getRange(int stop) {
       StringBuilder stopRange = new StringBuilder(stop);
       for (int i = 0; i<stop; i++) {
         stopRange.append(i);
       }
       return stopRange.toString();
    }

    public static String getRange(int start, int stop) {
       StringBuilder startStopRange = new StringBuilder(stop-start);
       for (int i = start; i<stop; i++) {
         startStopRange.append(i);
       }
       return startStopRange.toString();
    }


    public static String getRange(int start, int stop, int step) {
       StringBuilder startStopStepRange = new StringBuilder(stop-start);
       for (int i = start; i<stop; i += step) {
         startStopStepRange.append(i);
       }
       return startStopStepRange.toString();
    }

    public static String getEvenNumbers(int start, int stop) {
       StringBuilder evenRange = new StringBuilder(stop-start);
       if(start%2 != 0) {start++;}
        for (int i = start; i<stop; i += 2) {
         evenRange.append(i);
       }
       return evenRange.toString();
    }


    public static String getOddNumbers(int start, int stop) {
       StringBuilder oddRange = new StringBuilder(stop-start);
       if(start%2 == 0) {start++;}
        for (int i = start; i<stop; i += 2) {
         oddRange.append(i);
       }
       return oddRange.toString();
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
