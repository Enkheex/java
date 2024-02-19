import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.Month;
import java.time.DayOfWeek;
public class last{
    public static void main(){
        System.out.println("uurin register");
        Scanner n= new Scanner(System.in);
        String str=n.nextLine();
        System.out.println("nzin register");
        Scanner l= new Scanner(System.in);
        String nz=l.nextLine();
        int[] birthdate = Birthdate(str);
        int[] nzbirthdate = Birthdate(nz);
        LocalDate currentDate = LocalDate.now();
        LocalDate nzbirthodor = LocalDate.of(nzbirthdate[0], nzbirthdate[1], nzbirthdate[2]);
        LocalDate birthodor = LocalDate.of(birthdate[0], birthdate[1], birthdate[2]);
        LocalDate shinejil = LocalDate.of(2023, 12, 31);
        Period period = Period.between(birthodor, currentDate);
        Period nzperiod = Period.between(nzbirthodor, currentDate);
        int yearsLived = period.getYears();
        int nzyearsLived = nzperiod.getYears();
        DayOfWeek torsonodor = birthodor.getDayOfWeek();
        DayOfWeek shinejilodor= shinejil.getDayOfWeek();
        String monthName = Month.of(birthdate[1]).toString();
        System.out.println("tursun on sar: " + birthdate[0] + "/" + monthName + "/" + birthdate[2]);
        System.out.println("chi " + torsonodor + " tursun");
        System.out.println("shine jil " + shinejilodor + " bolno");
        int zoruu;
        if(nzyearsLived>yearsLived){
        zoruu=nzyearsLived-yearsLived;
        System.out.println("nzas " + zoruu + " duu" );
    }
    else if(nzyearsLived<yearsLived){
        zoruu=yearsLived-nzyearsLived;
        System.out.println("nzas " + zoruu + " ah" );
    }
    else{
        System.out.println("chatsuu" );

    }
    }
    public static int[] Birthdate(String str){
        String birthyear= str.substring(2, 4);
        String birthmonth= str.substring(4, 6);
        String birthday= str.substring(6, 8);
        int on = Integer.parseInt(birthyear);
        int sar = Integer.parseInt(birthmonth);
        int odor = Integer.parseInt(birthday);
        if(sar<20){
            on=on+1900;
        }
        else{
            on=on+2000;
            sar=sar-20;
        }
         int[] result = {on, sar, odor};
        return result;    
    }
}