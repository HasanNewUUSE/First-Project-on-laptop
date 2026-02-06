import java.util.Scanner;
import java.util.Random;
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int heads = 0;
        int tails = 0;
        for(int i = 1; i <= 100; i++){
            boolean con = random.nextBoolean();
            if (con){
                heads++;
            }
            else {
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        scanner.close();
    }
}