package com.gkenna.advent.day1;

import com.gkenna.advent.day1.exception.InvalidCaptchaInput;
import org.junit.Test;


/**
 * Created by gkenna on 05/12/17.
 */
public class CaptchaUtilsTest {

    /**
     * Should output to 3
     */
    private static final int INT_SEQUENCE_ONE = 1122;

    /**
     * Should output to 4
     */
    private static final int INT_SEQUENCE_TWO = 1111;

    /**
     * Should output to 0
     */
    private static final int INT_SEQUENCE_THREE = 1234;

    /**
     * Should output to 9
     */
    private static final int INT_SEQUENCE_FOUR = 91212129;

    /**
     * Should output to 0
     */
    private static final long LONG_SEQUENCE_ONE = 1234l;

    /**
     * Should output to 9
     */
    private static final long LONG_SEQUENCE_TWO = 91212129l;

    /**
     * Should output to 4
     */
    private static final String VALID_STRING_ONE = "1111";

    /**
     * Should output to 9
     */
    private static final String VALID_STRING_TWO = "91212129";

    /**
     * Should throw an exception
     */
    private static final String INVALID_STRING_ONE = "123G4";

    /**
     * Should throw an exception
     */
    private static final String INVALID_STRING_TWO = "Numberwang";

    /**
     * Should throw an exception
     */
    private static final String INVALID_STRING_THREE = "3333!333";


    @Test
    public void inverseCaptchaValidString() throws InvalidCaptchaInput {
        int validOutput;

        validOutput = CaptchaUtils.inverseCaptcha(VALID_STRING_ONE);
        assert (validOutput == 4);

        validOutput = CaptchaUtils.inverseCaptcha(VALID_STRING_TWO);
        assert (validOutput == 9);
    }

    @Test(expected = InvalidCaptchaInput.class)
    public void inverseCaptchaInValidStringOne() throws InvalidCaptchaInput {
        final int invalidString = CaptchaUtils.inverseCaptcha(INVALID_STRING_ONE);
    }

    @Test(expected = InvalidCaptchaInput.class)
    public void inverseCaptchaInValidStringTwo() throws InvalidCaptchaInput {
        final int invalidString = CaptchaUtils.inverseCaptcha(INVALID_STRING_TWO);
    }

    @Test(expected = InvalidCaptchaInput.class)
    public void inverseCaptchaInValidStringThree() throws InvalidCaptchaInput {
        final int invalidString = CaptchaUtils.inverseCaptcha(INVALID_STRING_THREE);
    }

    @Test
    public void inverseCaptchaInt() {
        int validOutput;

        validOutput = CaptchaUtils.inverseCaptcha(INT_SEQUENCE_ONE);
        assert (validOutput == 3);

        validOutput = CaptchaUtils.inverseCaptcha(INT_SEQUENCE_TWO);
        assert (validOutput == 4);

        validOutput = CaptchaUtils.inverseCaptcha(INT_SEQUENCE_THREE);
        assert (validOutput == 0);

        validOutput = CaptchaUtils.inverseCaptcha(INT_SEQUENCE_FOUR);
        assert (validOutput == 9);
    }

    @Test
    public void inverseCaptchaLong() {
        int validOutput;

        validOutput = CaptchaUtils.inverseCaptcha(LONG_SEQUENCE_ONE);
        assert (validOutput == 0);

        validOutput = CaptchaUtils.inverseCaptcha(LONG_SEQUENCE_TWO);
        assert (validOutput == 9);
    }

}