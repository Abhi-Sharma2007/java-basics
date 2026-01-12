import java.util.Scanner;
public class removeduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
        sc.close();
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
}
