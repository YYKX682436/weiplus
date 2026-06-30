package com.tencent.thumbplayer.core.common;

/* loaded from: classes14.dex */
public class TPHeadsetPluginCallbackToNative implements com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.HeadsetPluginListener {
    private static final java.lang.String TAG = "TPHeadsetPluginCallback";
    private long mNativeContext;

    private TPHeadsetPluginCallbackToNative(long j17) {
        this.mNativeContext = j17;
    }

    private native void _onAudioRouteChanged(java.util.Set<java.lang.Integer> set, java.util.Set<java.lang.Integer> set2);

    private long getNativeContext() {
        return this.mNativeContext;
    }

    private void registerCallback() {
        com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.addHeadsetPluginListener(this);
    }

    private void unregisterCallback() {
        com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.removeHeadsetPluginListener(this);
    }

    @Override // com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.HeadsetPluginListener
    public void onHeadsetPlugin(java.util.Set<java.lang.Integer> set, java.util.Set<java.lang.Integer> set2) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "onHeadsetPlugin: oldOutputs: " + set + ", newOutputs: " + set2);
        _onAudioRouteChanged(set, set2);
    }
}
