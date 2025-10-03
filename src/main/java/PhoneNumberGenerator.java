import java.util.Random;
import java.lang.String;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        Random rand = new Random();
        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        int num1 = rand.nextInt(7) + 1;
        int num2 = rand.nextInt(7) + 1;
        int num3 = rand.nextInt(7) + 1;
        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        int num4 = rand.nextInt(742);
        String str = String.format("%03d", num4);
        // TODO: Generate third three digits (XXX)
        int num7 = rand.nextInt(8) + 1;
        int num8 = rand.nextInt(8) + 1;
        int num9 = rand.nextInt(8) + 1;
        
        // TODO: Format and display phone number as XXX-XXX-XXX
        System.out.printf("%d%d%d-%s-%d%d%d", num1, num2, num3, str, num7, num8, num9);
    }
}
