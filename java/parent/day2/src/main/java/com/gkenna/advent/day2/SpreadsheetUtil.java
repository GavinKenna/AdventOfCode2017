package com.gkenna.advent.day2;

/**
 * Created by gkenna on 07/12/17.
 */
public final class SpreadsheetUtil {

    /**
     * What is used to separate the elements within a row.
     * Here we are using the whitespace tag
     */
    private final static String SEPARATOR= "\\s+";

    private SpreadsheetUtil() {
    }

    /**
     * Take in a 2d array of ints, loop throw each row and calculate the max element
     * value minus the min element value.
     * Add up the difference in each row
     * @param spreadsheet
     * @return
     */
    public static int calculateChecksum(final int[][] spreadsheet) {
        int checksum = 0, highestInRow, lowestInRow;

        for (int i = 0; i < spreadsheet.length; i++) {
            final int[] row = spreadsheet[i];
            final int firstElement = row[0];

            highestInRow = firstElement;
            lowestInRow = firstElement;
            for (int j = 0; j < row.length; j++) {
                final int entry = row[j];
                highestInRow = highestInRow > entry ? highestInRow : entry;
                lowestInRow = lowestInRow < entry ? lowestInRow : entry;
            }
            checksum += (highestInRow - lowestInRow);
        }
        return checksum;
    }

    /**
     * Take in a row of Strings, parse them into int[][]
     * @param spreadsheet
     * @return
     */
    public static int calculateChecksum(final String[] spreadsheet){
        final int amountOfRows = spreadsheet.length;

        final int[][] output = new int[amountOfRows][];

        for(int i = 0 ; i < amountOfRows ; i++){
            final String[] elementsWithinRow = spreadsheet[i].split(SEPARATOR);
            final int[] elements = new int[elementsWithinRow.length];
            for(int j = 0; j < elements.length; j++){
                elements[j] = Integer.parseInt(elementsWithinRow[j]);
            }
            output[i] = elements;
        }
        return calculateChecksum(output);
    }

}
