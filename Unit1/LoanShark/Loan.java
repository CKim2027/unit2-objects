public class Loan {
    double principle;
    double rate;
    double time;
    int number;

    public Loan(double p, double r, double t, int n) {
        this.principle = p;
        this.rate = r;
        this.time = t;
        this.number = n;
    }

    double calculateSimpleInterest(){
        return principle + principle * rate/100 * time;
        
    }

    double calculateTotalRepayment(){
        return principle * Math.pow(1 + rate/100/number, number*time);
    }
}