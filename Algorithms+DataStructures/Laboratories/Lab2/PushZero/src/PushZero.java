import java.util.Scanner;

public class PushZero
{
    static void pushZerosToEnd(int arr[], int n)
    {
        int br=0;
   for(int i=0;i<n;i++)
   {
       if(arr[i]!=0)
       {
           arr[br]=arr[i];
           br++;
       }

   }
        for(int i=br; i<n; i++)
        {
         arr[i]=0;
        }
    }


    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int arr[] = new int[n];



 for (int i=0;i<n;i++)
 {
  arr[i]=scanner.nextInt();
 }
        pushZerosToEnd(arr, n);
        System.out.println("Transformiranata niza e: ");

        for (int i=0;i<n;i++)
        {
            System.out.printf("%d ", arr[i]);
        }
    }
}