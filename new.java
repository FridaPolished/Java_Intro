import java.util.Date;
import java.awt.*;

public class Main {
  public static void main(String[] args){
    String message = "Hello" + "!";
    boolean flag = message.endsWith("!");
    int length = message.length();
    String newMessage1 = message.repeat(2);
    String newMessage2 = message.replace("o", "*");
    String newMessage3 = message.toLowerCase();
    String message2 = "  Hello! I am learning Java.";
    String newMessage4 = message2.toLowerCase();
    String newMessage5 = message2.trim();
    

    System.out.println(message);
    System.out.println(flag);
    System.out.println(length);
    System.out.println(newMessage1);
    System.out.println(newMessage2);
    System.out.println(newMessage3);
    System.out.println(newMessage4);
    System.out.println(newMessage5);
  }
  // public static void main(String[] args){
  //   Point point1 = new Point(1, 1);
  //   Point point2 = point1;
  //   point1.x = 2;
  //   System.out.println(point1);
  //   System.out.println(point2);
  // }
  // public static void main(String[] args){
  //   byte x = 1;
  //   byte y = x;
    
  //   x = 2;
  //   System.out.println(x);
  // }
  // public static void main(String[] args){
  //   byte age = 30;
  //   long views = 3_123_456_789L;
  //   float price = 10.99F;
  //   char letter = 'h';
  //   boolean boo = true;
  //   Date now = new Date();

  //   now.getTime();

  //   System.out.println(age);
  //   System.out.println(price);
  //   System.out.println(now);
  // }
}