
package alferez;
        
import java.util.Scanner;

public class Alferez {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          
        int choice;
        
        System.out.println("1. Sales");
        System.out.println("2. Grades");
        System.out.println("3. Products");
        System.out.println("4. Accounts");
        System.out.print("Choice: ");
        choice = scan.nextInt();
        System.out.println("");

        switch (choice) {
            case 0:
                break;
            case 1: 
                Sale sell = new Sale(); 
                sell.get_sales();
                break;
            case 2:
                Grade gr = new Grade();
                gr.getGrades();
                break;
            case 3:
                Product pr = new Product();
                pr.getProducts();
                break;
            case 4:
                Account acc = new Account();
                acc.getAccount();
                break;
            default:
                System.out.println("????????\n");
                break;
        }         
    }
    
}
