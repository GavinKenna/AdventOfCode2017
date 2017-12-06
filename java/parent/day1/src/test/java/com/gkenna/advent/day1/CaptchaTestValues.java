package com.gkenna.advent.day1;

/**
 * Created by gkenna on 05/12/17.
 *
 * A handy util class to hold test values.
 */
public final class CaptchaTestValues {

    /**
     * Should output to 3
     */
    static final int INT_SEQUENCE_ONE = 1122;

    /**
     * Should output to 4
     */
    static final int INT_SEQUENCE_TWO = 1111;

    /**
     * Should output to 0
     */
    static final int INT_SEQUENCE_THREE = 1234;

    /**
     * Should output to 9
     */
    static final int INT_SEQUENCE_FOUR = 91212129;

    /**
     * Should output to 4
     */
    static final String VALID_STRING_ONE = "1111";

    /**
     * Should output to 9
     */
    static final String VALID_STRING_TWO = "91212129";

    /**
     * Should throw an exception
     */
    static final String INVALID_STRING_ONE = "123G4";

    /**
     * Should throw an exception
     */
    static final String INVALID_STRING_TWO = "Numberwang";

    /**
     * Should throw an exception
     */
    static final String INVALID_STRING_THREE = "3333!333";

    /**
     * Produces 6
     */
    static final int INT_HALFWAY_ONE = 1212;

    /**
     * Produces 0
     */
    static final int INT_HALFWAY_TWO = 1221;

    /**
     * Produces 4
     */
    static final String STRING_HALFWAY_ONE = "123425";

    /**
     * Produces 12
     */
    static final String STRING_HALFWAY_TWO = "123123";

    private CaptchaTestValues(){}


}
