package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class DataSourceException extends java.lang.Exception {
    private final int errorCode;

    public DataSourceException(int i17, java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
        this.errorCode = i17;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "DataSourceException{errorCode=" + this.errorCode + "\nmessage=" + getMessage() + '}';
    }
}
