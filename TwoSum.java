
import java.util.Scanner;
class TwoSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=0;

        System.out.println("Enter size of array");
        n=sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(numbers[i]+numbers[j]==target){
                    System.out.println("Indices: " + i + ", " + j);
                    return;
                }
            
            }
        }
    }
}