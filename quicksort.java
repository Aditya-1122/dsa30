  //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        // code here
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot=arr[low];
        int count=0;
        for(int i=low+1;i<=high;i++)
        {
            if(arr[i]<=pivot)
            count++;
        }
        
        int pi=low+count;
        
        //swap with pivot index element
        int temp=pivot;
        arr[low]=arr[pi];
        arr[pi]=temp;
        
        int i=low,j=high;
        
        while(i<pi&&j>pi)
        {
            while(arr[i]<=pivot)
            i++;
            
            while(arr[j]>pivot)
            j--;
            
            if(i<pi&&j>pi)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return pi;
        
    } 