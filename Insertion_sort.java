    for (int i = 1; i <arr.length ; i++) {// outer foor loop
                int k=arr[i];// take the key
                int j=i-1;
                while(j>=0&&arr[j]>k){// run the while loop for checking the previous minimum element
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=k;
            }
