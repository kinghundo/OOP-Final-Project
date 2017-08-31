/*
The purpose of this project is to create a simple tool for car rental owners to
manage their custoers and cars and also to keep track of financials and business
deals.
*/
package carrental;
public class CarRental {
    private Car[] cars;
    private Customer[] customers;
    private int numberOfCars;
    int numberOfCustomers;
    private String rentalName;
    private int carsAvailable=0;
    
    
    //Constructors
    public CarRental(String name){
        this.rentalName=name;
       
    }
    
    //Methods
    public void addCustomer(int id, String name){
        Customer cust = new Customer(id,name);
        if(customers.length<1){
            customers[0]=cust;
        }
        else{
            customers[numberOfCustomers+1]=cust;
        }
    }
    public void addCar(int plateNumber,String name, double price){
        Car car1 = new Car(plateNumber, name, price);
        if(cars.length<1){
            cars[0]=car1;
        }
        else{
            cars[numberOfCars+1]=car1;
        }
    }
    public int getNumberOfCars(){
        numberOfCars=cars.length;
        return numberOfCars;
    }
    public int getNumberOfCustomers(){
        numberOfCustomers=customers.length;
        return numberOfCustomers;
    }
    public int getCarsAvailable(){
        for(int i=0;i<cars.length;i++){
            Car temp = cars[i];
            if(temp.isAvailable()==true){
                carsAvailable++;
            }
        }
        return carsAvailable;
    }
    public void assign(Customer cust, Car car, int duration){
        cust.setCarRented(car, duration);
        car.setLoaner(cust.getName());
    }
    public void terminateLoan(Customer cust){
        cust.setRentDuration(0);
    }
    public double getTotalIncome(){
        double totalIncome=0;
        for(int i=0;i<customers.length;i++){
            Customer temp = customers[i];
            totalIncome+=temp.getTotalRentPrice();    
        }
        return totalIncome;
    }
}
