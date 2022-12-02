import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> exactNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1, 100));
            if (numbers.get(i) % 2 == 0) {
                evenNumbers.add(numbers.get(i));
            } else {
                exactNumbers.add(numbers.get(i));
            }
        }


        System.out.println("Oll Numbers = " + numbers);
        System.out.println("-----------------------------------");
        System.out.print(" Even Numbers : \n" + evenNumbers + " ");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Exact Numbers : \n" + exactNumbers + " ");

    }

    }