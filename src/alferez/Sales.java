
package alferez;

import java.util.Scanner;

public class Sales {
  
    public void getSales(){
        Scanner input = new Scanner (System. in);
        
        System.out.print("Customer name: ");
        String  customer = input.nextLine();
        System.out.print("Product name: ");
        String product = input.nextLine();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        System.out.print("Price: ");
        float price = input.nextFloat();
        System.out.print("Cash: ");
        float cash = input.nextFloat();
        
        
        System.out.println("\n---------------------");
        System.out.println("RECEIPT");
        System.out.println("-----------------------");
        
        System.out.println ("Name: "+customer);
        System.out.println("Product: "+product);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total due: "+(price*quantity));
        System.out.println("Change: "+(cash-(price*quantity)));
    }
}
