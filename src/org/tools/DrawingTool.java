package org.tools;


public interface DrawingTool {
    int shapes = 3;

     void draw() ;



    default void defaultMethod(){
        System.out.println("Using this default method");
    }
    static void staticMethod(){
        System.out.println("Interface: static method");
    }
    private void privateMethod(){
        System.out.println("Interface: private methods in interface are acceptable should have a body");
    }
}
