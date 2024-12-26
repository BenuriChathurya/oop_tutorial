package TutorialWeek02;

public class TestCircle {
    public static void main(String[] args) {
        //Declare an instance of circle class called circle1
        //Invoke the default constructor
        Circle circle1 = new Circle();
        //Invoke public methods
        System.out.println("The circle has radius of "+circle1.getRadius()+" and area of "+ circle1.getArea());

        //Declare an instance of circle class called circle2
        //Invoke the second constructor
        Circle circle2 = new Circle(8);
        //Invoke public methods
        System.out.println("The circle has radius of "+circle2.getRadius()+" and area of "+ circle2.getArea());

        //Declare an instance of circle class called circle2
        //Invoke the second constructor
        Circle circle3 = new Circle(5,"Red");
        //Invoke public methods
        System.out.println("The circle has radius of "+circle3.getRadius()+" and area of "+ circle3.getArea()+". The color is "+circle3.getColor());

        Circle circle4=new Circle();
        System.out.println(circle4.toString());
        Circle circle5=new Circle(5);
        System.out.println(circle5.toString());
        Circle circle6=new Circle(10,"Red");
        System.out.println(circle6.toString());
    }
}
