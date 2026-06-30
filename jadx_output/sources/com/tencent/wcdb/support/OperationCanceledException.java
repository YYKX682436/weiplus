package com.tencent.wcdb.support;

/* loaded from: classes12.dex */
public class OperationCanceledException extends java.lang.RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(java.lang.String str) {
        super(str == null ? "The operation has been canceled." : str);
    }
}
