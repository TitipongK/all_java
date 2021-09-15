import java.lang.Math;
import java.util.Scanner;
class Exercise4E 
    {
    public static void main(String[] args) {
            double  x1 , x2 , y1 , y2 ;
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter x1 -value : ");
            x1 = kbd.nextDouble();
            y1 = Math.log10(3.0*Math.pow(x1,2))+((2.0/3.0)*Math.pow(x1,3))+Math.sin(2*x1);
        System.out.println("value of funtion : " +  y1  );
        System.out.println("Enter x2 -value : ") ;
            x2 = kbd.nextDouble();
            y2 = Math.log10(3.0*Math.pow(x2,2))+(2.0/3.0*Math.pow(x2,3))+Math.sin(2*x2);
        System.out.println("value of funtion : " +  y2  );
        System.out.println("Max function : " + Math.max(y1,y2));
    }
}