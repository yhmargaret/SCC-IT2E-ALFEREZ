
package alferez;

public class Sales {
  
    String name;
    String prodName;
    double quality, price, cash, total, change;
    
    public void addSale(String name, String pname, double qty, double price, double cash, double total){
        this.name = name;
        this.prodName = pname;
        this.quality = qty;
        this.price = price;
        this.cash = cash;
        this.total = total;
    }
    
    public void viewReceipt(){
        change = cash-total;
        
        System.out.println("--------------------------------");
        System.out.println("\tRECEIPT");
        System.out.println("--------------------------------");
        
        System.out.println("Customer Name: "+name);
        System.out.println("\nItem Name: "+prodName);
        System.out.printf("Quantity: %.0f\n",quality);
        System.out.printf("Unit Price: %.2f\n",price);
        System.out.println("--------------------------------");
        
        System.out.printf("Total Due: %.2f\n",total);
        System.out.printf("Cash: %.2f\n",cash);
        System.out.println("--------------------------------");
        System.out.printf("Change: %.2f\n",change);
    }
}
