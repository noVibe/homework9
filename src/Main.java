
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//      =====Task 1=====
        int[] firstArray = new int[3];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
        }
        double[] secondArray = {1.57, 7.654, 9.986};
        boolean[] thirdArray = {true, false, false};

//      =====Task 2=====
        System.out.println("=====Task 2=====");
        System.out.printf("%s \n%s \n%s \n", Arrays.toString(firstArray), Arrays.toString(secondArray), Arrays.toString(thirdArray));

//      =====Task 3=====
        System.out.println("=====Task 3=====");
        String arrayString = Arrays.toString(firstArray);
        inversionForAnyArray(arrayString);
        arrayString = Arrays.toString(secondArray);
        inversionForAnyArray(arrayString);
        arrayString = Arrays.toString(thirdArray);
        inversionForAnyArray(arrayString);

//        ======Task 4======
        System.out.println("=====Task 3=====");
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0) {
                continue;
            }
            firstArray[i] += 1;
        }
        System.out.println(Arrays.toString(firstArray));

    }
    // Method of Task 3
    private static void inversionForAnyArray(String arrayString) {
        String symbolsRemoved = arrayString.replace(",", "").replace("]", "").replace("[", "");
        String[] arrayStringSplit = symbolsRemoved.split("\\s");
        Collections.reverse(Arrays.asList(arrayStringSplit));
        System.out.println(Arrays.asList(arrayStringSplit));
    }
}
