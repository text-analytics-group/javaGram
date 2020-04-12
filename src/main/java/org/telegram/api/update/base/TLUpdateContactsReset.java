package org.telegram.api.update.base;

import org.telegram.api._primitives.TLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * All contacts were deleted
 * updateContactsReset#7084a7be = Update;
 */
public class TLUpdateContactsReset extends TLAbsUpdate {

    /**
     * The constant CLASS_ID.
     */
    public static final int CLASS_ID = 0x7084a7be;

    public TLUpdateContactsReset() {
        super();
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
    }

    @Override
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
    }

    @Override
    public String toString() {
        return "updateContactsReset#7084a7be";
    }

}