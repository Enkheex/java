import java.util.Scanner;

public class datatype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String dataType = determine(input);
        System.out.println(dataType);
    }

    public static String determine(String input) {
        try {
            Integer.parseInt(input);
            return "int";
        } catch (NumberFormatException e) {
            if (input.length() == 1) {
                return "char";
            } else {
                return "String";
            }
        }
    }
}
