package com;

import java.util.regex.Pattern;

public class UserValidation {
    /**
     * validateRegex - method to check the pattern of regex with provided input
     *
     * @param request - input data to be checked with the pattern
     * @param pattern - regex that needs to be matched with input
     * @return - returns boolean value to the condition from where it's called.
     */
    private boolean validateRegex(String request, String pattern) {
        return Pattern.compile(pattern).matcher(request).matches();
    }

    /**
     * isFirstNameValid - method to check validity of first name
     *
     * @param firstName - user input data
     * @return - boolean value if first name matches with its regex condition
     */
    public boolean isFirstNameValid(String firstName){

        /*
        validateRegex function is called by passing first name user input
        and first name regex pattern stored in RegexConstants class
         */
        if (validateRegex(firstName, RegexConstants.FIRST_NAME_REGEX)){
            return true;
        } else {
            System.out.println("Invalid first name.");
        }
        return false;
    }

    /**
     * isLastNameValid - method to check validity of last name
     *
     * @param lastName - user input data
     * @return - boolean value if first name matches with its regex condition
     */
    public boolean isLastNameValid(String lastName){
        /*
        validateRegex function is called by passing last name user input
        and last name regex pattern stored in RegexConstants class
         */
        if (validateRegex(lastName, RegexConstants.LAST_NAME_REGEX)){
            return true;
        } else {
            System.out.println("Invalid last name.");
        }
        return false;
    }

    /**
     * isEmailValid - method to check validity of email
     *
     * @param email - user input data
     * @return - boolean value if email matches with its regex condition
     */
    public boolean isEmailValid(String email){
        /*
        validateRegex function is called by passing email user input
        and email regex pattern stored in RegexConstants class
         */
        if (validateRegex(email, RegexConstants.EMAIL_REGEX)){
            return true;
        } else {
            System.out.println("Invalid email.");
        }
        return false;
    }

    /**
     * isPhoneNumberValid - method to check validity of phone number
     *
     * @param phoneNumber - user input data
     * @return - boolean value if phone number matches with its regex condition
     */
    public boolean isPhoneNumberValid(String phoneNumber){
        /*
        validateRegex function is called by passing phone number user input
        and phone number regex pattern stored in RegexConstants class
         */
        if (validateRegex(phoneNumber, RegexConstants.PHONE_NUMBER_REGEX)){
            return true;
        } else {
            System.out.println("Invalid phone number.");
        }
        return false;
    }

    /**
     * isPasswordValid - method to check validity of password
     *
     * @param password - user input data
     * @return - boolean value if password matches with its regex condition
     */
    public boolean isPasswordValid(String password){
        /*
        validateRegex function is called by passing password user input
        and password regex pattern stored in RegexConstants class
         */
        if (validateRegex(password, RegexConstants.PASSWORD_REGEX)){
            return true;
        } else {
            System.out.println("Invalid password.");
        }
        return false;
    }
}
