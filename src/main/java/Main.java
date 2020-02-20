import java.util.Scanner;

public class Main
{

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        cmp_in compound=new cmp_in();
        Housecost hc=new Housecost();
        System.out.format("The simple Interest Calculation starts:\n");
        System.out.format("Enter the principle:\n");
        Double p = sc.nextDouble();
        System.out.format("Enter the rate:\n");
        Double r = sc.nextDouble();
        System.out.format("Enter the time period:\n");
        Double  t = sc.nextDouble();
        Double si = (p *r * t) / 100;
        compound.display();
        System.out.format("The simple interest is :"+si);
        System.out.format("\n____________________________________________________________________\n");
        System.out.format("The compound Interest Calculation starts:\n");
        System.out.format("Enter the principle:\n");
        Double p1 = sc.nextDouble();
        System.out.format("Enter the rate:\n");
        Double  r1 = sc.nextDouble();
        System.out.format("Enter number of time interest applied:\n");
        Double  n1 = sc.nextDouble();
        System.out.format("Enter the time period:\n");
        Double   t1 = sc.nextDouble();
        Double ci=p1*(1+(r1/n1));
        double cmp = Math.pow(ci, (n1*t));
        compound.display();
        System.out.format("The compound  interest is :"+cmp);
        Double k=hc.estimation();
        System.out.format("The overall cost of the house construction is :"+k);

    }
}

