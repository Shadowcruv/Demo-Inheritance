package org.tools;


public class Pencil extends Brush implements DrawingTool {

  public void draw(){
      System.out.println("pencil draw");
    }

    public void smallSizeDrawP(){
        System.out.println("pencil has taken the small mark");
    }
    public void mediumSizeDrawP(){
         System.out.println("pencil has taken the medium mark");
    }
    public void bigSizeDrawP(){
        System.out.println("pencil has taken the Big mark");
    }
}
