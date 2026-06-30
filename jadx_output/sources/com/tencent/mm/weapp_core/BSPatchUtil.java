package com.tencent.mm.weapp_core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J)\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0082 J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/weapp_core/BSPatchUtil;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JylAyjKr0", "", "oldFile", "", "patchFile", "newFile", "bspatch", "Lcom/tencent/mm/weapp_core/BSPatchResult;", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BSPatchUtil {
    private long nativePtr;

    public BSPatchUtil() {
        long nativeInit = nativeInit();
        this.nativePtr = nativeInit;
        if (!(nativeInit != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    private final native byte[] JylAyjKr0(long nativePtr, java.lang.String oldFile, java.lang.String patchFile, java.lang.String newFile);

    private final native void nativeDispose(long nativePtr);

    private final native long nativeInit();

    public final vp5.b bspatch(java.lang.String oldFile, java.lang.String patchFile, java.lang.String newFile) {
        kotlin.jvm.internal.o.g(oldFile, "oldFile");
        kotlin.jvm.internal.o.g(patchFile, "patchFile");
        kotlin.jvm.internal.o.g(newFile, "newFile");
        byte[] bytes = JylAyjKr0(this.nativePtr, oldFile, patchFile, newFile);
        vp5.b.f439087e.getClass();
        kotlin.jvm.internal.o.g(bytes, "bytes");
        f56.h hVar = f56.i.f259811c;
        hVar.getClass();
        int c17 = new f56.n(new org.msgpack.core.buffer.a(bytes), hVar).c();
        java.util.Iterator it = ((kz5.h) vp5.b.f439089g).iterator();
        while (it.hasNext()) {
            vp5.b bVar = (vp5.b) it.next();
            if (bVar.f439090d == c17) {
                return bVar;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

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
}
