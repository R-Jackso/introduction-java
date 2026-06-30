import java.util.Random;

public class Toolbox {
    int square(int n) { // returns the square of n
            return n*n;
        }
    int max(int a, int b) { // returns the greater of two ints
        return (a > b) ? a : b;
    }
    boolean isEven(int n) { // returns whether an int is even
        return (n % 2 == 0) ? true : false;
    }
    void describe(int n) { // describes an int in terms of its square, whether it's greater or less than 10, and if it's even
        System.out.println("\n" + n + "^2: " + square(n) + " | " + "Greater Value: " + max(n, 10) + " | " + n + " Is Even: " + isEven(n));
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        Toolbox tool = new Toolbox();

        for (int i = 0; i <= 2; i++) { // runs three times, generates random ints from 0 to 20 and describes them
            int x = rand.nextInt(21);
            tool.describe(x);
        }
        
        System.out.println("\n");
    }
}
