import java.util.Scanner;
class Exercise5B
{
	private static double getDouble(String msg){
	Scanner kbd = new Scanner(System.in);
	System.out.print(msg); double num = kbd.nextDouble();
	return num;
	}
	public static double func(double x,double y,double z){
		double f;
		f = (2.0/3.0)*x*Math.exp(y)+Math.log(z)+Math.sqrt(x);
		return f;
	}
	public static void main(String[] args){
		double x,y,z,f;
		x = getDouble("Enter X-value :");
		y = getDouble("Enter Y-value :");
		z = getDouble("Enter Z-value :");
		f = func(x,y,z);
		System.out.println("Result is : "+f);
	}
}
//Titipong Keawkhum 64050407