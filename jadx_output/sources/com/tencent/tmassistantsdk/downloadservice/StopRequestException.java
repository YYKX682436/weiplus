package com.tencent.tmassistantsdk.downloadservice;

/* loaded from: classes13.dex */
public class StopRequestException extends java.lang.Exception {
    protected static final long serialVersionUID = 1;
    public final int mFinalErrCode;

    public StopRequestException(int i17, java.lang.String str) {
        super(str);
        this.mFinalErrCode = i17;
    }

    public StopRequestException(int i17, java.lang.Throwable th6) {
        super(th6);
        this.mFinalErrCode = i17;
    }
}
