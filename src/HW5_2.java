import java.util.Arrays;

public class HW5_2 {
    public static void main(String[] args) {
        String[][] h = new String[8][8];
        for (int i = 0; i < h.length; i++) {
            for (int j = 0; j < h[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    h[i][j] = "w";
                } else {
                    h[i][j] = "b";
                }
            }
            System.out.println(Arrays.toString(h[i]));//вывод в 2х мерном
        }
    }
}