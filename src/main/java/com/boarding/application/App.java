package main.java.com.boarding.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import main.java.com.boarding.controller.MainMenuController;
import main.java.com.boarding.view.MenuView;

public class App {
    public static void main() {
        MainMenuController mainMenu = new MainMenuController();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                MenuView.displayMenu();
                System.out.print("Pilih opsi: ");

                int userOption = input.nextInt();
                input.nextLine();

                if (userOption == 5) {
                    running = false;
                    break;
                }

                mainMenu.handleMenu(userOption);
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                input.nextLine();
            }
        }
        input.close();
    }
}
