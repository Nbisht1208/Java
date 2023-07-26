
//=====================WITHOUT USING PILLARS=======================================//
import java.util.*;

class Square {
    float length;
    float area;

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of Square");
        length = scan.nextFloat();

    }

    public void compute() {
        area = length * length;
    }

    public void disp() {
        System.out.println("The area of square is :" + area);

    }
}

class Rectangle {
    float length;
    float breath;
    float area;

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rectangle;");
        length = scan.nextFloat();
        System.out.println("Enter the breath of rectangle :");
        breath = scan.nextFloat();
    }

    public void compute() {
        area = length * breath;
    }

    public void disp() {
        System.out.println("The area of rectangle is:" + area);
    }

}

class Circle {
    float radius;
    float area;

    public void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle;");
        radius = scan.nextFloat();
    }

    public void compute() {
        area = 3.14f * radius * radius;

    }

    public void disp() {
        System.out.println("The area is:" + area);
    }

}

public class NonOriented {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        s.acceptInput();
        s.compute();
        s.disp();

        r.acceptInput();
        r.compute();
        r.disp();

        c.acceptInput();
        c.compute();
        c.disp();
    }

}