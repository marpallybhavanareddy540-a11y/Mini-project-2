import java.util.InputMismatchException;
import java.util.Scanner;

class EscapeRoom {
    private int lives = 3;
    private Scanner sc = new Scanner(System.in);

    public void startGame() {
        System.out.println("====================================");
        System.out.println("      ESCAPE ROOM CHALLENGE");
        System.out.println("====================================");
        System.out.println("You have " + lives + " lives.");
        System.out.println("Solve all 4 puzzles to escape!\n");

        if (room1() && room2() && room3() && room4()) {
            System.out.println("\n********************************");
            System.out.println("CONGRATULATIONS!");
            System.out.println("You escaped the mysterious room!");
            System.out.println("********************************");
        } else {
            System.out.println("\nGAME OVER!");
            System.out.println("Better luck next time.");
        }
    }

    private boolean checkLife() {
        if (lives <= 0) {
            return false;
        }
        return true;
    }

    private void wrongAnswer() {
        lives--;
        System.out.println("Wrong Answer!");
        System.out.println("Lives Left: " + lives);
    }

    // Room 1
    private boolean room1() {
        while (checkLife()) {
            try {
                System.out.println("\nRoom 1");
                System.out.println("What is the output of 5 + 3 * 2 ?");
                System.out.println("1. 16");
                System.out.println("2. 11");
                System.out.println("3. 13");
                System.out.print("Enter choice: ");

                int ans = sc.nextInt();

                if (ans == 2) {
                    System.out.println("Door 1 Unlocked!");
                    return true;
                } else {
                    wrongAnswer();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                sc.next();
            }
        }
        return false;
    }

    // Room 2
    private boolean room2() {
        while (checkLife()) {
            try {
                System.out.println("\nRoom 2");
                System.out.println("Which keyword is used to create an object?");
                System.out.println("1. class");
                System.out.println("2. new");
                System.out.println("3. this");
                System.out.print("Enter choice: ");

                int ans = sc.nextInt();

                if (ans == 2) {
                    System.out.println("Door 2 Unlocked!");
                    return true;
                } else {
                    wrongAnswer();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                sc.next();
            }
        }
        return false;
    }

    // Room 3
    private boolean room3() {
        while (checkLife()) {
            try {
                System.out.println("\nRoom 3");
                System.out.println("How many times does this loop execute?");
                System.out.println("for(int i=1;i<=5;i++)");
                System.out.println("1. 4");
                System.out.println("2. 5");
                System.out.println("3. 6");
                System.out.print("Enter choice: ");

                int ans = sc.nextInt();

                if (ans == 2) {
                    System.out.println("Door 3 Unlocked!");
                    return true;
                } else {
                    wrongAnswer();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                sc.next();
            }
        }
        return false;
    }

    // Room 4
    private boolean room4() {
        while (checkLife()) {
            try {
                System.out.println("\nFinal Room");
                System.out.println("Which concept allows one method to have many forms?");
                System.out.println("1. Encapsulation");
                System.out.println("2. Inheritance");
                System.out.println("3. Polymorphism");
                System.out.print("Enter choice: ");

                int ans = sc.nextInt();

                if (ans == 3) {
                    System.out.println("Final Door Unlocked!");
                    return true;
                } else {
                    wrongAnswer();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!");
                sc.next();
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        EscapeRoom game = new EscapeRoom();
        game.startGame();
    }
}
