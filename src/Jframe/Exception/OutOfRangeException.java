package Jframe.Exception;


public class OutOfRangeException extends Exception {

    /**
     * Creates a new instance of without any kind of detail
     * 
     */
    public OutOfRangeException() {
    }

    /**
     *
     * @param msg the detail message.
     */
    public OutOfRangeException(String msg) {
        super(msg);
    }
}
