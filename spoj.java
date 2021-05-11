import java.util.Scanner;

public class spoj {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size");
        int t = scan.nextInt();
        int arr[] = new int[t];
        System.out.println("Enter values");
        for(int i=0; i<t; i++){
            arr[i] = scan.nextInt();

        }
        int temp;

        int start =0;
        int end = t-1;

        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }
        System.out.println("Inverted array");
        for(int j=0; j<t; j++){
            System.out.println(arr[j]);
        }

    }
}
