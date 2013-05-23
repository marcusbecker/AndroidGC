/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mvbos.androidgc;

/**
 *
 * @author mbecker
 */
public class CMD {

    public static final String ANDROID_VALUE_SEP = ":";

    public static Power parsePowerCommand(String strCommand) {
        if (strCommand == null || strCommand.isEmpty()) {
            return null;
        }

        String cmd = strCommand.toLowerCase();
        for (Power p : Power.values()) {
            if (cmd.startsWith(p.getName())) {
                return p;
            }
        }

        return null;
    }

    public enum Power {

        AC(" ac "), STATUS(" status "), HEALT(" health "),
        PRESENT(" present "), CAPACITY(" capacity "), DISPLAY(" display");
        private final String PREFIX = "power";
        private String command;

        Power(String cmd) {
            command = cmd;
        }

        public String getName() {
            return command.trim();
        }

        public String getCommand() {
            return PREFIX + command;
        }
    }

    public static String getValue(String res) {
        return res.split(ANDROID_VALUE_SEP)[1].trim();
    }
}
