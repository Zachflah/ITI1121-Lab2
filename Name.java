//Zachary Flahaut
//300056315
//ITI1121-Z01
//lab2

public class Name{

  private String first;
  private String middle;
  private String last;

  public Name(String f, String m, String l){
    first = f;
    middle = m;
    last = l;
  }
  public Name(String wholeName){
    int counter = 0;
    int count2 = 0;
    int i2 = 0;
    char b = ' ';
    for (int i = 0; i< wholeName.length();i++){
      char c = wholeName.charAt(i);
      counter++;
      if(c == b){
        if(count2 == 0){
          first = wholeName.substring(0,i);
          count2++;
          i2 = i+1;
          i++;
        }
        if(count2 == 1){
          middle = wholeName.substring(i2,i);
          count2++;
          i2 = i+1;
          i++;
        }
        if(count2 == 2){
          last = wholeName.substring(i2,i);
        }

      }
    }

  }
  public String initials(){
    String a,b,c;
    a = first.substring(0,1);
    b = middle.substring(0,1);
    c = last.substring(0,1);
    return (a + ". "+b +". "+ c + ".");
  }
  public String toString(){
    StringBuffer str = new StringBuffer();
    str.append(first);
    str.append(" ");
    str.append(middle.substring(0,1));
    str.append(". ");
    str.append(last);
    return (str.toString());
  }
  public String toFullString(){
    StringBuffer str = new StringBuffer();
    str.append(first);
    str.append(" ");
    str.append(middle);
    str.append(" ");
    str.append(last);
    return (str.toString());

  }
  public String toLastString(){
    StringBuffer str = new StringBuffer();
    str.append(last);
    str.append(", ");
    str.append(first);
    return (str.toString());
  }
  public String toUpperCase(){
    String a,b,c;
    a = first.toUpperCase();
    b = middle.toUpperCase();
    c = last.toUpperCase();
    return (a + " "+b +" "+ c);

  }

  public static void main(String[] args){

    Name p = new Name("John", "Ty", "Smith");
    System.out.println(p.toString());
    System.out.println(p.toFullString());
    System.out.println(p.toLastString());
    System.out.println(p.toUpperCase());
    Name t = new Name("John Ty Smith");
    System.out.println(t.toFullString());
    System.out.println(t.toLastString());
    System.out.println(t.toUpperCase());


  }
}
