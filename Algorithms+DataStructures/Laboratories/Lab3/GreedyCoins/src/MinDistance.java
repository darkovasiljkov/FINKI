import java.util.Scanner;
import java.util.*;

public class MinDistance {

    public static float minimalDistance(float points[][])
    {
        float minimumDistance=10000;
        float currentDistance=0;
        for(int i=0;i<points.length;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                currentDistance=(float)Math.sqrt(Math.pow(Math.abs(points[i][0]-points[j][0]),2) + Math.pow(Math.abs(points[i][1]-points[j][1]), 2));
                if(currentDistance < minimumDistance)
                {
                    minimumDistance = currentDistance;
                }
            }
        }
        return minimumDistance;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        float points[][] = new float[N][2];

        for(int i=0;i<N;i++) {
            points[i][0] = input.nextFloat();
            points[i][1] = input.nextFloat();
        }

        System.out.printf("%.2f\n", minimalDistance(points));
    }
}