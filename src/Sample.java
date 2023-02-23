import java.awt.*;
import java.util.Date;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int age = 30; //primitive type
        Date now = new Date(); //reference type
        System.out.println(age);
        System.out.println(now.getTime()); //getTime() methods returns the time component of the now object
        Point point1 = new Point();
        System.out.println(point1);
    }
}
