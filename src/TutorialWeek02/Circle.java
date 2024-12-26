package TutorialWeek02;

public class Circle {
    private double radius;
    private String color;

    //constructor with no arguments
    public Circle(){
        radius = 1;
        color = "Blue";
    }
    //constructor with argument for radius. color is default
    public Circle(double radius){
        this.radius = radius;
        color = "Blue";
    }
    //constructor with argument for radius and color
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    //public method - radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        radius=radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color= color;
    }
    // public method to compute and return the area of circle
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
      return "Circle [radius=" + radius+ ", color=" +color +"]";
    }
}

