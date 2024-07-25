package components;

public class Sort {
    public static void bubbleSort(int[] array){
        int size = array.length-1;
        int steps =0;
        int temp=0;
        for(int i=0;i<size;i++){
            for(int j=0; j<size-i;j++){
                steps++;
                if(array[j]>array[j+1]){
                    temp= array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("Steps taken in BubbleSort: "+steps);
    }
    public static void selectionSort(int[]array){
        int minIndex=0;
        int temp =0;
        int steps =0;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                steps++;
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            temp = array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
        System.out.println("Steps taken in SelectionSort: "+steps);
    }
    public static void insertionSort(int[] array){
        int steps=0;
        for(int i=1; i<array.length;i++){
            int key = array[i];
            int j = i-1;
            while(array[j]>key && j>0){
                array[j+1]=array[j];
                j--;
                steps++;
            }
            steps++;
            array[j+1] =key;
        }
        System.out.println("Steps taken in InsertionSort: "+steps);
    }
    public static void quickSort(int[] arr, int low, int high, int[] steps){
        if(low<high){
            int pi = partitionPivot(arr, low, high, steps);
            quickSort(arr, low, pi-1, steps);
            quickSort(arr, pi+1, high, steps);
        }
    }
    private static int partitionPivot(int[] arr, int low, int high, int[] steps) {
        int pivot = arr[high];
        int i = low-1;
       for(int j=low; j<high; j++){
        steps[0]++;
        if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
       }
       steps[0]++;
       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp;
       
       return i+1;
    }
    public static int mergeSort(int[] arr, int left, int right, int[] steps){
        if(left<right){
            int mid = (left+right)/2;
            mergeSort(arr, left, mid, steps);
            mergeSort(arr, mid+1, right, steps);

            merge(arr, left, right, mid, steps);
        }
        return steps[0];
    }
    private static void merge(int[] arr, int left, int right, int mid, int[]steps) {
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[]L = new int[n1];
        int[]R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i]= arr[left+i];
            steps[0]++;
        }
        for(int j=0;j<n2;j++){
            R[j]= arr[mid+1+j];
            steps[0]++;
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
            steps[0]++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
            steps[0]++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
            steps[0]++;
        }
        steps[0]++;
    }
}
