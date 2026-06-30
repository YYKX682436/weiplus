package com.tencent.thumbplayer.core.drm;

/* loaded from: classes13.dex */
public final class TPDrmInterruptCallbackProxy implements com.tencent.thumbplayer.core.drm.ITPDrmInterruptCallback {
    private long mNativeContext;

    private TPDrmInterruptCallbackProxy() {
    }

    private native boolean native_isInterrupted();

    @Override // com.tencent.thumbplayer.core.drm.ITPDrmInterruptCallback
    public boolean isInterrupted() {
        try {
            return native_isInterrupted();
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, th6.getMessage());
            return false;
        }
    }
}
