package com.gkenna.advent.day1;

import com.gkenna.advent.day1.exception.InvalidCaptchaInput;

/**
 * Created by gkenna on 05/12/17.
 *
 * A utils class for reversing a Captcha
 */
public final class CaptchaUtils {

    private CaptchaUtils() {
    }

    /**
     * <p>Takes in a char sequence, iterates throughout and compares the current value with the next.
     * The last object in the array compares itself with the first object in the array.
     * If the two match then the value is added to the output.</p>
     *
     * <h2>Example</h2>
     * <code>{'1','1','2','2','1'}</code> was passed in.
     * <p>Sum = 0</p>
     * <p>1 matches with the next value -> 1 (+1)              Sum = 1</p>
     * <p>2 matches with the next value -> 2 (+2)              Sum = 3</p>
     * <p>The last element matches with the first element (+1) Sum = 4</p>
     * @param captchaInput A char array of numerical values
     * @return A summation of all the matched values
     */
    private static int inverseCaptcha(final char[] captchaInput) {
        final int captchaInputLength = captchaInput.length;
        int sum = 0, current, next;

        /**
         * Here we loop through the char array.
         * At each element we convert it into a int, as well as it's following element.
         * Notice the [(i + 1) % captchaInputLength] for the following element, this piece of code
         * allows us to get the next element in the array, and if we've reached the end of the
         * array it grabs the first element
         */
        for (int i = 0; i < captchaInputLength; i++) {
            current = Character.getNumericValue(captchaInput[i]);
            next = Character.getNumericValue(captchaInput[(i + 1) % captchaInputLength]);
            if (current == next) {
                sum += current;
            }
        }

        return sum;
    }

    /**
     * <p>Takes in a String of int values, iterates throughout and compares the current value with the next.
     * The last object in the array compares itself with the first object in the array.
     * If the two match then the value is added to the output.</p>
     *
     * <h2>Example</h2>
     * <code>"11221"</code> was passed in.
     * <p>Sum = 0</p>
     * <p>1 matches with the next value -> 1 (+1)              Sum = 1</p>
     * <p>2 matches with the next value -> 2 (+2)              Sum = 3</p>
     * <p>The last element matches with the first element (+1) Sum = 4</p>
     * @param captchaInput A String of numerical values
     * @return
     * @throws InvalidCaptchaInput
     */
    public static int inverseCaptcha(final String captchaInput) throws InvalidCaptchaInput {
        if (!captchaInput.trim().matches("[0-9]+")) {
            throw new InvalidCaptchaInput("Captcha should only contain numbers");
        }
        return inverseCaptcha(captchaInput.trim().toCharArray());
    }

    /**
     * <p>Takes in an int sequence, iterates throughout and compares the current value with the next.
     * The last object in the array compares itself with the first object in the array.
     * If the two match then the value is added to the output.</p>
     *
     * <h2>Example</h2>
     * <code>{1,1,2,2,1}</code> was passed in.
     * <p>Sum = 0</p>
     * <p>1 matches with the next value -> 1 (+1)              Sum = 1</p>
     * <p>2 matches with the next value -> 2 (+2)              Sum = 3</p>
     * <p>The last element matches with the first element (+1) Sum = 4</p>
     * @param captchaInput An int array of numerical values
     * @return A summation of all the matched values
     */
    public static int inverseCaptcha(final int captchaInput) {
        return inverseCaptcha(String.valueOf(captchaInput).toCharArray());
    }

    /**
     * <p>Takes in a long sequence, iterates throughout and compares the current value with the next.
     * The last object in the array compares itself with the first object in the array.
     * If the two match then the value is added to the output.</p>
     *
     * <h2>Example</h2>
     * <code>{1l,1l,2l,2l,1l}</code> was passed in.
     * <p>Sum = 0</p>
     * <p>1 matches with the next value -> 1 (+1)              Sum = 1</p>
     * <p>2 matches with the next value -> 2 (+2)              Sum = 3</p>
     * <p>The last element matches with the first element (+1) Sum = 4</p>
     * @param captchaInput A long array of numerical values
     * @return A summation of all the matched values
     */
    public static int inverseCaptcha(final long captchaInput) {
        return inverseCaptcha(String.valueOf(captchaInput).toCharArray());
    }

}
