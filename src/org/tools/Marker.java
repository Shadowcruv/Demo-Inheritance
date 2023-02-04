package org.tools;

public class Marker implements DrawingTool {

    public void draw(){
        Brush brushh = new Brush();
        brushh.line();
        System.out.println("marker draw");
    }

    public void smallSizeDrawM(){
        System.out.println("marker has taken the small mark");
    }
    public void mediumSizeDrawM(){
        System.out.println("marker has taken the medium mark");
    }
    public void bigSizeDrawM(){
        System.out.println("marker has taken the Big mark");
    }


    /*
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String inject = scanner.nextLine();

    java.util.Arrays


     */
}
