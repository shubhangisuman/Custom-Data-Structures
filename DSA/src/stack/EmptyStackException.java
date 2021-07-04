//extend exception or implement throwable
class EmptyStackException extends RuntimeException{
    public EmptyStackException() {
        super("Stack has no elements!"); //runtime one
    }

    public EmptyStackException(String message) {
        super(message);
    }
}