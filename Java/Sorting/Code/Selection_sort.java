import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array : ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements in the array : ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        Selection_sorting(arr);
        for(int i=0;i<n;i++){
            System.out.printf("%d  ",arr[i]);
        }
    }

    static void Selection_sorting(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int min=i,temp;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j])
                    min=j;
            }
            if(i!=min){
                temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}
