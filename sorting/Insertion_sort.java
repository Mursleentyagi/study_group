import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Insertion_sorting(arr);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d  ", arr[i]);
        }
    }
    static void Insertion_sorting(int[] arr){

        int item;
        for(int i=1;i<arr.length;i++){
            item=arr[i];
            int j=i-1;
            while(j>=0&&item<arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]=item;
        }

    }
}
