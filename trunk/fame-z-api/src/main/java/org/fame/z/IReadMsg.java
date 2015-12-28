package org.fame.z;

/**
 * IReadMsg.
 * 
 * @author anavarro - Nov 11, 2011
 * 
 */
public interface IReadMsg
{

    /**
     * readFrom.
     * 
     * @param bytes
     * @param offset
     * @param length
     */
    void readFrom(final byte[] bytes, final int offset, final int length);
}
