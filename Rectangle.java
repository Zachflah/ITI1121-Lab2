//Zachary Flahaut
//300056315
//ITI1121-Z01
//lab2

public class Rectangle{

  private double height;
  private double width;
  public static final double DEFAULT_DIMENSION = 1.0;

  public Rectangle(double h, double w){
    height = h;
    width = w;
  }
  public Rectangle(){
    height = DEFAULT_DIMENSION;
    width = DEFAULT_DIMENSION;
  }
  public Rectangle(double side){
    height = side;
    width = side;
  }

  public double area(){
    double a;
    a = (height*width);
    return a;
  }
  public double perimeter(){
    double p;
    p = ((2*width)+(2*height));
    return p;
  }
  public double getWidth(){
    return width;
  }
  public double getHeight(){
    return height;
  }
  public void setWidth(double w){
    width = w;
  }
  public void setHeight(double h){
    height = h;
  }
  public String toString(){
    StringBuffer str = new StringBuffer();
    str.append("Rectangle : dimensions ");
    str.append(width);
    str.append(" x ");
    str.append(height);
    return str.toString();
  }
}
