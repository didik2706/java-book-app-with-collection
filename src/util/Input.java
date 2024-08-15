package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getInput(String message) {
        System.out.print(message.concat(" : "));
        return scanner.nextLine();
    }
}
