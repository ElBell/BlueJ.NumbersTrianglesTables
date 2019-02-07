 import java.util.Formatter;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for(int i = 1; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize; j++) {
                table += String.format("%3d |", i*j);
            }
            table += String.format("\n");
         }
        System.out.print(table);
        return table;
        /*int tableSizePassed = tableSize;
        StringBuilder smallTable = new StringBuilder();
        Formatter formattedTable = new Formatter(smallTable);
        for(int i = 1 ; i <= tableSizePassed; i++) {
            for(int j = 1; j <= tableSizePassed ; j++) {
                formattedTable.format("%3d |", i*j);
             }
            formattedTable.format("\n");
         }
        return smallTable.toString();
        */
     }
}

