package edu.Frostburg.COSC470_Aaron_Davis_Compiler;

import java.util.HashMap;

/**
 * @author aarondavis
 */
public class SymbolTable {

    private HashMap<String, Token> map;

    public SymbolTable() {
        map = new HashMap<>();
    }

    protected void insert(String s, Token t) {
        if(map.containsKey(s)) new Error(41, "Symbol already exists in symbol table");
        else map.put(s,t);
    }
    protected boolean contains(String s) {
        return map.containsKey(s);
    }
    protected Token retrieve(String s) {
        return map.get(s);
    }
}
