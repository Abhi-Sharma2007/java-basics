import java.util.Scanner;
public class deleteword {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();  
        System.out.println("Enter the word to be deleted:");
        String wordToDelete = sc.nextLine();
        String modifiedString = mainString.replaceAll("\\b" + wordToDelete + "\\b", "").replaceAll(" +", " ").trim();
        System.out.println("Modified string:");
        System.out.println(modifiedString);
        sc.close();
    }
}       