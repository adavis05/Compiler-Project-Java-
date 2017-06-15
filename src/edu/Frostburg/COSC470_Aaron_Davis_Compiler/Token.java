package edu.Frostburg.COSC470_Aaron_Davis_Compiler;

/**
 * Token class
 * @author aarondavis
 */
public class Token {
    public int id;
    public String value;
    public String type;
    public String place;

    /**
     * String representation of Token
     *
     * @return String representation of Token
     */
    public String toString() {
        return (value + " " + id);
    }
}
