package edu.slovak;
/*
    Class Main
     Modules 2: all

     @author Vladyslav Zavada KNHUE
     @version 1.0
*/

public class Main {

    public static void main(String[] args) {
        // create an instance of the class Cube
        Cube cube1 = new Cube(5);

        // Create cube instance via CubeFactory
        IGeometry cube2 = CubeFactory.create(10, Figure.CUBE);
        System.out.println(cube2.getPerimeter());
    }
}