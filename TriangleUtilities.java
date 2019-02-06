 

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
       for (int i = 1; i <= numberOfRows; i++) {
           triangle.append(getRow(i));
           triangle.append("\n");
       }
       return triangle.toString();
    }

    public static String getSmallTriangle() {
       return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
