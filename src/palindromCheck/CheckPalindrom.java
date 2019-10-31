package palindromCheck;

public class CheckPalindrom {
	String pal;
	CheckPalindrom()
	{
		pal="";
	}
	public void display(String x) {
		char []ch = x.toCharArray();
		
		for (int j=ch.length-1; j>=0; j--)
		{
			pal = pal + ch[j];
			
		}
		
		if (x.equals(pal))
		{
			System.out.println(x + " is a palindrom");
		}
		else
		{
			System.out.println(x + " is not a palindrom");
		}
	}
}
