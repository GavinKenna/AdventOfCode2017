package com.gkenna.advent.day1;

import com.gkenna.advent.day1.exception.InvalidCaptchaInput;
import org.junit.Test;


/**
 * Created by gkenna on 05/12/17.
 */
public class CaptchaUtilsTest {


    @Test
    public void inverseCaptchaValidString() throws InvalidCaptchaInput {
        int validOutput;

        validOutput = CaptchaUtils.inverseCaptcha(CaptchaTestValues.VALID_STRING_ONE);
        assert (validOutput == 4);

        validOutput = CaptchaUtils.inverseCaptcha(CaptchaTestValues.VALID_STRING_TWO);
        assert (validOutput == 9);
    }

    @Test(expected = InvalidCaptchaInput.class)
    public void inverseCaptchaInValidStringOne() throws InvalidCaptchaInput {
        final int invalidString = CaptchaUtils.inverseCaptcha(CaptchaTestValues.INVALID_STRING_ONE);
    }

    @Test(expected = InvalidCaptchaInput.class)
    public void inverseCaptchaInValidStringTwo() throws InvalidCaptchaInput {
        final int invalidString = CaptchaUtils.inverseCaptcha(CaptchaTestValues.INVALID_STRING_TWO);
    }

    @Test(expected = InvalidCaptchaInput.class)
    public void inverseCaptchaInValidStringThree() throws InvalidCaptchaInput {
        final int invalidString = CaptchaUtils.inverseCaptcha(CaptchaTestValues.INVALID_STRING_THREE);
    }

    @Test
    public void inverseCaptchaInt() {
        int validOutput;

        validOutput = CaptchaUtils.inverseCaptcha(CaptchaTestValues.INT_SEQUENCE_ONE);
        assert (validOutput == 3);

        validOutput = CaptchaUtils.inverseCaptcha(CaptchaTestValues.INT_SEQUENCE_TWO);
        assert (validOutput == 4);

        validOutput = CaptchaUtils.inverseCaptcha(CaptchaTestValues.INT_SEQUENCE_THREE);
        assert (validOutput == 0);

        validOutput = CaptchaUtils.inverseCaptcha(CaptchaTestValues.INT_SEQUENCE_FOUR);
        assert (validOutput == 9);
    }

    @Test
    public void inverseCaptchaIntHalfway() throws InvalidCaptchaInput {
        int validOutput;

        validOutput = CaptchaUtils.inverseCaptcha(CaptchaTestValues.INT_HALFWAY_ONE, IterationStrategy.HALFWAY);
        assert (validOutput == 6);

        validOutput = CaptchaUtils.inverseCaptcha(CaptchaTestValues.INT_HALFWAY_TWO, IterationStrategy.HALFWAY);
        assert (validOutput == 0);

        validOutput = CaptchaUtils.inverseCaptcha(CaptchaTestValues.STRING_HALFWAY_ONE, IterationStrategy.HALFWAY);
        assert (validOutput == 4);

        validOutput = CaptchaUtils.inverseCaptcha(CaptchaTestValues.STRING_HALFWAY_TWO, IterationStrategy.HALFWAY);
        assert (validOutput == 12);
    }


}