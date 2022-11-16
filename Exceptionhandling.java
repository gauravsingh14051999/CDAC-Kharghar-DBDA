import java.util.Scanner;

class lengthcheck extends Exception
{
	public lengthcheck(String str)
	{
		super(str);
	}
} 


class child
{
	static void checklength(String l) throws lengthcheck
	{
		int x=l.length();
		if(x>10)
		{
		throw new lengthcheck("Length is more then 10");
		}
		else
		{
			System.out.println("Length is less than 10");
		}
	}
}
class Exceptionlong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		try
		{
			child.checklength(s);
		}
		catch (Exception e)
		{
			System.out.println("Successfully Exception catched");
			System.out.println(e);
		}
	}
}
