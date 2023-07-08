    for(int i=0;i<arr.length-1;i++){// outer loop
           int min=i;// i am assum thet my i th element is mminimum
           for (int j = i+1; j <arr.length; j++) { //inner loop
               if(arr[min]>arr[j])min=j;

           }//finding the minimum
           if(i!=min){// check the same element 
               int temp=arr[i];//  swap
           arr[i]=arr[min];
           arr[min]=temp;
           }

       }
