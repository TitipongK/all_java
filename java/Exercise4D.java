import javax.swing.JOptionPane;
class Exercise4D
{
	public static void main(String[] args){
		String input_x,input_y,triangle;
		double x,y,area;
//triangle 1
		input_x = JOptionPane.showInputDialog("input high : ");
		input_y = JOptionPane.showInputDialog("input long : ");
		x = Double.parseDouble(input_x);	
		y = Double.parseDouble(input_y);
		area = (1.0/2.0)*x*y;
		System.out.println("area 1 is : " +area);
//triangle 2 
		input_x = JOptionPane.showInputDialog("input high : ");
		input_y = JOptionPane.showInputDialog("input long : ");
		 x = Double.parseDouble(input_x);	
		 y = Double.parseDouble(input_y);
		area = (1.0/2.0)*x*y;
		System.out.println("area 2 is : " +area);
		System.exit(0);
		}
}
//Titipong keawkhum 64050407
//สวัสดีปีใหม่ไทย


/*import java.lang.Math;
import javax.swing.JOptionPane;
class Exercise4D {
    public static void main(String[] args) 
    {
        String    b1,h1,b2,h2 ;
        double    a1,a2,s1,s2,c1,c2 ;
    //Triangle 1
            b1    = JOptionPane.showInputDialog("Input base  :");
            h1    = JOptionPane.showInputDialog("Input heigt :");
            a1    = Double.parseDouble(b1);
            c1    = Double.parseDouble(h1);
            s1    = (1.0/2.0)*(a1)*(c1) ;
        System.out.println("Area of Triangle 1 :"+ s1 ); 
    //Triangle 2
            b2    = JOptionPane.showInputDialog("Input  :");
            h2    = JOptionPane.showInputDialog("Input  :");
            a2    = Double.parseDouble(b2);
            c2    = Double.parseDouble(h2);
            s2    = (1.0/2.0)*(a2)*(c2) ;
        System.out.println("Area of Triangle 2 :"+ s2 );
    System.exit(0);
    }
}
*/