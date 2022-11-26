public class Main {

    static void print(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        Quicksort qs = new Quicksort();
        qs.quicksort(array, 0, n-1);

        System.out.println("Array:");
        print(array);
    }
}