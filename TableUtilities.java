 import java.util.Formatter;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int tableSize = 5;
        StringBuilder smallTable = new StringBuilder();
        Formatter formattedTable = new Formatter(smallTable);
        for(int i = 1 ; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize ; j++) {
                formattedTable.format("%3d |", i*j);
                System.out.print(i*j);
             }
            formattedTable.format("\n");
         }
        return smallTable.toString();
    }

    public static String getLargeMultiplicationTable() {
        int tableSize = 10;
        StringBuilder smallTable = new StringBuilder();
        Formatter formattedTable = new Formatter(smallTable);
        for(int i = 1 ; i <= tableSize; i++) {
            for(int j = 1; j <= tableSize ; j++) {
                formattedTable.format("%3d |", i*j);
                System.out.print(i*j);
             }
            formattedTable.format("\n");
         }
        return smallTable.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        int tableSizePassed = tableSize;
        StringBuilder smallTable = new StringBuilder();
        Formatter formattedTable = new Formatter(smallTable);
        for(int i = 1 ; i <= tableSizePassed; i++) {
            for(int j = 1; j <= tableSizePassed ; j++) {
                formattedTable.format("%3d |", i*j);
                System.out.print(i*j);
             }
            formattedTable.format("\n");
         }
        return smallTable.toString();
    }
}

