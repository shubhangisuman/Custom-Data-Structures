package sort;
public class Selection<T extends Comparable<T>>{ //Restrict to only those objects which implements comparable interface
    private void swap(T[] array, int first, int second){
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    private int findMinimum(T[] array,int start,int end){
        int min = start;
        for(int j=start;j<end;j++){
            if(array[j].compareTo(array[min])<0){
                min=j;
            }
        }
        return min;
    }
    private boolean isSorted(T[] array, Order order) {
        if (order == Order.Ascending){
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0)
                    return false;
            }
        }
        else{
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) < 0)
                    return false;
            }
        }
        return true;
    }
    private void assertSotred(T[] array, Order order){ //our assert
        if(!isSorted(array,order))
            throw new NotSortedException();
    }
    public void sort(T[] array, Order order){
        switch(order){
            case Ascending:
                ascending(array);
                break;
            case Descending:
                descending(array);
                break;
        }
        assertSotred(array,order);
    }
    public void sort(T[] array){
        sort(array,Order.Ascending);
    }
    public void ascending(T[] array){
        int n = array.length;
        int min = 0;
        int i=0;
        while(i<n-1){
            min=i;
            min = findMinimum(array,i,n);
            if(min!=i) {
               swap(array,i,min);
            }
            i++;
        }
        assertSotred(array,Order.Ascending); //for 1000 cases (bigger test case) : testing purpose
    }
    public void descending(T[] array){
        int n = array.length;
        int min = 0;
        int i=n-1;
        while(i>=0){
            min=i;
            min = findMinimum(array,0,i+1);
            if(min!=i) {
                swap(array,i,min);
            }
            i--;
        }
        assertSotred(array,Order.Descending);
    }
}