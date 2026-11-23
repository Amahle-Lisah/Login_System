package com.mycompany.login_system;

/**
 * This class stores the details a user registers with, and checks
 * whether a later login matches those details.
 *
 * @author Amahle Lisah Khumalo
 */
public class Registration {

    // The registered details are private so they can only be used through the methods below
    private String username;
    private String password;

    // Saves the details the user typed in when registering
    public void registerUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Returns true only if BOTH the username and password match what was registered. 
    // This is the only place the check is done.
    public boolean checkLogin(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    // Returns the registered username so it can be used in the welcome message
    public String getUsername() {
        return username;
    }
}//end of class