package harshit;
import java.util.Scanner;
public class JaiHindException {
	static void ValidStr(String str) throws myException
	{
		if(!str.equals("jai hind") && !str.equals("JAI HIND"))
		{
			throw new myException("Invalid country");
		}
		System.out.println("Welcome to india !");
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		try {
			ValidStr(str);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught exception !");
		}
		sc.close();
	}
}
class myException extends Exception
{
	myException(String str)
	{
		System.out.println(str);
	}
}
