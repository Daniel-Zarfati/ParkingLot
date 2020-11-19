import java.util.ArrayList;

public class Car {
    private String carNumber;
    private int carSize;
    private boolean disable;
    private String carOwner;

    ArrayList<String> saveParkingSlots = new ArrayList<String>();
 public Car(){
    carNumber="";
    carSize=0;
    disable=false;
    carOwner="";
}
    public Car(Car other){
        this.carOwner=other.getCarOwner();
        this.carSize=other.getCarSize();
        this.disable=other.isDisable();           // shallow Cons - copies only fields
        this.carNumber=other.getCarNumber();

        ArrayList<String> temp = new ArrayList<String>();
        for(String i:other.saveParkingSlots){
            temp.add(i);
        }
        this.saveParkingSlots=temp;
    }

    public Car(String carNumber, int carSize, boolean disable, String carOwner) {
        this.carNumber = carNumber;
        this.carSize = carSize;
        this.disable = disable;
        this.carOwner = carOwner;

        if (this.carOwner.equals("Professor") || this.carOwner.equals("lecturer")) {
            saveParkingSlots.add(carNumber);
        }
    }
    public Boolean equals(Car c){
         if(c.getCarNumber().equals(this.carNumber)&&c.getCarSize()==this.carSize&&this.disable==c.isDisable()&&this.carOwner.equals(c.getCarOwner())){
            return true;
         }
            return false;
    }
    public String toString(){
         return this.carNumber +" "+ this.carSize+" "+this.disable+" " +this.carOwner;
    }
         public String getCarNumber() {
           return carNumber;
         }

    public int getCarSize() {
        return carSize;
    }

    public boolean isDisable() {
        return disable;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void setCarSize(int carSize) {
        this.carSize = carSize;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

}