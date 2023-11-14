import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int[][] test = new int[5][6];

        //System.out.println(basicfunction.zeilenAnzahl(test));
        //System.out.println(basicfunction.zeilenLänge(test, 0));

        int[] hallo = new int[5];


        hallo[0] = 5;
        hallo[1] = 6;
        hallo[2] = 7;
        hallo[3] = 8;
        hallo[4] = 9;


        hallo = basicfunction.cutArray(hallo, 0, 3);

        System.out.println(Arrays.toString(hallo));
        System.out.println(hallo.length);


    }
}
