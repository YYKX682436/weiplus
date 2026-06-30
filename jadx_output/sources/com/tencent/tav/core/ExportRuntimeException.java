package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class ExportRuntimeException extends java.lang.RuntimeException {
    private final com.tencent.tav.core.ExportErrorStatus errorStatus;

    public ExportRuntimeException(int i17, java.lang.Throwable th6) {
        this(new com.tencent.tav.core.ExportErrorStatus(i17, th6));
    }

    public com.tencent.tav.core.ExportErrorStatus getErrorStatus() {
        return this.errorStatus;
    }

    public ExportRuntimeException(int i17, java.lang.String str) {
        super(str);
        this.errorStatus = new com.tencent.tav.core.ExportErrorStatus(i17);
    }

    public ExportRuntimeException(com.tencent.tav.core.ExportErrorStatus exportErrorStatus) {
        super(exportErrorStatus.throwable);
        this.errorStatus = exportErrorStatus;
    }
}
