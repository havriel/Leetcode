package Beginning;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        a = scan.nextInt();
        b = scan.nextInt();
        int[][] accounts = new int[a][b];
        for (int i=0;i<accounts.length;i++){
            for (int j=0;j<accounts[i].length;j++){
                accounts[i][j] = scan.nextInt();
            }
        }
        for (int i=0;i<accounts.length;i++){
            for (int j=0;j<accounts[i].length;j++){
                System.out.print(accounts[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts){
        int i,j;
        int[] sum = new int[accounts.length];
        int max = Integer.MIN_VALUE;
        for(i=0;i<accounts.length;i++){
            for (j=0;j<accounts[i].length;j++){
                sum[i]+=accounts[i][j];
                if(sum[i]>max){
                    max = sum[i];
                }
            }
        }
        return max;
    }
}