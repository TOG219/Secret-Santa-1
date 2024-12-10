package angelov.zarko;

public class Main {
    public static void main(String[] args) {
        Secret_Santa.AddToArray("Josh");
        Secret_Santa.AddToArray("Jeff");
        Secret_Santa.AddToArray("Mag");
        Secret_Santa.AddToArray("Stroll");
        Secret_Santa.AddToArray("Cooper");

        System.out.println("Your draw is: "+Secret_Santa.Draw()+"!");
    }
}