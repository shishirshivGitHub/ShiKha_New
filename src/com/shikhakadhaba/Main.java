package com.shikhakadhaba;

import java.util.Locale;

public class Main {

    // predefine function inside java
    public static void main(String[] args) {
        // all the function/method which need to be call,
        // that function must be call inside the main function/method

        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println(a + "," + b);
        for (int i = 1; i <= 10; i++) {
            System.out.println("," + c);
            a = b;
            b = c;
            c = a + b;
        }
        condition();
        primativedatatupe();
        string ();
    }

    static void condition  () {
        boolean isSunUp = true;

        if (!isSunUp)
            System.out.println("day");
        else
            System.out.println("night");
    }

    static void primativedatatupe () {
        //  primitive data type
   int age =20;
   boolean name = true;
   char letter = 'a';
   byte age2 =30;
   float phone =3.134F;
   long phone1 = 9611989122L;
        // non primitive data type
        String name1= "shikha";
        System.out.println(phone1);
        System.out.println(name1.length() );


    }
    static void string (){

        // casting is when assign a value of one primitive data type another type
        int myInt =9;

        //string is  ummutable
        String name1="my name is 'shikha' gangwar";
        String name = "shishir";
        String lastname ="katiyar";
        String contectno ="8445990642";
        String add = "shishir katiyar";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name+ " " +contectno);       //opeator can be used between String to combine them
        System.out.println(lastname.indexOf("at"));
        System.out.println(add.substring(7,15));

        // Using replace function : parameter : char and charsequence

        // using char
        System.out.println(add.replace('i' ,'a'));

        // using charsequence
        System.out.println(add.replace("shi" ,"OM"));

        System.out.println(name1.indexOf("shikha"));


        System.out.println (myInt);
        System.out.println((double) myInt);





    }

}

