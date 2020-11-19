import java.util.ArrayList;

public class Garage extends Car {

    private final int maxCars;    // That can be fixed at the same time
    ArrayList <Car> FixingCars = new ArrayList<Car>();

    public Garage(int maxCars) {
        super();
        this.maxCars = maxCars;

    }

    public boolean addCarToGarage (Car car) {
        if (FixingCars.size() < maxCars) {
            FixingCars.add(new Car (car.getCarNumber(),car.getCarSize(),car.isDisable(),car.getCarOwner())); // must be at the same order as the Car Constructor!
            return true;
        } else {
            System.out.println("The garage is full");
            return false;
        }
    }

    public String toString() {
        String s="";
        for (int i = 0; i < FixingCars.size(); i++) {
           s+= FixingCars.get(i).toString();
           s+="\n";
        }
        return s;
    }

    public boolean existCar(Car car){
        for (int i = 0; i < FixingCars.size(); i++) {
            if (FixingCars.get(i).getCarNumber().equals(car.getCarNumber())) {      // is it ok to compere object to object ?
                System.out.println("Car "+ FixingCars.get(i).getCarNumber() + " is ready to leave the garage");
                FixingCars.remove(i);
                return true;
            } else {
                System.out.println("Car not found in the garage");
            }
        }
        return false;
    }
}