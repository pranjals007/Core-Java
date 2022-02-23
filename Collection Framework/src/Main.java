import java.util.Date;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Date>date1 = new LinkedList<>();
        Date dt = new Date();
        date1.add(dt);
        int year = dt.getYear();
        int currentyear = year+1990;
        System.out.println("current year is :"  + currentyear);
        boolean leap = false;
        if (currentyear % 4 == 0){
            if(currentyear%100==0){
                if(currentyear%400==0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;

        }
        else
            leap = false;
        if (leap)
            System.out.println();
    }
}
