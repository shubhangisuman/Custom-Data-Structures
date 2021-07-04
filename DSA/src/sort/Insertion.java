package sort;
public class Insertion<T extends Comparable<T>>{
    public Insertion() {
    }
    private void swap(T[] array, int first, int second){
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
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
        int i=1,j=0,n=array.length;
        while(i<n){
            T key = array[i];
            for(j=i-1;j>=0;j--){
                if(array[j].compareTo(array[i])>0){
                    array[j+1]=array[j];
                }
                else
                    break;
            }
            array[j+1]=key;
            i++;
        }
    }
    public void descending(T[] array){
    }
}