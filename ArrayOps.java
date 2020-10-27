public class ArrayOps {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int largest(int[] arr) {
        int big = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
        }
        return big;
    }

    public static int[] sumRows(int[][] arr) {
        int[] list = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            list[i] = sum(arr[i]);
        }
        return list;
    }

    public static int[] largestInRows(int[][] arr) {
        int[] list = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            list[i] = largest(arr[i]);
        }
        return list;
    }

    public static int sum(int[][] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        return total;
    }

}