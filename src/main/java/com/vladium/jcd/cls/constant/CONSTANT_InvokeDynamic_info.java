package com.vladium.jcd.cls.constant;

import java.io.IOException;

import com.vladium.jcd.cls.ClassDef;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.jcd.lib.UDataOutputStream;

public class CONSTANT_InvokeDynamic_info extends CONSTANT_info {

    public static final byte TAG = 18;

    public int m_name_index;

    public CONSTANT_InvokeDynamic_info(final int name_index) {
        m_name_index = name_index;
    }

    public final byte tag() {
        return TAG;
    }

    public String getName(final ClassDef cls) {
        return ((CONSTANT_Utf8_info) cls.getConstants().get(m_name_index)).m_value;
    }

    public Object accept(final ICONSTANTVisitor visitor, final Object ctx) {
        return visitor.visit(this, ctx);
    }

    public String toString() {
        return "CONSTANT_Class: [name_index = " + m_name_index + ']';
    }

    public void writeInClassFormat(final UDataOutputStream out) throws IOException {
        super.writeInClassFormat(out);

        out.writeU2(m_name_index);
    }

    protected CONSTANT_InvokeDynamic_info(final UDataInputStream bytes) throws IOException {
        m_name_index = bytes.readU2();
    }
}
