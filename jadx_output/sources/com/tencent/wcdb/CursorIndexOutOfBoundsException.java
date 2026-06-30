package com.tencent.wcdb;

/* loaded from: classes12.dex */
public class CursorIndexOutOfBoundsException extends java.lang.IndexOutOfBoundsException {
    public CursorIndexOutOfBoundsException(int i17, int i18) {
        super("Index " + i17 + " requested, with a size of " + i18);
    }

    public CursorIndexOutOfBoundsException(java.lang.String str) {
        super(str);
    }
}
