
public class SavePark extends Slot {
    static final int key = 3;
    private String parkId;

    public SavePark() {
        super();
        this.parkId = "";
    }
    public void setParkId(String parkId) {
        this.parkId = parkId;
    }

    public String getParkId() {
        return parkId;
    }

    public boolean add(Car _car) {
        if (_car.getCarNumber().equals(this.parkId)&&(_car.getCarOwner().equals("Professor")||_car.getCarOwner().equals("lecturer"))) {
            return super.add(_car);
        } else {
            return false;
        }
    }
}