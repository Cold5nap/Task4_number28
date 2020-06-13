import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int from = 0, to = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index at which sorting starts and ends = ");
        try {
            while (sc.hasNextInt()) {
                from = sc.nextInt();
                to = sc.nextInt();
            }
        } catch (Exception e) {
            throw new Exception("Invalid index. ");
        }

        System.out.println(from+"      "+to);
        Integer[] arr = {1, 12, 5, 76, 7, 8, 0, -3};
        Task.sort(arr, 2, 6);
        print(arr);

        Integer[] arr2 = {1, 12, 5, 76, 7, 8, 0, -3};
        System.out.println("\n"+"Back sort: ");
        Task.sort(arr2, 6, 2);
        print(arr2);

        System.out.println("\n"+"array size = " + arr.length);

    }

    static void print(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}