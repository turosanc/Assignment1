import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Welcome to the Number Guessing Game! ===");

        GameEngine engine = new GameEngine(1, 100);
        GameUI ui = new GameUI(engine, new Scanner(System.in));

        ui.start();

        System.out.println("Thanks for playing!");
    }
}
