import java.util.Arrays;

public class HW5_4 {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = counter++;
            }
            System.out.println(Arrays.toString(arr1[i]));
        }
        int[][] arr2 = new int[5][5];
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = count++;
            }
            System.out.println(Arrays.toString(arr2[i]));
        }
        int[][] arr3 = new int[5][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                arr3[i][j] = arr2[i][j] * arr1[i][j];
            }
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}
