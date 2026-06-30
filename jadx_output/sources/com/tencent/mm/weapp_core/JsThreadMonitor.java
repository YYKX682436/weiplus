package com.tencent.mm.weapp_core;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0082 J!\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0019\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0082 J\u0019\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u0019\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0082 J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0005H$J \u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0005H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/weapp_core/JsThreadMonitor;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JJXUAJ0Uu", "thresholdMs", "JmWHH3tPG", "isolatePtr", "appId", "", "J8utqEtkL", "JKUP5EPwE", "JKMVCBCHk", "start", "attachIsolate", "detachIsolate", "setAppForeground", "setAppBackground", "onHangDetected", "stackJson", "durationUs", "onHangDetectedJNI", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class JsThreadMonitor {
    private long nativePtr;

    public JsThreadMonitor() {
        long nativeInit = nativeInit();
        this.nativePtr = nativeInit;
        if (!(nativeInit != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    private final native void J8utqEtkL(long nativePtr, long isolatePtr);

    private final native void JJXUAJ0Uu(long nativePtr, long thresholdMs);

    private final native void JKMVCBCHk(long nativePtr, java.lang.String appId);

    private final native void JKUP5EPwE(long nativePtr, java.lang.String appId);

    private final native void JmWHH3tPG(long nativePtr, long isolatePtr, java.lang.String appId);

    private final native void nativeDispose(long nativePtr);

    private final native long nativeInit();

    private final void onHangDetectedJNI(java.lang.String appId, java.lang.String stackJson, long durationUs) {
        onHangDetected(appId, stackJson, durationUs);
    }

    public final void attachIsolate(long isolatePtr, java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        JmWHH3tPG(this.nativePtr, isolatePtr, appId);
    }

    public final void detachIsolate(long isolatePtr) {
        J8utqEtkL(this.nativePtr, isolatePtr);
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

    public abstract void onHangDetected(java.lang.String appId, java.lang.String stackJson, long durationUs);

    public final void setAppBackground(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        JKMVCBCHk(this.nativePtr, appId);
    }

    public final void setAppForeground(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        JKUP5EPwE(this.nativePtr, appId);
    }

    public final void start(long thresholdMs) {
        JJXUAJ0Uu(this.nativePtr, thresholdMs);
    }
}
