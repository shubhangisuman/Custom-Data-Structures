//extend exception or implement throwable
package sort;
class NotSortedException extends RuntimeException{
    public NotSortedException() {
        super("Array is not sorted!"); //runtime one
    }

    public NotSortedException(String message) {
        super(message);
    }
}