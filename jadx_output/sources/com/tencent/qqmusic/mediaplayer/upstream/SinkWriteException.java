package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class SinkWriteException extends java.lang.Exception {
    public SinkWriteException(java.lang.String str) {
        super(str);
    }

    public SinkWriteException(java.io.IOException iOException) {
        super(iOException);
    }
}
