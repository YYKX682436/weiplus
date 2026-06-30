package com.tencent.mm.weapp_core;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0011\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007J\b\u0010\u000f\u001a\u00020\u0007H$J\b\u0010\u0010\u001a\u00020\u0007H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/weapp_core/InitLoader;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "JflbHvBHq", "JDXmEv1LV", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "initMainThreadLoop", "initOnMainThread", "initOnMainThreadJNI", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class InitLoader {
    private long nativePtr;

    public InitLoader() {
        long nativeInit = nativeInit();
        this.nativePtr = nativeInit;
        if (!(nativeInit != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    private final native void JDXmEv1LV(long nativePtr);

    private final native void JflbHvBHq(long nativePtr);

    private final void initOnMainThreadJNI() {
        initOnMainThread();
    }

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

    public final void init() {
        JflbHvBHq(this.nativePtr);
    }

    public final void initMainThreadLoop() {
        JDXmEv1LV(this.nativePtr);
    }

    public abstract void initOnMainThread();
}
