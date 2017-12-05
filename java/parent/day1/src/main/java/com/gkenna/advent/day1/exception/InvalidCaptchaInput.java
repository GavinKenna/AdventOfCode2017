package com.gkenna.advent.day1.exception;

/**
 * Created by gkenna on 05/12/17.
 *
 * A simple exception class for signalling an invalid Captcha was submitted, i.e. a non-numerical sequence
 */
public class InvalidCaptchaInput extends Exception {
    public InvalidCaptchaInput(String input) {
        super(input);
    }
}
