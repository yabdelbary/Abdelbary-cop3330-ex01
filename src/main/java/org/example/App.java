package org.example;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "what is your name? " );
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("hello," + name +", nice to meet you");

    }
}
