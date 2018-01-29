import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        String sayi;
        sayi = girdi.next();
        String text = sayi;

        char[] harf = text.toCharArray();

        int n = text.length();
        int[] dizi = new int[n];

        char enbuyuk = 0;
        int M = 1000;
        int D = 500;
        int C = 100;
        int L = 50;
        int X = 10;
        int V = 5;
        int I = 1;

        for (int i = 0; i < n; i++) {
            if (harf[i] == 'M') {
                enbuyuk = harf[i];
                break;
            } else if (harf[i] == 'D') {
                enbuyuk = harf[i];
                break;
            } else if (harf[i] == 'C') {
                enbuyuk = harf[i];
            } else if (harf[i] == 'L') {
                enbuyuk = harf[i];
            } else if (harf[i] == 'X') {
                enbuyuk = harf[i];
            } else if (harf[i] == 'V') {
                enbuyuk = harf[i];
            } else if (harf[i] == 'I'){
                enbuyuk=harf[i];
            }
        }
        System.out.println(enbuyuk);
    }
}
