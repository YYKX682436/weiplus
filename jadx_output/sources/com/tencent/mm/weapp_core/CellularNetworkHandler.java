package com.tencent.mm.weapp_core;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H\u0004J\t\u0010\t\u001a\u00020\u0005H\u0082 J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0082 J\u0019\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0082 J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\u0010\u001a\u00020\u0011H$J\b\u0010\u0012\u001a\u00020\u0007H$J\b\u0010\u0013\u001a\u00020\u0005H$J\b\u0010\u0014\u001a\u00020\u0011H\u0003J\b\u0010\u0015\u001a\u00020\u0007H\u0003J\b\u0010\u0016\u001a\u00020\u0005H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/weapp_core/CellularNetworkHandler;", "", "<init>", "()V", "nativePtr", "", "dispose", "", "finalize", "nativeInit", "nativeDispose", "Jc9VcBIjY", "networkHandle", "Jh0sy5Epe", "onNetworkAvailable", "onNetworkLost", "startMonitoring", "", "stopMonitoring", "getActiveCellularNetworkHandle", "startMonitoringJNI", "stopMonitoringJNI", "getActiveCellularNetworkHandleJNI", "weapp_core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CellularNetworkHandler {
    private long nativePtr;

    public CellularNetworkHandler() {
        long nativeInit = nativeInit();
        this.nativePtr = nativeInit;
        if (!(nativeInit != 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    private final native void Jc9VcBIjY(long nativePtr, long networkHandle);

    private final native void Jh0sy5Epe(long nativePtr, long networkHandle);

    private final long getActiveCellularNetworkHandleJNI() {
        return getActiveCellularNetworkHandle();
    }

    private final native void nativeDispose(long nativePtr);

    private final native long nativeInit();

    private final boolean startMonitoringJNI() {
        return startMonitoring();
    }

    private final void stopMonitoringJNI() {
        stopMonitoring();
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

    public abstract long getActiveCellularNetworkHandle();

    public final void onNetworkAvailable(long networkHandle) {
        Jc9VcBIjY(this.nativePtr, networkHandle);
    }

    public final void onNetworkLost(long networkHandle) {
        Jh0sy5Epe(this.nativePtr, networkHandle);
    }

    public abstract boolean startMonitoring();

    public abstract void stopMonitoring();
}
