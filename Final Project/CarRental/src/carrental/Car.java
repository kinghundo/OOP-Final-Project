package carrental;
public class Car {
    private int plateNumber;
    private String name;
    private boolean available;
    private String loaner;
    private double loanPricePerMonth;
    
    //Constructors
    public Car(int pn, String name, double price){
        this.plateNumber=pn;
        this.name=name;
        this.loanPricePerMonth=price;
    }
    
    //Methods
    public int getPlateNumber(){
        return plateNumber;
    }
    public String getName(){
        return name;
    }
    public boolean isAvailable(){
        return available;
    }
    public void setPlateNumber(int pn){
        this.plateNumber=pn;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setLoaner(String loaner) {
        this.loaner = loaner;
    }

    public double getLoanPricePerMonth() {
        return loanPricePerMonth;
    }

    public String getLoaner() {
        return loaner;
    }

    public void setLoanPricePerMonth(double loanPricePerMonth) {
        this.loanPricePerMonth = loanPricePerMonth;
    }
    
}
