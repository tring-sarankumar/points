package assignment.points;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Value for x:");
    	Float x = sc.nextFloat();
    	System.out.print("Enter Value for y:");
    	Float y = sc.nextFloat();
    	sc.close();
    	
        PointLogic obj= new PointLogic(x,y);
        PointLogic obj2 =obj.point();
        
        System.out.println(obj2.testEqual());
    }
}
