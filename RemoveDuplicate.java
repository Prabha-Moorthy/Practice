public class RemoveDuplicate
{
    public static void main(String args[])
    {
        String s="Hello World";
        String res="";
        for(int i=0;i<s.length();i++)
        {
            int j;
            for(j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    break;
                }
            }
            if(i==j)
            {
                res=res+s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
