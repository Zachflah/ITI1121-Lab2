//Zachary Flahaut
//300056315
//ITI1121-Z01
//lab2

public class Wood{

  public static void main(String[] args){

    Box box = new Box(5.2,2.5,2.5);     //make a object of type box
    Rectangle rec = new Rectangle(2.5); //makes an object of type rectangle

    double ar;  // ar = area of the rectangle
    int ab,h;   // ab = surface area of the box, h = a variable

    System.out.println("The volume of the box is " + box.volume());    //prints out the volume of the box
    ar = rec.area();  //
    ab = box.surfaceArea();
    h = (int) Math.round(ar);

    ab = (ab + h);
    System.out.println("The surface area required to make the box is "+ ab);



  }
}
