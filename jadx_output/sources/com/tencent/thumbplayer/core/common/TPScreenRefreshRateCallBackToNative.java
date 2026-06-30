package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public class TPScreenRefreshRateCallBackToNative implements com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener {
    private static final java.lang.String TAG = "TPScreenRefreshRateCallBack";
    private long mNativeContext;

    private TPScreenRefreshRateCallBackToNative(long j17) {
        this.mNativeContext = j17;
    }

    private native void _onScreenRefreshRateChanged(float f17);

    private long getNativeContext() {
        return this.mNativeContext;
    }

    private void registerCallback() {
        com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.addListener(this);
    }

    private void unregisterCallback() {
        com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.removeListener(this);
    }

    @Override // com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.ScreenRefreshRateChangedListener
    public void onScreenRefreshRateChanged(float f17) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "onScreenRefreshRateChanged refreshRate:" + f17);
        _onScreenRefreshRateChanged(f17);
    }
}
