package org.fame.s;

/**
 * IRequester.
 * 
 * @author anavarro - Dec 15, 2011
 * 
 */
public interface IRequester
{
    
    
    /**
     * getSnapshot.
     * 
     * @param subject
     * @param msgListener
     * @return
     */
    boolean getSnapshot(final String subject, final IMsgListener msgListener);
    
    /**
     * requestCompute.
     * 
     * @param subject
     * @param param
     * @param msgListener
     * @return
     */
    //boolean requestCompute(final String subject, final IWriteIntMapMsg param, final IMsgListener msgListener);

}
