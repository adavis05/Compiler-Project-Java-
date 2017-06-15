package edu.Frostburg.COSC470_Aaron_Davis_Compiler;

import java.util.HashMap;

/**
 * @author aarondavis
 */
public class Terminals {

    public HashMap<String, Integer> terminalsMap;

    private String[] terminals = {
            "static", "void", "id", "(", ")", "{", "}", "$", "public",
            "private", ",", "var", ":", ";", "char", "int", "get", "put",
            "if", "while", "=", "num", "true", "false","'", "literal", ">",
            ">=", "==", "<=", "<", "<>", "+", "-", "*", "/", "%"
    };

    /**
     * Constructor for terminals
     */
    public Terminals() {
        terminalsMap = new HashMap<>();
        int i = 1;
        for (String s: terminals) {
            terminalsMap.put(s,i++);
        }
    }

}
