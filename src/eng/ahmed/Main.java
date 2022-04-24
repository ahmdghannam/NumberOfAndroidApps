package eng.ahmed;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j= sc.nextInt();
        int k= sc.nextInt();
        int c= sc.nextInt();
        int r= sc.nextInt();
        int p= sc.nextInt();

        int reserved= (((3 * p) / 100) * r);

        int availableRam= r - (reserved*r);

        int minApp=min(j,k,c);

        System.out.println(availableRam/minApp);

    }

    private static int min(int j, int k, int c) {
     return Math.min(Math.min(j,k),c);
    }
}
