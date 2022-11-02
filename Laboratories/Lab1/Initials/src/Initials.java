import java.util.*;
import java.util.Scanner;

public class Initials {

    static void printInitials(String name)
    {
        if (name.length()==0)
            return;
        else
        {
            System.out.print(Character.toUpperCase(name.charAt(0)));
            for (int i=0;i<name.length();i++)
            {
                if (name.charAt(i)==' ')
                {
                    System.out.printf("%c", Character.toUpperCase(name.charAt(i+1)));

                }
            }

        }

    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        String name;
        input.nextLine();

        for(int i=0; i<n; i++){
            name = input.nextLine();
            printInitials(name);
            System.out.println();
        }
    }
}

