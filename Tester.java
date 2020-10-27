import java.util.Arrays;

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
        System.out.println(arrToString(ArrayOps.largestInRows(doubleArr)));
        System.out.println(ArrayOps.sum(doubleArr));

        int[][] A = { {  1,  0, 12, -1 },
                {  7, -2,  2,  1 },
                { -5, -2,  2, -9 }
        };
        int[] B = { 1, 3, 5 };

        System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
        System.out.println(ArrayOps.sum(B));
        System.out.println(ArrayOps.sum(A));

        int[][] C = { {  1,  2, 3, 4 },
            {  2, 3,  4,  1 },
            { 3, 4,  1, 2 } };  //this is rowMagic but NOT colMagic

        int[][] D = { {  1,  1, 1 },
            {  2, 2, 2 },
            { 3,  3, 3 } };  //this is colMagic but NOT rowMagic

        int[][] E = { {  2,  2, 2 },
            {  2, 2, 2 } };  //this is both colMagic AND rowMagic

        System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
        System.out.println(ArrayOps.isRowMagic(C));
    }
}