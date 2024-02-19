import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String wordToReplace = scanner.next();
        String replacementWord = scanner.next();
        String changedSentence = sentence.replace(wordToReplace, replacementWord);
        System.out.println(changedSentence);
        scanner.close();
    }
}