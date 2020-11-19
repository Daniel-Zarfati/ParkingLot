
public abstract class Slot {
    public int parkingSize;
    Car car;

    public Slot() {
        this.parkingSize = 0;
        this.car = null;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getParkingSize() {
        return parkingSize;
    }

    public void setParkingSize(int parkingSize) {
        this.parkingSize = parkingSize;
    }

    public boolean add(Car _car){

        if( _car.getCarSize()<=this.parkingSize&&this.car==null) {
            this.car = _car;
            return true;
        }
            return false;
        }

    public void remove(Car _car) {
         if (this.car!=null&&this.car.getCarNumber().equals(_car.getCarNumber())) {
         this.car = null;
         }
    }
}
