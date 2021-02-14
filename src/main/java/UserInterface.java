/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vdmclcv
 */
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdManager birdManager;

    public UserInterface(Scanner scanner, BirdManager birdManager) {
        this.scanner = scanner;
        this.birdManager = birdManager;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                birdManager.addBird(name, latinName);
            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                birdManager.addObservation(bird);
            } else if (command.equals("All")) {
                if (birdManager.getBirdList().size() == 0) {
                    System.out.println("No birds in database.");
                } else {
                    for (Bird bird : birdManager.getBirdList()) {
                        System.out.println(bird.toString());
                    }
                }
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                Bird foundBird = birdManager.findBird(bird);
                if (foundBird == null) {
                    System.out.println("No such bird in database.");
                } else {
                    System.out.println(foundBird.toString());
                }
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }

    }
}
