import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random rand = new Random();
        Random rand1 = new Random(7);
        int obj1 = rand.nextInt(6) + 1;
        int obj2 = rand.nextInt(6) + 1;
        int obj3 = rand.nextInt(6) + 1;
        int obj4 = rand1.nextInt(7);

        System.out.println("Unseeded Die 1: " + obj1);
        System.out.println("Unseeded Die 2: " + obj2);
        System.out.println("Unseeded Die 3: " + obj3);
        System.out.println("Seeded Die: " + obj4);
    }
}
