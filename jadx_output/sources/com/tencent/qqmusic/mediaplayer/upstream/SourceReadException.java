package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class SourceReadException extends java.lang.Exception {
    private final java.lang.String source;

    public SourceReadException(java.lang.String str, java.lang.String str2) {
        super(str);
        this.source = str2;
    }

    public java.lang.String getSource() {
        return this.source;
    }

    public SourceReadException(java.io.IOException iOException, java.lang.String str) {
        super(iOException);
        this.source = str;
    }
}
