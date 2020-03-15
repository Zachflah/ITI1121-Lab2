//Zachary Flahaut
//300056315
//ITI1121-Z01
//lab2

import java.lang.*;

public class Area {

  public static void main(String [] args){

    Rectangle bigRect = new Rectangle(15.0,35.5);
    Rectangle smallRect = new Rectangle(2.0);
    Circle cir = new Circle(3.75);

    double a1,a2,a3;
    double af;
    a1 = bigRect.area();
    a2 = smallRect.area();
    a3 = cir.area();

    af = (a1-((4*a2)+a3));
    af = (af*10.0);
    af = (Math.round(af)/10.0);
    System.out.println("The area of the shape is "+ af);


}
}
