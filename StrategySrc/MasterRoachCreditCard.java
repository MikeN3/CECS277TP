public class MasterRoachCreditCard implements PaymentStrategy
{
    String name;
    String cardNumber;
    String expirationDate;
    String securityCode;
    
    MasterRoachCreditCard()
    {}
    
    MasterRoachCreditCard(String n, String c, String e, String s)
    {
        name = n;
        cardNumber = c;
        expirationDate = e;
        securityCode = s;
    }
    
    public void pay(int amount)
    {
        System.out.println("MasterRoachCreditCard Total: $" + amount);
    }
    
    public String toString()
    {
        return name + " " + cardNumber + " " + expirationDate +
                " " + securityCode;
    }
}
