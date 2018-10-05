package org.martin.tigerdb.exceptions;

/**
 *
 * @author martin
 */
public class UnknownTableException extends RuntimeException {

    /**
     * Creates a new instance of <code>UnknownTableException</code> without
     * detail message.
     */
    public UnknownTableException() {
    }

    /**
     * Constructs an instance of <code>UnknownTableException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UnknownTableException(String msg) {
        super(msg);
    }
}
