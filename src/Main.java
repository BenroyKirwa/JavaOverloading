import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Geometry{
    public int area(int side){
        //int SquareArea = side * side;
        //System.out.println("The area is : " + SquareArea);
        return side * side ;
    }
    public double area(double radius){
        double pi = 3.14;
//        double CircleArea = pi * radius * radius;
//        System.out.println("The area is : " + CircleArea);
        return pi * radius * radius;
    }
    public double area(double length, double breadth){
//        double RectArea = length * breadth;
//        System.out.println("The area is : " + RectArea);
        return length * breadth;
    }
    public double area(double base, double height, boolean isTriangle){
        double TriArea = 0.5 * base * height;
        if(isTriangle==FALSE){
            System.out.print("This is not a triangle!!");
        }
        return TriArea;
    }
}

public class Main {
    public static void main(String[] args) {
        Geometry G = new Geometry();
        System.out.println("The area of the square is : " + G.area(12));
        System.out.println("The area of the circle : " + G.area(49));
        System.out.println("The area of the rectangle is : " + G.area(7,10));
        System.out.println("The area of the triangle is : " + G.area(5,10,TRUE));
        G.area(5,10,FALSE);
    }
}