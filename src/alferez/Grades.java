package alferez;

public class Grades {
    String sname;
    int sid;
    double p, m, pf, f, average;
    
    public void addGrades(String name, int id, double p, double m, double pf, double f){
        this.sid = id;
        this.sname = name;
        this.p = p;
        this.m = m;
        this.pf = pf; 
        this.f = f;
    }
    
    public void viewGrades(){
        this.average = (this.p + this.m + this.pf + this.f) / 4;
        String remarks = (average > 3.0) ? "Failed" : "Passed";
        
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                this.sid, this.sname, this.p, this.m, this.pf, this.f, average, remarks);
    }
}
