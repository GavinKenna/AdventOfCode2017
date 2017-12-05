package com.gkenna.advent.day1;

import com.gkenna.advent.day1.exception.InvalidCaptchaInput;
import org.apache.commons.cli.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by gkenna on 05/12/17.
 */
public class Entry {

    public static void main(String[] args) {

        final Options options = new Options();
        final CommandLineParser parser = new BasicParser();
        final HelpFormatter formatter = new HelpFormatter();
        final CommandLine cmd;

        /**
         * The Captcha input
         */
        final String input;

        /**
         * Eventual output
         */
        final int output;

        options.addOption("f", true,
                "Specify location of a file that contains a Captcha Input");
        options.addOption("i", true, "A list of digits");
        options.addOption("h", false, "Help");

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        if (cmd.hasOption("f")) {
            byte[] encoded;
            try {
                encoded = Files.readAllBytes(Paths.get(cmd.getOptionValue("f")));
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            input = new String(encoded, Charset.defaultCharset());
        } else if (cmd.hasOption("i")) {
            input = String.valueOf(cmd.getOptionValue("i"));
        } else if (cmd.hasOption("h")) {
            formatter.printHelp("Day1", options);
            return;
        } else {
            formatter.printHelp("Day1", options);
            return;
        }

        try {
            output = CaptchaUtils.inverseCaptcha(input);
        } catch (InvalidCaptchaInput invalidCaptchaInput) {
            System.out.printf("% is not a valid captcha", input);
            invalidCaptchaInput.printStackTrace();
            return;
        }

        System.out.println("Output is :: " + output);
    }
}
