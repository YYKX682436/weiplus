package com.tencent.mm.weapp_core;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0082 J\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0082 J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/weapp_core/FileDigestUtil;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JUpoCjCx7", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "Jq1dTu4Ar", "getFileCrc32", "getFileMD5", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FileDigestUtil {
    private long nativePtr;

    public FileDigestUtil() {
        long nativeInit = nativeInit();
        this.nativePtr = nativeInit;
        if (!(nativeInit != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    private final native java.lang.String JUpoCjCx7(long nativePtr, java.lang.String path);

    private final native java.lang.String Jq1dTu4Ar(long nativePtr, java.lang.String path);

    private final native void nativeDispose(long nativePtr);

    private final native long nativeInit();

    public final void dispose() {
        long j17 = this.nativePtr;
        if (j17 != 0) {
            nativeDispose(j17);
            this.nativePtr = 0L;
        }
    }

    public final void finalize() {
        dispose();
    }

    public final java.lang.String getFileCrc32(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return JUpoCjCx7(this.nativePtr, path);
    }

    public final java.lang.String getFileMD5(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return Jq1dTu4Ar(this.nativePtr, path);
    }
}
