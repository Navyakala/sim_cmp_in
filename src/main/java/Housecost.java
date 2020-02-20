import java.util.Scanner;

public class Housecost {
    Scanner sc = new Scanner(System.in);

    Double  estimation() {
        System.out.format("\n____________________________________________________________________\n");
        System.out.format("Enter the material type:\n");
        System.out.format("Standard materail(n1): 1\n");
        System.out.format("Above Standard materail(n2): 2\n");
        System.out.format("High Standard materail(n3): 3\n");
        int material = sc.nextInt();
        System.out.format("Enter the Area:\n");
        Double Area = sc.nextDouble();
        System.out.format("Enter the fully automated ar not:\n");
        System.out.format("1:Yes\n");
        System.out.format("2:No\n");
        int fully = sc.nextInt();
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        if (fully ==2)
        {
            if (material == 1)
            {
                double result = 1200 * Area;
                return result;
            }
            else if (material == 2)
            {
                double result = 1500 * Area;
                return result;
            }
            else
                {
                double result = 1800 * Area;
                return result;
            }
        }
        else
            {
                if (material == 3) ;
                {
                  double result = 2500 * Area;
                  return result;
                }

            }
    }

}
