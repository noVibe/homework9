
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
//   =====Task 1, 2 combined=====

        int[] firstArray = {1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        boolean[] thirdArray = {true, false, false};
        System.out.println("=====Task 1=====");
        System.out.println(Arrays.toString(firstArray) + " " + Arrays.toString(secondArray) + " " + Arrays.toString(thirdArray));

        StringJoiner arrayReverse = new StringJoiner("");

        for (int i = 1; ; i++) {
            if (i == 1) {
                arrayReverse.add("[");
            }
            String currentIndex = String.valueOf(firstArray[firstArray.length - i]);
            arrayReverse.add(currentIndex);
            if (i == firstArray.length) {
                arrayReverse.add("] \n");
                break;
            }
            arrayReverse.add(" ");
        }
        for (int i = 1; ; i++) {
            if (i == 1) {
                arrayReverse.add("[");
            }
            String currentIndex = String.valueOf(secondArray[secondArray.length - i]);
            arrayReverse.add(currentIndex);
            if (i == secondArray.length) {
                arrayReverse.add("] \n");
                break;
            }
            arrayReverse.add(" ");
        }
        for (int i = 1; ; i++) {
            if (i == 1) {
                arrayReverse.add("[");
            }
            String currentIndex = String.valueOf(thirdArray[thirdArray.length - i]);
            arrayReverse.add(currentIndex);
            if (i == thirdArray.length) {
                arrayReverse.add("] ");
                break;
            }
            arrayReverse.add(" ");
        }
        System.out.println("=====Task 2=====");
        System.out.println(arrayReverse);
//        =====Task 3=====
        System.out.println("=====Task 3=====");
        int[] arrayTask3 = firstArray;
        for (int i = 0; i < arrayTask3.length; i++) {
            if (arrayTask3[i] % 2 == 0) {
                continue;
            }
            arrayTask3[i] += 1;
        }
        System.out.println(Arrays.toString(arrayTask3));

    }
}
