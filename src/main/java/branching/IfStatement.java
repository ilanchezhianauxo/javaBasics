package branching;

import java.util.Scanner;

//to find whether a person is eligible to vote
public class IfStatement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int age;
        System.out.println("enter age");
        age=in.nextInt();
         if(age>=18)
         {
             System.out.println("the person is eligible to vote");
         }
         else
         {
             System.out.println("the person is not eligible to vote");
         }
        System.out.println("if block is over");

    }
}
