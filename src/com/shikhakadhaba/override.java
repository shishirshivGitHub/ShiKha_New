package com.shikhakadhaba;
public class override {
    public static void main(String[] args) {
        B r = new B();
        r.show();
    }
}
    class A {
    void show (){

        System.out.println(" super class");
        }
        }
        class B extends A {
            void show() {
                System.out.println(" sub class");
            }
        }



