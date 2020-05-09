package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOn = true;
        while (isOn){
            System.out.println("Press:\nq to quit\nt to tab\ne to enter");
            String key = scanner.nextLine();
            Keyboard keyboard = new Keyboard();
            keyboard.start(key);
            keyboard.getButton().click();
            if(key.equals("q")){
                isOn = false;
            }
        }
    }
}
