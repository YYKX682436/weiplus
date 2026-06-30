package com.tencent.thumbplayer.core.common;

/* loaded from: classes14.dex */
public class TPHeadsetPluginDetector {
    private static final int AUDIO_TYPE_BLUETOOTH_A2DP = 2;
    private static final int AUDIO_TYPE_BUILTIN_OTHERS = 99;
    private static final int AUDIO_TYPE_BUILTIN_SPEAKER = 0;
    private static final int AUDIO_TYPE_HEADPHONES = 1;
    private static final java.lang.String TAG = "TPHeadsetPluginDetector";
    private static boolean hasRegisterReceiver;
    private static boolean isInitted;
    private static java.lang.ref.WeakReference<android.content.Context> mContextRef;
    private static android.content.BroadcastReceiver mReceiver;
    private static java.util.List<com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.HeadsetPluginListener> listeners = new java.util.LinkedList();
    private static java.util.Set<java.lang.Integer> mCurOutputs = null;

    /* loaded from: classes14.dex */
    public interface HeadsetPluginListener {
        void onHeadsetPlugin(java.util.Set<java.lang.Integer> set, java.util.Set<java.lang.Integer> set2);
    }

    /* loaded from: classes14.dex */
    public static class HeadsetPluginReceiver extends android.content.BroadcastReceiver {
        private HeadsetPluginReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.TAG, "onReceive: " + intent.getAction());
            java.util.Set access$100 = com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.access$100();
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                int intExtra = intent.hasExtra("state") ? intent.getIntExtra("state", 0) : 0;
                if (access$100 != null) {
                    if (intExtra == 0) {
                        access$100.remove(1);
                    } else if (intExtra == 1) {
                        access$100.add(1);
                    }
                }
                com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.notifyAudioOutputStateChange(com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.mCurOutputs, access$100);
                return;
            }
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                if (access$100 != null) {
                    access$100.remove(1);
                }
                com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.notifyAudioOutputStateChange(com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.mCurOutputs, access$100);
            } else if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (access$100 != null) {
                    if (intExtra2 == 2) {
                        access$100.add(2);
                    } else if (intExtra2 == 0) {
                        access$100.remove(2);
                    }
                }
                com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.notifyAudioOutputStateChange(com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.mCurOutputs, access$100);
            }
        }
    }

    public static /* synthetic */ java.util.Set access$100() {
        return getAudioOutputs();
    }

    public static void addHeadsetPluginListener(com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.HeadsetPluginListener headsetPluginListener) {
        synchronized (com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.class) {
            if (listeners.add(headsetPluginListener) && !hasRegisterReceiver) {
                registerReceiver();
                hasRegisterReceiver = true;
            }
        }
    }

    public static void deinit() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        synchronized (com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.class) {
            if (isInitted && (weakReference = mContextRef) != null) {
                weakReference.clear();
                isInitted = false;
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "HeadsetPluginDetector deinit succeed!");
            }
        }
    }

    private static android.media.AudioManager getAudioManager() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (!isInitted || (weakReference = mContextRef) == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "getAudioManager failed, HeadsetPluginDetector is not init yet!");
            return null;
        }
        android.content.Context context = weakReference.get();
        if (context == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "getAudioManager failed, context is null, maybe is invalid!");
            return null;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) context.getApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            return audioManager;
        }
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "getAudioManager failed, audioMgr is null!");
        return null;
    }

    private static java.util.Set<java.lang.Integer> getAudioOutputs() {
        android.media.AudioDeviceInfo[] devices;
        java.util.HashSet hashSet = new java.util.HashSet();
        android.media.AudioManager audioManager = getAudioManager();
        if (audioManager != null && (devices = audioManager.getDevices(2)) != null) {
            for (android.media.AudioDeviceInfo audioDeviceInfo : devices) {
                if (audioDeviceInfo.getType() == 2) {
                    hashSet.add(0);
                } else if (audioDeviceInfo.getType() == 8) {
                    hashSet.add(2);
                } else if (audioDeviceInfo.getType() == 3) {
                    hashSet.add(1);
                }
            }
        }
        return hashSet;
    }

    public static java.util.Set<java.lang.Integer> getCurrentRoutes() {
        return mCurOutputs;
    }

    public static void init(android.content.Context context) {
        synchronized (com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.class) {
            if (isInitted) {
                return;
            }
            mContextRef = new java.lang.ref.WeakReference<>(context.getApplicationContext());
            isInitted = true;
            initCurrentOutputs();
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, TAG, "HeadsetPluginDetector init succeed!");
        }
    }

    private static void initCurrentOutputs() {
        mCurOutputs = getAudioOutputs();
    }

    public static boolean isAudioRouteTypeOn(int i17) {
        java.util.Set<java.lang.Integer> set = mCurOutputs;
        if (set == null) {
            return false;
        }
        return set.contains(java.lang.Integer.valueOf(i17));
    }

    public static boolean isBluetoothPlugin() {
        android.media.AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        return audioManager.isBluetoothA2dpOn();
    }

    public static boolean isHeadsetPlugin() {
        android.media.AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        return audioManager.isWiredHeadsetOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyAudioOutputStateChange(java.util.Set<java.lang.Integer> set, java.util.Set<java.lang.Integer> set2) {
        if (set == null || set2 == null || set.size() != set2.size() || !set2.containsAll(set)) {
            mCurOutputs = set2;
            synchronized (com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.class) {
                java.util.Iterator<com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.HeadsetPluginListener> it = listeners.iterator();
                while (it.hasNext()) {
                    it.next().onHeadsetPlugin(set, set2);
                }
            }
        }
    }

    private static boolean registerDeviceCallback() {
        android.media.AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            return false;
        }
        audioManager.registerAudioDeviceCallback(new android.media.AudioDeviceCallback() { // from class: com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.1
            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.TAG, "onAudioDevicesAdded!");
                com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.notifyAudioOutputStateChange(com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.mCurOutputs, com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.access$100());
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.TAG, "onAudioDevicesRemoved!");
                com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.notifyAudioOutputStateChange(com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.mCurOutputs, com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.access$100());
            }
        }, null);
        return true;
    }

    private static void registerReceiver() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (registerDeviceCallback()) {
            return;
        }
        if (mReceiver == null) {
            mReceiver = new com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.HeadsetPluginReceiver();
        }
        if (!isInitted || (weakReference = mContextRef) == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "registerReceiver failed, TPHeadsetPluginDetector is not init yet!");
            return;
        }
        android.content.Context context = weakReference.get();
        if (context == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "registerReceiver failed, context is null, maybe is invalid!");
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        context.registerReceiver(mReceiver, intentFilter);
    }

    public static void removeHeadsetPluginListener(com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.HeadsetPluginListener headsetPluginListener) {
        synchronized (com.tencent.thumbplayer.core.common.TPHeadsetPluginDetector.class) {
            listeners.remove(headsetPluginListener);
            if (listeners.isEmpty() && hasRegisterReceiver) {
                unregisterReceiver();
                hasRegisterReceiver = false;
            }
        }
    }

    private static void unregisterReceiver() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        if (!isInitted || (weakReference = mContextRef) == null) {
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, TAG, "registerReceiver failed, HeadsetPluginDetector is not init yet!");
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
