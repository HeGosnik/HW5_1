import java.util.Arrays;

public class HW5_3 {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            int j;
            for (j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = counter++;
                sum += arr1[i][j];


                System.out.println(sum);//вывод в 2х мерном
            }
        }
    }
}