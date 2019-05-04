//The PaymentStrategy,MasterRoachCreditCard, RoachPal are the strategy pattern
//portion of the project. The rest of the classes are used for the example.
public class Strategy 
{
    public static void main(String[] args) 
    {
        //Creates things of type Item with upc code and item price
        Item chips = new Item("1010101", 5);
        Item grenade = new Item("1010107", 25);
        Item tv = new Item("1010101", 500);
        Item soda = new Item("1010101", 1);
        
        //Creates shopping cart and items can be added to it and added to a list
        // within the shopping cart class
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(chips);
        cart.addItem(grenade);
        cart.addItem(tv);
        cart.addItem(soda);
        
        //Creates objects of the two different payment methods
        MasterRoachCreditCard ccColony1 = new MasterRoachCreditCard("colony1","435689685438","0403","654");
        RoachPal ppColony1 = new RoachPal("colony1", "colony1@gmail.com");
        
        //Passes the payment method to the cart object
        //the cart objects pay method calls its calculatetotal method to get total amount
        // the amount is passed into the payment methods pay method
        cart.pay(ccColony1);
        cart.pay(ppColony1);
    }   
}
