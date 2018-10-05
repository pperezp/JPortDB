package org.martin.tigerdb.exceptions;

/**
 *
 * @author martin
 */
public class UnknownDatabaseException extends RuntimeException{

    public UnknownDatabaseException() {
    }

    public UnknownDatabaseException(String message) {
        super(message);
    }
    
}
