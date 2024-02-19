import java.text.DecimalFormat;
import java.util.Scanner;
public class decimal {
    public static void main() {
        Scanner n=new Scanner(System.in);
        long number =n.nextInt();        
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedNumber = decimalFormat.format(number);
        System.out.println(formattedNumber); 
    }
}