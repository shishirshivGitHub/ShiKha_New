package com.shikhakadhaba;

public class OperatorsExp {

       public static void main(String[] args) {

           //operator are used to perform operations on variables and values

        int sum1=100;
        int sum2=sum1+100;
        int sum3=sum1+sum2;

        boolean A = true;
        boolean B = false;

        int a=10, b=20 ,and, or, comp, xor, rs, Is;
        and =a&b;
        or = b|a;
        comp= ~a;
        xor = a^b;
        rs = a<<b;
        Is = b>>a;

        System.out.println(sum3);
        System.out.println((A&B) +" ");
           System.out.println((A&B) +" ");
           System.out.println((A|B) +" ");
           System.out.println((A^B) +" ");
           System.out.println((!B) +" ");
           System.out.println(((A&B)|B) +" ");

           System.out.println("and" +and);
           System.out.println("Is" +Is);







    }
}

