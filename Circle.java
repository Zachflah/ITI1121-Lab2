//Zachary Flahaut
//300056315
//ITI1121-Z01
//lab2

import java.lang.*;

public class Circle{

  private double radius;

  public Circle(double r){
    radius = r;
  }
  public Circle(){
    radius = 1.0;
  }
  public double area(){
    double a;
    a = ((Math.PI)*(Math.pow(radius,2)));
    return a;
  }
  public double circumference(){
    double c;
    c = (2*(Math.PI)*radius);
    return c;
  }
  public double diameter(){
    double d;
    d = (2*radius);
    return d;
  }
  public void setRadius(double r){
    radius = r;
  }
  public double getRadius(){
    return radius;
  }
  public String toString(){
    StringBuffer str = new StringBuffer();
    str.append("Circle with radius ");
    str.append(radius);
    return str.toString();
  }
}
