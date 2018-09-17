package strings;

import demo.Str;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String name;
        System.out.println("enter any name");
        name=in.nextLine();

        //charAt()
        System.out.println(name.charAt(2));

        //length
        int length;
        length=name.length();
        System.out.println(length);
        System.out.println("length="+length);

        //Substring
        String sun=name.substring(0,3);
        System.out.println("substring="+sun);

        //contains
        System.out.println("for contains"+name.contains("ila"));

        //lower and upper
        System.out.println("to upper"+name.toUpperCase());
        System.out.println("aback to lower"+name.toLowerCase());

        //trim
        System.out.println("after trim"+name.trim());

        //replace

        //split

        //to char array

        //string comparison

        //string builder

        //string concatenation



    }
}
