import java.util.Scanner;

public class SumOfArray{
        public static void main(String[] args) {
            int[][] array1 = new int[2][2];
            int[][] array2 = new int[2][2];
            int[][] sumArray = new int[2][2];
            Scanner scanner = new Scanner(System.in);
    
            // Input array elements of the first array
            System.out.print("Enter array elements of the first array: ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    array1[i][j] = scanner.nextInt();
                }
            }
    
            // Input array elements of the second array
            System.out.print("Enter array elements of the second array: ");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    array2[i][j] = scanner.nextInt();
                }
            }
    
            // Calculate the sum of the two arrays
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    sumArray[i][j] = array1[i][j] + array2[i][j];
                }
            }
    
            // Display the sum array
            System.out.println("Sum of the arrays is:");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(sumArray[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    