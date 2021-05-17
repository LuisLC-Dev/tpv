package oop.inheritance.verifone.vx690;

import oop.inheritance.verifone.vx520.VerifoneVx520Display;

public class VerifoneVx690Display {

    private static VerifoneVx690Display uniqueInstance;

    private VerifoneVx690Display() {
    }

    public static VerifoneVx690Display getInstance()
    {
        if(uniqueInstance==null)
            uniqueInstance = new VerifoneVx690Display();
        return uniqueInstance;
    }

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
