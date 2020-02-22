package epam.interest;

public class CompoundInterest extends Interest{
    public CompoundInterest(int principal,int rate,int time) {
        super(principal,rate,time);
    }
    public void calcCompoundInterest()
    {
        double amount=principal*Math.pow((1+rate/100.0),time);
        System.out.format("%s","Compound Interest="+ amount);
    }
}
