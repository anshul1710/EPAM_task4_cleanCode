package epam.house;

import java.util.Scanner;

public class Main {
    static
    {
        String type;
        double area;
        Scanner scan=new Scanner(System.in);
        System.out.format("Enter value For Construction type : \n");
        System.out.format("enter standard for- Standard Type\n");
        System.out.format("enter luxury for- Luxury Type\n");
        System.out.format("enter villa for - Villa Type\n");
        type=scan.next();
        System.out.format("%s","Enter House Area \n");
        area=scan.nextDouble();
        scan.close();
       CostCalculator costCalculator=new CostCalculator(type,area);
       costCalculator.CalCost();
    }
public static void main(String[] args)
{

}
}
