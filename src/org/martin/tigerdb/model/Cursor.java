package org.martin.tigerdb.model;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author martin
 * @param <T>
 */
public final class Cursor<T> implements Iterator<T>{
    private final Table<T> table;
    private long cursorIndex;

    public Cursor(Table<T> table) {
        this.table = table;
    }
    
    public void begin(){
        setPosition(0);
    }
    
    public void end(){
        setPosition(table.selectCount()-1);
    }
    
    public void setPosition(long position){
        cursorIndex = position;
    }
    
    /**
     * Devuelve true si existen más elementos por recorrer, false en caso contrario.
     * @return Valor booleano indicando si si existen más elementos por recorrer, 
     * false en caso contrario.
     */
    @Override
    public boolean hasNext(){
        return cursorIndex < table.selectCount();
    }
    
    /**
     * Devuelve el siguiente elemento de la tabla.
     * @return El siguiente elemento de la tabla.
     */
    
    @Override
    public T next(){
        return table.selectBy((int) cursorIndex++);
    }
    

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        for (T t : table.selectAll()) {
            action.accept(t);
        }
    }
    
}
