
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task();
    }
    
    public static void task() {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 1;
        arr[2] = 7;

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}