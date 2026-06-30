package com.tencent.mm.weapp_core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J!\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0082 JI\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0082 J\u0011\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0011\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0016\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J>\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010\u001b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/weapp_core/WsBinding;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JkIGCTkH2", "isolatePtr", "contextPtr", "Jor0AJJ2F", "ua", "", "verifyUserCa", "", "uvPtr", "skipDomainCheck", "referUrl", "JdyOtdkm2", "JSIuwO5FM", "tempInit", "create", "suspend", "destroy", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WsBinding {
    private long nativePtr;

    public WsBinding() {
        long nativeInit = nativeInit();
        this.nativePtr = nativeInit;
        if (!(nativeInit != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    private final native void JSIuwO5FM(long nativePtr);

    private final native void JdyOtdkm2(long nativePtr);

    private final native void JkIGCTkH2(long nativePtr, long isolatePtr, long contextPtr);

    private final native void Jor0AJJ2F(long nativePtr, java.lang.String ua6, boolean verifyUserCa, long uvPtr, boolean skipDomainCheck, java.lang.String referUrl, long isolatePtr, long contextPtr);

    private final native void nativeDispose(long nativePtr);

    private final native long nativeInit();

    public final void create(java.lang.String ua6, boolean verifyUserCa, long uvPtr, boolean skipDomainCheck, java.lang.String referUrl, long isolatePtr, long contextPtr) {
        kotlin.jvm.internal.o.g(ua6, "ua");
        kotlin.jvm.internal.o.g(referUrl, "referUrl");
        Jor0AJJ2F(this.nativePtr, ua6, verifyUserCa, uvPtr, skipDomainCheck, referUrl, isolatePtr, contextPtr);
    }

    public final void destroy() {
        JSIuwO5FM(this.nativePtr);
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

    public final void suspend() {
        JdyOtdkm2(this.nativePtr);
    }

    public final void tempInit(long isolatePtr, long contextPtr) {
        JkIGCTkH2(this.nativePtr, isolatePtr, contextPtr);
    }
}
