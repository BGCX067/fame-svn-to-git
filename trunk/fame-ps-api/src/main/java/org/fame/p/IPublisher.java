package org.fame.p;

import org.fame.EStatus;
import org.fame.z.map.intmap.IWriteIntMapMsg;


/**
 * IPublisher.
 * 
 * @author anavarro - Dec 12, 2011
 * 
 */
public interface IPublisher
{

    /**
     * publishFullMsg.
     * 
     * @param subject
     * @param writeIntMapMsg
     * @return
     */
    boolean publishFullMsg(final String subject, final IWriteIntMapMsg writeIntMapMsg);
    
    /**
     * publishPartialMsg.
     * 
     * @param subject
     * @param writeIntMapMsg
     * @return
     */
    boolean publishPartialMsg(final String subject, final IWriteIntMapMsg writeIntMapMsg);
    
    /**
     * setStatus.
     * 
     * @param subject
     * @param status
     * @return
     */
    boolean setStatus(final String subject, final EStatus status);
    
    /**
     * start.
     * 
     * @return
     */
    boolean start();
    
    /**
     * stop.
     * 
     * @return
     */
    boolean stop();
    
    
    
}
