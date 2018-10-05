package org.martin.tigerdb.exceptions;

/**
 *
 * @author martin
 */
public class IncompatibleObjectTypeException extends RuntimeException {

    /**
     * Creates a new instance of <code>ObjectTypeIncompatibleException</code>
     * without detail message.
     */
    public IncompatibleObjectTypeException() {
    }

    /**
     * Constructs an instance of <code>ObjectTypeIncompatibleException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public IncompatibleObjectTypeException(String msg) {
        super(msg);
    }
}
