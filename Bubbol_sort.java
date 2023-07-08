    for (int i = 0; i < arr.length; i++) {// outer loop
           for (int j = 0; j < arr.length-1-i; j++) {//inner loop
if (arr[j]>arr[j+1]){// swap condition
   int temp=arr[j];
   arr[j]=arr[j+1];
   arr[j+1]=temp;
}
           }
       }
