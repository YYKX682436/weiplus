package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public class TPAudioPassThroughPluginCallbackToNative implements com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener {
    private static final java.lang.String TAG = "TPAudioPassThroughPluginCallback";
    private long mNativeContext;

    private TPAudioPassThroughPluginCallbackToNative(long j17) {
        this.mNativeContext = j17;
    }

    private native void _onAudioPassThroughStateChanged(boolean z17);

    private long getNativeContext() {
        return this.mNativeContext;
    }

    private void registerCallback() {
        com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.addListener(this);
    }

    private void unregisterCallback() {
        com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.removeListener(this);
    }

    @Override // com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener
    public void onAudioPassThroughPlugin(boolean z17) {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "onAudioPassThroughPlugin bPlugin:" + z17);
        _onAudioPassThroughStateChanged(z17);
    }
}
