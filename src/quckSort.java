public class quckSort
{
    public int partition(int[]arr, int left, int right)
    {
        int pivot = right;
        int i = left - 1;
        int temp = arr[i];
        for(int j = 0; j < arr.length; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                arr[i] = arr[j];
                arr[j] = arr[temp];
            }
        }
        int tempp = arr[i + 1];
        arr[i + 1] = arr [right];
        arr[right] = tempp;
        return i+1;
    }
}
