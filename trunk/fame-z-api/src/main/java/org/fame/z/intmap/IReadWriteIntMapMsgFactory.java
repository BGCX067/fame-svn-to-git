package org.fame.z.intmap;



/**
 * IntMapMsgFactory.
 * 
 * @author anavarro - Jun 6, 2011
 * 
 */
public interface IReadWriteIntMapMsgFactory<T extends IReadWriteIntMapMsg>
{
    /**
     * create.
     * 
     * @return
     */
    T create();
}
