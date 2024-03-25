public class SecondLargestElement
{
	public static void main(String args[])
	{	
		int a[]={1,3,4,5,7};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(max1<a[i])
			{	
				max2=max1;
				max1=a[i];
			}
			else if(max2<a[i])
			{
				max2=a[i];
			}
		}
		System.out.println(max2);
	}
}
