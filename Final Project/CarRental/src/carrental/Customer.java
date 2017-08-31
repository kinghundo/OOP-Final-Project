package carrental;
public class Customer {
    private int id;
    private String name;
    private Car carRented;
    private int rentDuration;
    
    //Constructor
    public Customer(int id, String name){
        this.id=id;
        this.name=name;
    }
    
    //Methods
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public Car getCarRented() {
        return carRented;
    }
    public double getRentDuration() {
        return rentDuration;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    

    public void setRentDuration(int rentDuration) {
        this.rentDuration = rentDuration;
    }
    public void setCarRented(Car car, int duration) {
        this.carRented=car;
        if(carRented.isAvailable()==true){
            carRented.setAvailable(false);
            setRentDuration(duration);
        }
    }
    public double getTotalRentPrice(){
        double total;
        total=rentDuration*carRented.getLoanPricePerMonth();
        return total;
    }
   
}
