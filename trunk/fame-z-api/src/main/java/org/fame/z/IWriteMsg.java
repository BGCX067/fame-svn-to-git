package org.fame.z;

/**
 * IWriteMsg.
 * 
 * @author anavarro - Nov 11, 2011
 * 
 */
public interface IWriteMsg
{
    /**
     * writeTo.
     * 
     * @return
     */
    byte[] writeTo();
   
    /**
     * writeTo.
     * 
     * @param bytes
     * @param offset
     * @return
     */
    int writeTo(byte[] bytes, final int offset);
}
