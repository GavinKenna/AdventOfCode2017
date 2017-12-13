package com.gkenna.advent.day2;

import org.apache.commons.cli.*;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by gkenna on 07/12/17.
 */
public class Entry {

    public static void main(String[] args) throws IOException {

        final Options options = new Options();
        final CommandLineParser parser = new BasicParser();
        final HelpFormatter formatter = new HelpFormatter();
        final CommandLine cmd;

        /**
         * The Captcha input
         */
        final String[] input;

        final int output;

        options.addOption("f", true,
                "Specify location of a file that contains a Spreadsheet Input");
        options.addOption("h", false, "Help");

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        if (cmd.hasOption("f")) {
            final Path file = Paths.get(cmd.getOptionValue("f"));
            List<String> lines = Files.readAllLines(file, Charset.defaultCharset());
            input = lines.toArray(new String[lines.size()]);
        } else {
            formatter.printHelp("Day1", options);
            return;
        }

        output = SpreadsheetUtil.calculateChecksum(input);

        System.out.println("Output is :: " + output);
    }
}
