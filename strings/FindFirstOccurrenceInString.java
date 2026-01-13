import java.util.Scanner;
public class FindFirstOccurrenceInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = sc.nextLine();
        System.out.println("Enter the substring to find:");
        String subString = sc.nextLine();

        int index = mainString.indexOf(subString);
        if (index != -1) {
            System.out.println("The first occurrence of \"" + subString + "\" is at index: " + index);
        } else {
            System.out.println("The substring \"" + subString + "\" was not found in the main string.");
        }
        sc.close();
    }
}
