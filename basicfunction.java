/*Source own GIT-Repository
https://github.com/jopawi7/basic_functions
*/

import java.io.*;

public class basicfunction {
    //MiniJava aus der Vorlesung - Folie 2 Erste Schritte in Java
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void write(String x) {
        System.out.println(x);
    }

    public static void write(int x) {
        write("" + x);
    }

    public static String readString() {
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Eingabefehler!");
        }
    }

    public static int readInt() {
        return Integer.parseInt(readString().trim());
    }

    //Wichtige Funktionen für Arrays


    //1d Array verkürzen - self programmed
    public static int[] cutArray(int[] a, int leftborder, int rightborder) {
        //Indizes angeben von wo bis wo

        int[] arr = new int[rightborder - leftborder + 1]; //4-8, dann wird der Array 4 lang

        for (int i = 0; leftborder <= rightborder; i++) {
            arr[i] = a[leftborder];
            leftborder++;
        }
        return arr;
    }


    //2d Array bestimmen Zeilenanzahl - self programmed
    public static int zeilenAnzahl(int[][] a) {
        return a.length;
    }

    //2d Array bestimmen Zeilenlänge - self programmed
    public static int zeilenLänge(int[][] a, int iWhichZeile) {
        return a[iWhichZeile].length;
    }


}
    