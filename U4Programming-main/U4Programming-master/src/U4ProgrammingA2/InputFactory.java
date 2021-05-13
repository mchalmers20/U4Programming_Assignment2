package U4ProgrammingA2;

import java.util.Scanner; // It would import the scanner

public class InputFactory {

    protected static Scanner SC = new Scanner(System.in);

    public static int checkInput(int iInput) { // This is the user input that is passed onto the menu, this would be passed through as iInput
        return iInput;
    }
}
