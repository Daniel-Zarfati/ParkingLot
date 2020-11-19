import java.util.Date;

public class RegularPark extends Slot {
    static final int key = 1;
    Date date;
    public RegularPark() {
        super();
        date=java.util.Calendar.getInstance().getTime();
    }

    public boolean add(Car _car) {
        if ((int) date.getHours() > 7 && (int) date.getHours() < 19) {
            return super.add(_car);
        } else {
            return false;
        }
    }

}
