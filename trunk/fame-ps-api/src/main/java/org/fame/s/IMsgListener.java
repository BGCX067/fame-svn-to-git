package org.fame.s;

import org.fame.EStatus;
import org.fame.z.map.intmap.IReadIntMapMsg;

/**
 * IMsgListener.
 * 
 * @author anavarro - Nov 28, 2011
 * 
 */
public interface IMsgListener
{

    /**
     * onMsg.
     * 
     * @param subject
     * @param readIntMapMsg
     * @return
     */
    boolean onMsg(final String subject, final IReadIntMapMsg readIntMapMsg);
    
    /**
     * onError.
     * 
     * @param subject
     * @return
     */
    boolean onError(final String subject, final String error);
    
    /**
     * onStatus.
     * 
     * @param subject
     * @param status
     * @return
     */
    boolean onStatus(final String subject, final EStatus status);
    
}
