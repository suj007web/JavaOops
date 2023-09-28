import java.util.*;
abstract class Shape{
    double area;
    Scanner sc = new Scanner(System.in);
    public abstract void acceptInput();
    public abstract void compute();
    public void disp(){
        System.out.println("Area : "+area);
    }
}
final class Square extends Shape{
    private double length;
    public void acceptInput(){
        System.out.println("Enter the length of square : ");
        this.length = sc.nextDouble();
    }
    public void compute(){
        area = length*length;
    }
}
final class Rectangle extends Shape{
    private double length;
    private double breadth;
    public void acceptInput(){
        System.out.println("Enter the length and breadth of the rectangle : ");
        this.length = sc.nextDouble();
        this.breadth = sc.nextDouble(); 
    }
    public void compute(){
        area = length*breadth;
    }
}

final class Circle extends Shape{
    private double radius;
    public void acceptInput(){
        System.out.println("Enter the radius of the circle : ");
        this.radius = sc.nextDouble();
    }
    public void compute(){
        area = 3.14*radius*radius;
    }
}
final class Math{
    public void permit(Shape s){
        s.acceptInput();
        s.compute();
        s.disp();
    }
}
public class ShapeCalc {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Math m = new Math();
        Shape ref;
        ref = s;
        m.permit(ref);
        ref = r;
        m.permit(ref);
        ref = c;
        m.permit(ref);
    }
}
