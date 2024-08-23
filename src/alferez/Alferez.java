
package alferez;
        
import java.util.Scanner;

public class Alferez {

    public static void main(String[] args) {
        Sales sell = new Sales();    
//        sell.get_sales();

        Grades gr = new Grades();
//        
//        gr.addGrades("Hanna", 1001, 3.0, 1.0, 1.1, 1.0);
//        gr.viewGrades();
        
        Products pr = new Products();
        Products pr1 = new Products();
        
        pr.addProducts(1001, "Sabon", 15, 20, 5);
        pr1.addProducts(1002, "Shampoo", 12, 0, 10);
        pr.viewProducts();
        pr1.viewProducts();
    }
    
}
