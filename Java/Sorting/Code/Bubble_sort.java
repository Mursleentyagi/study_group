import java.util.Scanner;
public class Bubble_sort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in the array : ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        Bubble_sorting(arr);
        for(int i=0;i<n;i++){
            System.out.printf("%d  ",arr[i]);
        }
    }
    static void Bubble_sorting(int[] arr) {
        int i,j,temp;
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
