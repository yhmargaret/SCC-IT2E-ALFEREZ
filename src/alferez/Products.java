package alferez;

public class Products {
    int pid, pstocks, psold;
    String pname;
    double pprice;
    
    public void addProducts(int id, String name, double price, int stocks, int sold){
        this.pid = id;
        this.pname = name;
        this.pprice = price;
        this.pstocks = stocks;
        this.psold = sold;
    }
    
    public void viewProducts(){
        double profit = this.psold * this.pprice;
        double top = this.pstocks * this.pprice;
        String status = (this.pstocks > 0) ? "Available" : "Out-of-Stock";
        
        System.out.printf("%-10d | %-10s | %-10.2f | %-10d | %-10d | %-10.2f | %-10.2f | %-10s\n", 
                this.pid, this.pname, this.pprice, this.pstocks, this.psold, profit, top, status);
    }
}
