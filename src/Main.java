
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//   =====Task 1, 2 combined=====

        int[] firstArray = new int[3];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
        }
        double[] secondArray = {1.57, 7.654, 9.986};
        boolean[] thirdArray = {true, false, false};
        System.out.println("=====Task 1=====");
        System.out.printf("%s \n%s \n%s \n", Arrays.toString(firstArray), Arrays.toString(secondArray), Arrays.toString(thirdArray));

        System.out.println("Inverted:");

        String arrayString = Arrays.toString(firstArray);
        inversionForAnyArray(arrayString);

        arrayString = Arrays.toString(secondArray);
        inversionForAnyArray(arrayString);

        arrayString = Arrays.toString(thirdArray);
        inversionForAnyArray(arrayString);

//        =====Task 3=====
        System.out.println("=====Task 3=====");
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 0) {
                continue;
            }
            firstArray[i] += 1;
        }
        System.out.println(Arrays.toString(firstArray));

    }
    private static void inversionForAnyArray(String arrayString) {
        StringBuilder result = new StringBuilder();
        String symbolsRemoved = arrayString.replace(",", "").replace("]", "").replace("[", "");
        String[] arrayStringSplit = symbolsRemoved.split("\\s+");
        for (int i = arrayStringSplit.length - 1; i >=0 ; i--) {
            if (i == arrayStringSplit.length - 1){
                result.append("[");
            }
            result.append(arrayStringSplit[i]);
            if (i == 0) {
                result.append("]");
                break;
            }
            result.append(", ");
        }
        System.out.println(result);

    }
}
