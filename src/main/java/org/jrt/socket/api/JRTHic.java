/**
 * Written by Fedor Burdun of Azul Systems, and released to the public domain,
 * as explained at http://creativecommons.org/publicdomain/zero/1.0/
 *
 * @author Fedor Burdun
 */
package org.jrt.socket.api;

public class JRTHic {
    public long i2oLatency;
    public long i2oReadTime;
    public long i2oWriteTime;
    public boolean i2oLastRead;
    
    public long o2iLatency;
    public long o2iReadTime;
    public long o2iWriteTime;
    public boolean o2iLastWrite;
}
