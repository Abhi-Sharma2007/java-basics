package strings;
import java.util.Scanner;

public class romantoint {

    public int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = getValue(s.charAt(i));

            if (value < prevValue) {
                total -= value;
            } else {
                total += value;
            }
            prevValue = value;
        }
        return total;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        romantoint converter = new romantoint();
        System.out.print("Enter a Roman numeral: ");
        String roman = sc.nextLine();

        int result = converter.romanToInt(roman);
        System.out.println("The integer value is: " + result);

        sc.close();
    }
}
