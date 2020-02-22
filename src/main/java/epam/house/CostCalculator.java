package epam.house;

public class CostCalculator {
    private String type;
    private  double area;
    public  CostCalculator(String type,double cost) {
        this.type=type;
        this.area=cost;
    }
    public int  CostPerItem(String type)
    {  int cost=0;
        if(type.equals("standard"))
            cost=1200;
        else
        if(type.equals("luxury"))
            cost=1500;
        else
        if(type.equals("villa"))
            cost=1800;
        return  cost;
    }
    public void CalCost()
    {
        double FinalPrice= this.area * CostPerItem(this.type);
        System.out.format("Total Price="+ FinalPrice);

    }
}
