package com.example.validatorlibrary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static final int PASSWORD_LENGTH = 8;

    /**
     * Check if the string is valid firstName/lastName
     * @param name name to check
     * @return true or false
     */
    public static boolean validateName(String name){
        name = name.trim();
        if(name.isEmpty() || !(name.matches("[a-zA-z]+")))
            return false;
        return true;
    }

    /**
     * Check if the string is valid email address
     * @param email email address to check
     * @return true or false
     */
    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * Check if the String is valid phone number
     * @param phone phone to check
     * @return true or false
     */
    public static boolean validatePhone(String phone){
        String patterns
                = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"
                + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$"
                + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";

        Pattern pattern = Pattern.compile(patterns);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    /**
     *  Check if the String is valid password by the following rules:
     *  A password must have at least eight characters,
     *  A password consists of only letters and digits,
     *  A password must contain at least two digits
     * @param password password to check
     * @return true or false
     */
    public static boolean validatePassword(String password){
        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
