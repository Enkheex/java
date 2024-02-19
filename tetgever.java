import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class tetgever{
    public static void main(){
        Scanner n= new Scanner(System.in);
        String str=n.nextLine();
        int[] birthdate = Birthdate(str);
        LocalDate currentDate = LocalDate.now();
        LocalDate birthodor = LocalDate.of(birthdate[0], birthdate[1], birthdate[2]);
        LocalDate tetgevertsag;
        if(Gender(str)=="male"){
                 tetgevertsag= LocalDate.of(birthdate[0]+60, birthdate[1], birthdate[2]);
        }
        else{
            tetgevertsag = LocalDate.of(birthdate[0]+55, birthdate[1], birthdate[2]);

        }
        Period period = Period.between(birthodor, currentDate);
        Period tetgever = Period.between(currentDate,tetgevertsag);
        int yearsLived = period.getYears();
        int yearsUntiltetgever = tetgever.getYears();
        int monthsUntiltetgever = tetgever.getMonths();
        int daysUntiltetgever = tetgever.getDays();
        System.out.println("birthplace: " + Place(str));
        System.out.println("age: " + yearsLived);
        System.out.println("sex: " + Gender(str));
        System.out.println("bday: " + birthdate[0] + "/" + birthdate[1] + "/" + birthdate[2]);
        System.out.println("nasand hursen eseh: " + drinkage(yearsLived));
        System.out.println("tetgevert garah hurtel: "+ yearsUntiltetgever + " jil," + monthsUntiltetgever + " sar, " + daysUntiltetgever + " udur");
    }
    public static String drinkage(int yearsLived){
        if(yearsLived>=18){
        return "tiim";
    }
    else{
        return "ugui";
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
    public static String Place(String str) {
        char place=str.charAt(0);
        switch (place) {
            case 'А':
                return "arhangai";
            case 'Б':
                return "baynulgii";
            case 'В':
                return "baynhongor";
            case 'Г':
                return "bulgan";
            case 'Д':
                return "govialtai";
            case 'Е':
                return "dornogovi";
            case 'Ж':
                return "dornod";
            case 'З':
                return "dundgovi";
            case 'И':
                return "zavhan";
            case 'Й':
                return "uvurhangai";
            case 'К':
                return "umnugovi";
            case 'Л':
                return "suhbaatar";
            case 'М':
                return "selenge";
            case 'Н':
                return "tuv";
            case 'О':
                return "uvs";
            case 'П':
                return "hovd";
            case 'Р':
                return "huvsgul";
            case 'С':
                return "hentii";
            case 'Т':
                return "darhan";
            case 'Ф':
                return "orhon";
            case 'Х':
                return "govisumber";
            case 'У':
                return "ub";
            case 'Ч':
            default:
                return "unknown";
        }
    }
    public static String Gender(String str){
        char gender= str.charAt(8);
        int sex = (int) gender;
        if(sex%2==0){
        return "female";
    }
    else{
        return "male";
    }
    }
}
