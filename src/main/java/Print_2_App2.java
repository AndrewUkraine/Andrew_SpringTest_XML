import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by AndrewUkraine on 06.02.2018.
 */



public class Print_2_App2 implements Print_App2 {

/*@Autowired - помечвем значение. Это нужно, что бы обязательно значене было обозначено. Если значение не поставили, то Exception. Если нет этой анотации, то при компиляции просто будет null  */

    @Value("Hellow World")
    private String masseg;


public Date getTime () {
    Calendar calendar = Calendar.getInstance();
   Date a =  calendar.getTime();
    System.out.println(a);
    return a;
}


    public void setMasseg(String masseg) {
        this.masseg = masseg;
    }


    @Override
    public void print() {
    for (int i=0; i<5; i++) {
        getTime();
        System.out.println(masseg);
        try {
            Thread.sleep(100);
            System.out.println("i walked up");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    }
}
