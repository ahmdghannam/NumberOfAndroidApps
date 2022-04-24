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

        int availableRam= r - reserved;

        int minApp=min(j,k,c);
        
        System.out.println(availableRam/minApp);

    }

    private static int min(int j, int k, int c) {
        int min=0;
        if(j<k && j<c){
            min=j;
        }
        else if(k<j && k<c){
            min=k;
        }
        else if(c<j && c<k){
            min=c;
        }
        return min;
    }
}
