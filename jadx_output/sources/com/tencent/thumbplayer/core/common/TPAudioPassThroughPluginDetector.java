package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public class TPAudioPassThroughPluginDetector {
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final java.lang.String TAG = "TPAudioPassThroughPluginDetector";
    private static boolean hasRegisterReceiver;
    private static boolean isInitted;
    private static java.lang.ref.WeakReference<android.content.Context> mContextRef;
    private static android.os.Handler mHandler;
    private static android.content.BroadcastReceiver mReceiver;
    private static java.util.List<com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener> listeners = new java.util.LinkedList();
    private static boolean mIsAudioPassThroughPlugin = false;
    private static com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities mAudioPassThroughCapabilities = null;

    /* loaded from: classes13.dex */
    public interface AudioPassThroughPluginListener {
        void onAudioPassThroughPlugin(boolean z17);
    }

    /* loaded from: classes13.dex */
    public static class HdmiAudioPlugBroadcastReceiver extends android.content.BroadcastReceiver {
        private HdmiAudioPlugBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.TAG, "HdmiAudioPlugBroadcastReceiver onReceive: " + intent.getAction());
            boolean z17 = false;
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0);
            if (intExtra != 0 && intExtra == 1) {
                z17 = true;
            }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.TAG, "HdmiAudioPlugBroadcastReceiver audioPassThroughState:" + intExtra + " bPlugin:" + z17);
            com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.onUpdateAudioCapabilities(new com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)));
            com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.notifyAudioPassThroughStateChange(z17);
        }
    }

    public static void addListener(com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener audioPassThroughPluginListener) {
        synchronized (com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.class) {
            if (listeners.add(audioPassThroughPluginListener) && !hasRegisterReceiver) {
                registerReceiver();
                hasRegisterReceiver = true;
            }
        }
    }

    public static void deinit() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        synchronized (com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.class) {
            if (isInitted && (weakReference = mContextRef) != null) {
                weakReference.clear();
                isInitted = false;
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "TPAudioPassThroughPluginDetector deinit succeed!");
            }
        }
    }

    private static android.os.Looper getLooper() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null ? myLooper : android.os.Looper.getMainLooper();
    }

    public static void init(android.content.Context context) {
        synchronized (com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.class) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "TPAudioPassThroughPluginDetector init enter!");
            if (isInitted) {
                return;
            }
            mContextRef = new java.lang.ref.WeakReference<>(context.getApplicationContext());
            isInitted = true;
            mHandler = new android.os.Handler(getLooper());
            registerReceiver();
            hasRegisterReceiver = true;
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "TPAudioPassThroughPluginDetector init succeed!");
        }
    }

    public static boolean isAudioPassThroughPlugin() {
        boolean z17;
        synchronized (com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.class) {
            z17 = mIsAudioPassThroughPlugin;
        }
        return z17;
    }

    public static boolean isAudioPassThroughSupport(int i17, int i18) {
        com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities tPAudioPassThroughCapabilities = mAudioPassThroughCapabilities;
        if (tPAudioPassThroughCapabilities != null) {
            return tPAudioPassThroughCapabilities.supportsEncoding(i17) && i18 <= mAudioPassThroughCapabilities.getMaxChannelCount();
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "isAudioPassThroughSupport failed, mAudioPassThroughCapabilities is not init yet!");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyAudioPassThroughStateChange(boolean z17) {
        if (mIsAudioPassThroughPlugin != z17) {
            mIsAudioPassThroughPlugin = z17;
            synchronized (com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.class) {
                java.util.Iterator<com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener> it = listeners.iterator();
                while (it.hasNext()) {
                    it.next().onAudioPassThroughPlugin(z17);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onUpdateAudioCapabilities(com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities tPAudioPassThroughCapabilities) {
        if (tPAudioPassThroughCapabilities.equals(mAudioPassThroughCapabilities)) {
            return;
        }
        mAudioPassThroughCapabilities = tPAudioPassThroughCapabilities;
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "onUpdateAudioCapabilities AudioCapabilities:" + mAudioPassThroughCapabilities.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void registerReceiver() {
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "registerReceiver enter");
        if (!isInitted || mContextRef == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "registerReceiver failed, TPAudioPassThroughPluginDetector is not init yet!");
            return;
        }
        android.content.Intent intent = null;
        java.lang.Object[] objArr = 0;
        if (mReceiver == null) {
            mReceiver = new com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.HdmiAudioPlugBroadcastReceiver();
        }
        android.content.Context context = mContextRef.get();
        if (context == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
            return;
        }
        if (mReceiver != null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.media.action.HDMI_AUDIO_PLUG");
            intent = context.registerReceiver(mReceiver, intentFilter, null, mHandler);
        }
        mAudioPassThroughCapabilities = com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities.getCapabilities(context, intent);
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "registerReceiver leave");
    }

    public static void removeListener(com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener audioPassThroughPluginListener) {
        synchronized (com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector.class) {
            listeners.remove(audioPassThroughPluginListener);
            if (listeners.isEmpty() && hasRegisterReceiver) {
                unregisterReceiver();
                hasRegisterReceiver = false;
            }
        }
    }

    private static void unregisterReceiver() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (!isInitted || (weakReference = mContextRef) == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "registerReceiver failed, TPAudioPassThroughPluginDetector is not init yet!");
            return;
        }
        android.content.Context context = weakReference.get();
        if (context == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
        } else {
            context.unregisterReceiver(mReceiver);
        }
    }
}
