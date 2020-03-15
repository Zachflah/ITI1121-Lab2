//Zachary Flahaut
//300056315
//ITI1121-Z01
//lab2

public class CircleTest{

  public static void main (String[] args){

    Circle cic = new Circle();
    System.out.println(cic.area());
    System.out.println(cic.getRadius());

    Circle cer = new Circle(2.0);
    System.out.println(cer.area());
    System.out.println(cer.circumference());
    System.out.println(cer.getRadius());
    System.out.println(cer.diameter());
    cer.setRadius(4.0);
    System.out.println(cer.area());
    System.out.println(cer.circumference());
    System.out.println(cer.getRadius());
    System.out.println(cer.toString());


  }
}
