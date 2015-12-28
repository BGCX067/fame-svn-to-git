package org.fame.s;


/**
 * ISubscriber.
 * 
 * @author anavarro - Nov 28, 2011
 * 
 */
public interface ISubscriber
{

    /**
     * subscribe.
     * 
     * @param subject
     * @param msgListener
     * @return
     */
    boolean subscribe(final String subject, final IMsgListener msgListener);
    
    /**
     * unsubscribe.
     * 
     * @param subject
     * @param msgListener
     * @return
     */
    boolean unsubscribe(final String subject, final IMsgListener msgListener);
    
    
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
