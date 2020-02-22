package epam.interest;

import java.util.Scanner;

public class MainInterest {
static
{
    Scanner n=new Scanner(System.in);
    System.out.format("Enter principal amount");
    int p=n.nextInt();
    System.out.format("Enter rate of interest");
    int r=n.nextInt();
    System.out.format("Enter time of interest");
    int t=n.nextInt();
    System.out.format("Enter your simple for Simple Interest or compound for Compound Interest");
    String type=n.next();
    switch (type)
    {
        case "simple":
            SimpleInterest simpleInterest=new SimpleInterest(p,r,t);
            simpleInterest.calcSimpleInterest();
            break;
        case "compound":
            CompoundInterest compoundInterest=new CompoundInterest(p,r,t);
            compoundInterest.calcCompoundInterest();
            break;
            default:
                System.out.format("wrong choice");
                System.out.close();
    }
}
public static void main(String[] args)
{

}
}
