 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
       StringBuilder rowStars = new StringBuilder(numberOfStars);
       for (int i = 0; i<numberOfStars; i ++) {
         rowStars.append("*");
       }
       return rowStars.toString();
    }
    
    public static String getTriangle(int numberOfRows) {
       StringBuilder triangle = new StringBuilder();
       int row = 1;
       for (int i = 1; i <= numberOfRows; i++) {
           for (int j = 0; j<i; j ++) {
             triangle.append("*");
           }
           triangle.append("\n");
       }
       return triangle.toString();
    }


    public static String getSmallTriangle() {
       StringBuilder triangle = new StringBuilder();
       int row = 1;
       for (int i = 1; i <= 4; i++) {
           for (int j = 0; j<i; j ++) {
             triangle.append("*");
           }
           triangle.append("\n");
       }
       return triangle.toString();
    }

    public static String getLargeTriangle() {
               StringBuilder triangle = new StringBuilder();
       int row = 1;
       for (int i = 1; i <= 9; i++) {
           for (int j = 0; j<i; j ++) {
             triangle.append("*");
           }
           triangle.append("\n");
       }
       return triangle.toString();
    }
}
