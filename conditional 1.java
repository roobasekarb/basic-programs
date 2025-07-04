import java.util.Scanner;
public class Main
{
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
	    int number =scan.nextInt();
	    if(number>0)
	    {
	        System.out.println("Positive number");
	    }
	    if(number<0)
	    {
	        System.out.println("Negative number");
	    }
	    if(number==0)
	    {
	        System.out.println("zero");
	    }
	    
    }
}