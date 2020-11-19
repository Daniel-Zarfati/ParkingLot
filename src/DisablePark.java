
public class DisablePark extends Slot {
    static final int key = 2;
    public DisablePark() {
        super();
    }

    public boolean add(Car _car) {
        if (_car.isDisable()==true) {
           return super.add(_car);

        } else {
            return false;
        }
    }

}
