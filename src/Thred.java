
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thred implements Runnable{

    static final int MAX_sadranim = 3;
        int Carcounter=0;
        ParkingLot parks;
        ArrayList<Car> cars;
        private String name="";

        public Thred(ArrayList<Car> _cars,int parkingsize)
        {
           cars=_cars;
           parks=new ParkingLot(_cars, parkingsize);
        }
             int count1=0; // Disable
             int count2=0; // Save Professor
             int count3=0; // Reg
            public synchronized  void plus(Car i) {

    try {
        if (i.isDisable()) {
            parks.DisParkings.get(count1).setParkingSize(i.getCarSize());
            count1++;
            System.out.println("Car no " + Carcounter + " " + i.getCarOwner() + " Disable park " + count1 + " size " + i.getCarSize());
        } else if (i.getCarOwner().equals("Professor")) {
            parks.SaveParkings.get(count2).setParkId(i.getCarNumber());
            parks.SaveParkings.get(count2).setParkingSize(i.getCarSize());
            count2++;
            System.out.println("Car no " + Carcounter + " " + i.getCarOwner() + " Save park " + count2 + " size " + i.getCarSize());
        } else {
            if (i.isDisable()) {
                parks.RegParkings.get(count3).setParkingSize(i.getCarSize());
                System.out.println("Car no " + Carcounter + " " + i.getCarOwner() + " Regular park " + count3 + " size " + i.getCarSize());
            } else if (i.getCarOwner().equals("Professor")) {
                parks.RegParkings.get(count3).setParkingSize(i.getCarSize());
                System.out.println("Car no " + Carcounter + " " + i.getCarOwner() + " Regular park " + count3 + " size " + i.getCarSize());
            } else {
                parks.RegParkings.get(count3).setParkingSize(i.getCarSize());
                System.out.println("Car no " + Carcounter + " " + i.getCarOwner() + " Regular park " + count3 + " size " + i.getCarSize());
            }
            count3++;
        }
        this.Carcounter++;
    } catch (IndexOutOfBoundsException e) {
        System.out.println("no room for car X");
    }
}
        public void start(){
            Runnable r1 = this::run;
            Runnable r2 = this::run;
            Runnable r3 = this::run;
            ExecutorService pool = Executors.newFixedThreadPool(MAX_sadranim);

             pool.execute(r1);
             pool.execute(r2);
             pool.execute(r3);
             pool.shutdown();
}
        int count=0;

        public synchronized void run()
        {
            try
            {
                Thread.sleep(0);
        while(count<cars.size()) {
        plus(cars.get(count));
        count++;
        }
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

}

