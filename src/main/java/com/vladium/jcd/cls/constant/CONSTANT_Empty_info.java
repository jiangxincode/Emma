package com.vladium.jcd.cls.constant;

import java.io.IOException;

import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;

public class CONSTANT_Empty_info extends CONSTANT_literal_info {
	// public: ................................................................

    public static final byte TAG = 0;
    
    public double m_value;
    
    
    public CONSTANT_Empty_info (final double value)
    {
        m_value = value;    
    }

    public final byte tag ()
    {
        return TAG;
    }
        
    public Object accept (final ICONSTANTVisitor visitor, final Object ctx)
    {
        return visitor.visit (this, ctx);
    }
    
    public String toString ()
    {
        return Double.toString (m_value);
    }
    
    /**
     * Overrides the default implementation to return '2'.
     */
    public int width ()
    {
        return 2;
    }    
    
    public void writeInClassFormat (final UDataOutputStream out) throws IOException
    {
        super.writeInClassFormat (out);
        
        out.writeDouble (m_value);
    }
   
    
    protected CONSTANT_Empty_info (final UDataInputStream bytes) throws IOException
    {
        m_value = bytes.readDouble ();    
    }
}
