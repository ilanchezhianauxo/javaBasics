package loop.allbasicloop;

import java.util.Scanner;

//printing first n nos
public class WhileLoop {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n,i;
        i=0;

        System.out.println("enter how many nos u want");
        n=in.nextInt();

        while(i<=n)
        {
            System.out.println(i);
            i++; //i=i+1;

        }
    }
}
