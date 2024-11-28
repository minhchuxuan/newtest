import java.util.Arrays;
import java.util.Scanner;


public class ArrayProb{
    public static void main (String[] args){
        int[] defarray = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array by enter numbers separating by space or press Enter to use Default value: ");

        String uInput = scanner.nextLine();

        int[] uArray;

        if (uInput.trim().isEmpty()) {
            uArray = defarray;
            System.out.println("Using default value: " + Arrays.toString(defarray));
        } else {
            String[] string = uInput.split(" ");
            uArray = new int[string.length];
            for (int i = 0; i< string.length; i++){
                uArray[i] = Integer.parseInt(string[i]);
            }
        }

        Arrays.sort(uArray);

        int sum = 0;
        for (int num : uArray) {
            sum += num;
        }
        double average = (double) sum / uArray.length;
        
        System.out.println("Sorted Array: " + Arrays.toString(uArray));
        
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);
        
        scanner.close();
    }
}