import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] table = new int[10];
        Random random = new Random();
        boolean newRun = false;

        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(9);
        }

        for (int j = 0; j < table.length; j++) {

            if (!newRun) {
                System.out.printf("%d ", table[j]);
            } else {
                System.out.printf("%d ", table[table.length - (j + 1)]);
            }
            if (j == table.length - 1 && newRun == false) {
                System.out.printf("%d ", table[j]);
                newRun = true;
                j = 0;
            }
        }
    }
}
