package edu.cnm.deepdive;
// A simple class hierarchy.

// A Class for two-dimensional objects.
class TwoDShape {
  double width;
  double height;

  void showDim() {
    System.out.println("Width and Height are " + width + " and " + height);
  }
}

// A subclass of TwoDShape for triangles. / Triangle inherits TwoDShape.
class Triangle extends TwoDShape {
  String style;

  double area() {
    return width * height / 2;
  }

  void showStyle() {
    System.out.println("Triangle is " + style);
  }
}

class Shapes {

  public static void main(String[] args) {
    Triangle t1 = new Triangle();
    Triangle t2 = new Triangle();

    t1.width = 4.0;
    t1.height = 4.0;
    t1.style = "filled";

    t2.width = 8.0;
        t2.height = 12.0;
    t2.style = "outlined";

    System.out.println("Info for t1: ");
    t1.showStyle();
    t1.showDim();
    System.out.println("Area is " + t1.area());

    System.out.println();

    System.out.println("Info for t2: ");
    t2.showStyle();
    t2.showDim();
    System.out.println("Area is " + t2.area());
  }

  // A subclass of TwoDShape for rectangles.
  class Rectangle extends TwoDShape {
    boolean isSquare() {
      if(width == height) return true;
      return false;
    }

    double area() {
      return width * height;
    }
  }
}