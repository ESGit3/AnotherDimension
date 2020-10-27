public class Tester {

    public static String arrToString(int[] arr) {
        String a = "{";
        if (arr.length == 0) return "{}";
        for (int i = 0; i < arr.length; i++) {
            a += arr[i] + ", ";
        }
        a = a.substring(0, a.length() - 2);
        a += "}";
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 5, 9, 4};
        System.out.println(ArrayOps.sum(arr));
        System.out.println(ArrayOps.largest(arr));

        int[][] doubleArr = {{1, 4, 6}, {1, 2, 0, 5, 7}, {5, 6, 1, 3}};
        System.out.println(arrToString(ArrayOps.sumRows(doubleArr)));


    }
}