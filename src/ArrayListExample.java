import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(3);
            list.add(1);
            list.add(6);
            list.add(5);
            list.add(4);
            list.add(3);
            list.add(2);

            System.out.println(list);

            //input

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
