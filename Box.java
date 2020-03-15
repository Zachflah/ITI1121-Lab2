//Zachary Flahaut
//300056315
//ITI1121-Z01
//lab2

import java.lang.*;

public class Box{

  private double height;
  private double width;
  private double depth;

  public Box(double h,double w, double d){
    height = h;
    width = w;
    depth = d;
  }
  public Box(){
    height = 1.0;
    width = 1.0;
    depth = 1.0;
  }
  public Box(double side){
    height = side;
    width = side;
    depth = side;
  }
  public double volume(){
    double v;
    v = (height*width*depth);
    return v;
  }
  public int surfaceArea(){
    int s,h,w,d;
    h = (int) Math.round(height);
    w = (int) Math.round(width);
    d = (int) Math.round(depth);
    s = ((2* w*d)+(2*h*w)+(2*h*d));
    return s;
  }
  public double diagonalLength(){
    double l;
    l = Math.sqrt((Math.pow(width,2)+Math.pow(depth,2))+ Math.pow(height,2));
    return l;
  }
  public double getHeight(){
    return height;
  }
  public double getWidth(){
    return width;
  }
  public double getDepth(){
    return depth;
  }
  public void setHeight(double x){
    height = x;
  }
  public void setWidth(double x){
    width = x;
  }
  public void setDepth(double x){
    depth = x;
  }
  public String toString(){
    StringBuffer str = new StringBuffer();
    str.append("Box with dimensions ");
    str.append(getHeight());
    str.append(" x ");
    str.append(getWidth());
    str.append(" x ");
    str.append(getDepth());
    return str.toString();

  }
}
