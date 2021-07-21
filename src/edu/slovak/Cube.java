package edu.slovak;

import java.util.Objects;

/**
     @author Vladyslav Zavada KNHUE
     @version 1.0
     Classname: Cube

    Module 2 Task 1. Java class creation
     Create a class from the attached document. The class must contain:
        1. Constructor.
        2. Getters/Setters.
        3. 5 methods.
        4. Override toString() method
        5. Override hash() and equals() methods.
 __________________________________________________________________________________________________
    Module 2 Task 3. Polymorphism

     Create and implement  two interfaces for your class.

 **/
public class Cube implements IPackaging, IGeometry{

    private double sideLength;

    // create empty constructor
    public Cube() {
    }

    //  create constructor with parameters
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    //  getter for the property 'sideLength'
    public double getSideLength() {
        return sideLength;
    }

    //  setter for the property 'sideLength'
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    // method: get a cube diagonal
    public double getCubeDiagonal() {
        return this.sideLength * Math.sqrt(3);
    }

    //  method: get a cube face diagonal
    public double getFaceDiagonal() {
        return this.sideLength * Math.sqrt(2);
    }

    //  method: get a cube volume
    @Override
    public double getVolume() {
        return Math.pow(this.sideLength, 3);
    }

    //  method: get a cube surface area
    public double getSurfaceArea() {
        return 6 * Math.pow(this.sideLength, 2);
    }

    //  method: get a cube perimeter
    @Override
    public double getPerimeter() {
        return 12 * this.sideLength;
    }

    // override toString() method
    @Override
    public String toString() {
        return "Cube{" +
                "sideLength="       + sideLength +
                ", cubeDiagonal="   + getCubeDiagonal() +
                ", faceDiagonal="   + getFaceDiagonal() +
                ", volume="         + getVolume() +
                ", surfaceArea="    + getSurfaceArea() +
                ", perimeter="      + getPerimeter() +
                '}';
    }

    //  override hash() method
    @Override
    public int hashCode() {
        return Objects.hash(getSideLength());
    }

    // override equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.getSideLength(), getSideLength()) == 0;
    }


    @Override
    public String toJSON() {
        return "Cube{"
                + "\""    + "sideLength\":"   + this.getSideLength()
                + ", \""  + "cubeDiagonal\":" + getCubeDiagonal()
                + ", \"" + "faceDiagonal\":" + getFaceDiagonal()
                + ", \""  + "volume\":"       + getVolume()
                + ", \""  + "surfaceArea\":"  + getSurfaceArea()
                + ", \""  + "perimeter\":"    + getPerimeter()
                + '}';
    }

    @Override
    public String toXML() {
        return "<Cube>\n"
                + "<sideLength>" + this.getSideLength() + "</sideLength>\n"
                + "<cubeDiagonal>" + this.getCubeDiagonal() + "</cubeDiagonal>\n"
                + "<faceDiagonal>" + this.getFaceDiagonal() + "</faceDiagonal>\n"
                + "<volume>" + this.getVolume() + "</volume>\n"
                + "<surfaceArea>" + this.getSurfaceArea() + "</surfaceArea>\n"
                + "<perimeter>" + this.getPerimeter() + "</perimeter>\n"
                +  "</Cube>";
    }

    @Override
    public void toConsole() {
        System.out.println("Your cube parameters: " + this.toJSON());
    }
}