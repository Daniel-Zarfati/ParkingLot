
import java.util.ArrayList;

public class ParkingLot  {
    ArrayList<SavePark> SaveParkings = new ArrayList<SavePark>();
    ArrayList<DisablePark> DisParkings = new ArrayList<DisablePark>();
    ArrayList<RegularPark> RegParkings = new ArrayList<RegularPark>();

    public int GetParkingSlot(Car c){
        ArrayList<Slot> temp=getPark();
        int ans=0;
        for(Slot i : temp){
           if(i.car.equals(c)){
               return ans;
           }
           ans++;
        }
        return -1;
    }

    public ArrayList<Slot> getPark(){
        ArrayList<Slot> ans= new ArrayList<Slot>();
        for(RegularPark i: RegParkings){
           ans.add(i);
        }
        for(SavePark i: SaveParkings){
            ans.add(i);
        }
        for(DisablePark i:DisParkings){
            ans.add(i);
        }
        return ans;
    }

    public ParkingLot(ArrayList<Car> cars,int parkingsize) {
        int dis20= (int) (parkingsize*0.2);
        int save10=(int) (parkingsize*0.1);
        int reg70=(int) (parkingsize*0.7);

        for(Car i:cars){
           if (i.isDisable()==true && dis20!=0) {
               DisablePark a= new DisablePark();
               //a.add(i);
              boolean flag= DisParkings.add(a);
              if(flag==true) {
                  dis20--;
              }
           }
            else if ((i.getCarOwner().equals("Professor")&& save10!=0)) {

               SavePark a= new SavePark();
              // a.add(i);
                boolean flag= SaveParkings.add(a);
                if(flag==true) {
                    save10--;
                }
            }else if(reg70!=0){
               RegularPark a= new RegularPark();
               //a.add(i);
               boolean flag= this.RegParkings.add(a);
               if(flag==true){
                   reg70--;
               }
           }
        }

    }


}

