
public interface PaymentStrategy 
{
    public void pay(int amount);
}
//change int in pay to double to handle decimal amounts
//change it for the subclasses also