
//=====================USING PILLARS=======================================//
import java.util.*;

abstract class Shape {
    float area;

    abstract public void acceptInput();

    abstract public void compute();

    public void display() {
        System.out.println("The area is:" + area);
    }
}

class Square extends Shape {
    private float length;

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of square;");
        length = scan.nextFloat();
    }

    public void compute() {
        area = length * length;
    }
}

class Rectangle extends Shape {
    private float length;
    private float breath;

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rectangle;");
        length = scan.nextFloat();
        System.out.println("Enter the breath of rectangle;");
        breath = scan.nextFloat();
    }

    public void compute() {
        area = length * breath;
    }
}

class Circle extends Shape {
    private float radius;

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        radius = scan.nextFloat();
    }

    public void compute() {
        area = 3.14f * radius * radius;
    }
}

class Geometry {
    public void permit(Shape ref) {
        ref.acceptInput();
        ref.compute();
        ref.display();
    }
}

public class Oreinted {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Geometry g = new Geometry();

        g.permit(s);
        g.permit(r);
        g.permit(c);
    }

}