import java.util.Scanner;

public class InputMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);
        // for every row
        for (int row = 0; row < arr.length; row++) {

            //for every column
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print("Enter arr[" + row + "][" + column+"] : ");
                arr[row][column] = sc.nextInt();
            }

        }
    }
}
