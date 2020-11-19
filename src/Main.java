import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Car> temp=new ArrayList<>();

        for(int i=1;i<=200;i++){
            Random ran = new Random();
            int x = ran.nextInt(3);
            Random ran2 = new Random();
            int x1 = ran.nextInt(3);
            Random ran1= new Random();
            int s_p = ran1.nextInt(2);
            Car a=new Car();
            a.setCarSize(x1+1);
            if(s_p==0){
                a.setCarOwner("Student");
            }else{
                a.setCarOwner("Professor");
            }
            if(x==0){
                a.setCarOwner("Professor");
                a.setCarNumber("147");
                temp.add(a);

            }else if(x==1) {
                a.setDisable(true);
                temp.add(a);
            }else{
                temp.add(a);
            }
        }
        Thred a=new Thred(temp,250);
        a.start();
    }
}
