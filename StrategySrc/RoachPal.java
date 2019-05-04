public class RoachPal implements PaymentStrategy
{
    String name;
    String email;
    
    RoachPal()
    {}
    
    RoachPal(String n, String e)
    {
        name = n;
        email = e;
    }
    
    public void pay(int amount)
    {
        System.out.println("RoachPal Total: $" + amount);
    }
    
    public String toString()
    {
        return name + " " + email;
    }
}
