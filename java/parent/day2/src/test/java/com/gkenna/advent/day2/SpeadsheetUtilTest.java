package com.gkenna.advent.day2;

import org.junit.Test;

/**
 * Created by gkenna on 07/12/17.
 */
public class SpeadsheetUtilTest {

    @Test
    public void calculateChecksumTest1() {
        final String[] input =
                        {"5 1 9 5",
                        "7 5 3",
                        "2 4 6 8"};

        final int expectedOutput = 18;

        final int validOutput = SpreadsheetUtil.calculateChecksum(input);
        assert (validOutput == expectedOutput);

    }

    @Test
    public void calculateChecksumTest2() {
        final int[][] input =
                {{5, 1, 9, 5},
                        {7, 5, 3},
                        {2, 4, 6, 8}};

        final int expectedOutput = 18;

        final int validOutput = SpreadsheetUtil.calculateChecksum(input);
        assert (validOutput == expectedOutput);

    }
}
