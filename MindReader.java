import java.util.Scanner;


public class MindReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuePlaying;
        System.out.println("\nWelcome to the Mind Readers Tent.\nHere you will think of a number and I will guess it.\n\nIf the number is too high, type h.\nIf it's too low, type l.\nWhen I get it correct, type c.\n\nLet us begin.");
        
        do {
            int high = 100;
            int low = 1;
            
            for (int i = 1; i <= 7; i++) { // i/count starts at one and increases each round. If i is greater than seven, the user has been giving invalid guesses and the game ends
                int currentGuess = (low + high) / 2;
                System.out.println("\n\n\nIs your number " + currentGuess + "?");
                String reply = scanner.nextLine();

                if (reply.equals("c")) {
                    System.out.println("\nI've conquered another mind in only " + i + " guesse(s).");
                    break;
                }
                else if (reply.equals("l")) {
                    low = currentGuess + 1;
                }
                else if (reply.equals("h")) {
                    high = currentGuess - 1;
                }
                else {
                    System.out.println("\nI'm not quite sure what you're trying to tell me. You need to say l, h, or c\n");
                    break;
                }
            } 
            System.out.println("\nIt seems our game has come to an end.\nPlay again? y/n");
            String playAgainPrompt = scanner.nextLine();

            if (playAgainPrompt.equals("y")) {
                continuePlaying = true;
            }
            else {
                continuePlaying = false;
            }
        } while (continuePlaying);
        scanner.close();
    }
}
