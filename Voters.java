package com.task4;
import java.util.Scanner;

public class Voters  {
    int voterid;
    String name;
    int age;
    Voters(int a,String b,int c)
    {
        this.voterid=a;
        this.name=b;
        this.age=c;
    }
    public static void main(String[] args) throws Exception{
        Scanner Scanner=new Scanner(System.in);
        System.out.println("enter voterid name age of voter");
        int voterid=Scanner.nextInt();
        String name=Scanner.next();
        int age=Scanner.nextInt();

        try
        {
            if(age<18)
            {
                throw new Invalidvoter("Not eligible for casting vote");
            }
            else
            {
                System.out.println("Eligible for voting");
            }
        }
        catch(Exception exception)
        {
            System.out.println(exception.getMessage());
        }

    }

}


