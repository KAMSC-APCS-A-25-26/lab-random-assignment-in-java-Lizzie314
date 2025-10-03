import java.util.Random;
import java.text.DecimalFormat;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        Random rand = new Random();
        Random rand1 = new Random(1);
        
        // TODO: Generate random double values from both Random objects
        double obj1 = rand.nextDouble();
        double obj2 = rand1.nextDouble();
        
        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        DecimalFormat decimal = new DecimalFormat("#%##.##");
        
        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
        System.out.println("Unseeded Random: " + decimal.format(obj1));
        System.out.println("Seeded Random: " + decimal.format(obj2));
    }
}