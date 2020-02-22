package epam.interest;

public class SimpleInterest extends Interest{
    SimpleInterest(int principal,int rate,int time)
    {
        super(principal,rate,time);
    }

    public void calcSimpleInterest()
    {
        double amount=(principal*rate*time)/100;
        System.out.format("Simple Interest ="+ amount);
    }
}
