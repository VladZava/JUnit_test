package edu.slovak;

/**
    @author Vladyslav Zavada KNHUE
    @version 1.0

    Classname: CubeFactory

    Module 2 Task 4.
    1.2. Develop for your Factory class

 **/
public class CubeFactory {
    /**
     * Class constructor with parameters. If the entered side length is less than 0,
     * it's not possible to create a cube. Otherwise a class instance will be created.
     * @param sideLength set a side of a cube
     * @param cube
     **/
    public static Cube create(double sideLength, Figure cube) {
        if (sideLength < 0) {
            return new Cube(sideLength);
        } return null;
    }

}