import java.util.*;
public class RemoveWhiteSpace
{
	public static void main(String args[])
	{
		String s="i love programming very much";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				res=res+s.charAt(i);
			}
			
			
		}
		System.out.println(res);
	}
}
