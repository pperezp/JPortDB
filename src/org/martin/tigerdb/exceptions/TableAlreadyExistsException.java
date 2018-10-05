package org.martin.tigerdb.exceptions;

/**
 *
 * @author martin
 */
public class TableAlreadyExistsException extends RuntimeException {

    /**
     * Creates a new instance of <code>TableAlreadyExistsException</code>
     * without detail message.
     */
    public TableAlreadyExistsException() {
    }

    /**
     * Constructs an instance of <code>TableAlreadyExistsException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public TableAlreadyExistsException(String msg) {
        super(msg);
    }
}
