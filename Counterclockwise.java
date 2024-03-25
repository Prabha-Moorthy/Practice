import java.util.Scanner;
public class Counterclockwise
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Row Value:");
        int row=sc.nextInt();
        System.out.println("Enter the column Value:");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the Elements:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int rowstart=0;
        int rowend=arr.length;
        int colstart=0;
        int colend=arr[0].length;
        System.out.println("After Rotation:");
        while(rowstart<=rowend && colstart<=colend)
        {
            for(int i=rowstart;i<rowend;i++)
            {
                System.out.println(arr[i][colstart]);   
            }
            colstart++;
            for(int i=colstart;i<colend;i++)
            {
                System.out.println(arr[rowend-1][i]);   
            }
            rowend--;
            for(int i=rowend-1;i>=rowstart;i--)
            {
                System.out.println(arr[i][colend-1]);   
            }
            colend--;
            for(int i=colend-1;i>=colstart;i--)
            {
                System.out.println(arr[rowstart][i]);   
            }
            rowstart++;
        }
    }
}
