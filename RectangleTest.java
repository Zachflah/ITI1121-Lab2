//Zachary Flahaut
//300056315
//ITI1121-Z01
//lab2

public class RectangleTest{

  public static void main(String[] args){

    Rectangle myRect = new Rectangle(12.5, 10.0);
    Rectangle Rect = new Rectangle(5.5);

    System.out.println(myRect.getWidth());
    System.out.println(myRect.getHeight());
    System.out.println(myRect.area());
    System.out.println(myRect.perimeter());
    System.out.println(myRect.toString());

    System.out.println(Rect.getWidth());
    System.out.println(Rect.getHeight());
    System.out.println(Rect.area());
    System.out.println(Rect.perimeter());
    System.out.println(Rect.toString());

  }
}
