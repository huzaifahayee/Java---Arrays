import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] str = new String[4];

        //input
        for(int i=0;i< str.length;i++){
            System.out.println("Enter " + (i+1) + " String : ");
            str[i] = sc.nextLine();
        }
        //output
        System.out.println(Arrays.toString(str));

    }
}
