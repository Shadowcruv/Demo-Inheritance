package org.tools;
  /*
  It is wise to always declare packages for anything you are doing because a project with default package can not be
  imported and used in another project.
   */
 public class Brush implements DrawingTool {

     /*
    protected -It means that, that member can be accessed by classes in the same specific package and also subclasses
               of that class too
    package-private(nothing in front) - It means that, that member can only be accessed by classes in the same
                                       specific package.
    public - can be accesses anywhere.
    private - can only be accessed by that class.

   Note: In respect to classes, the access modifiers(access controllers) used are only Package-Private and Public.

      */

    protected void line(){

     }

    public void draw(){

       // ChiloGame  game = new ChiloGame();
        Marker marker = new Marker();
        System.out.println("brush draw");
    }

    public void privateMethod(){

        System.out.println("brush check well");
    }

    public void smallSizeDrawB(){
        System.out.println("brush has taken the small mark");
    }
    public void mediumSizeDrawB(){
        System.out.println("brush has taken the medium mark");
    }
    public void bigSizeDrawB(){
        System.out.println("brush has taken the Big mark");
    }
}
