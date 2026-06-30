package com.tencent.trtc.hardwareearmonitor.daisy;

/* loaded from: classes16.dex */
public class DaisyFeatureKitManager {
    private static final java.lang.String ENGINE_PACKAGE_NAME = "com.huawei.multimedia.audioengine";
    private static final int PACKAGE_INFO_FLAG = 0;
    private static final java.lang.String TAG = "DaisyAudioKit.DaisyFeatureKitManager";
    private static com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager sInstance;
    private com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKitCallback mCallBack = null;
    private static final java.lang.Object SET_CALL_BACK_LOCK = new java.lang.Object();
    private static final java.lang.Object NEW_FEATUREMANAGER_LOCK = new java.lang.Object();
    private static final java.lang.Object BIND_SERVICE_LOCK = new java.lang.Object();
    private static final java.lang.Object UNBIND_SERVICE_LOCK = new java.lang.Object();

    public static com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager getInstance() {
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager daisyFeatureKitManager;
        synchronized (NEW_FEATUREMANAGER_LOCK) {
            if (sInstance == null) {
                sInstance = new com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager();
            }
            daisyFeatureKitManager = sInstance;
        }
        return daisyFeatureKitManager;
    }

    public static boolean isAudioKitSupport(android.content.Context context) {
        if (context == null) {
            return false;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return true;
        }
        try {
            return packageManager.getPackageInfo(ENGINE_PACKAGE_NAME, 0) != null;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "isAudioKitSupport ,NameNotFoundException");
            return false;
        }
    }

    public void bindService(android.content.Context context, android.content.ServiceConnection serviceConnection, java.lang.String str) {
        synchronized (BIND_SERVICE_LOCK) {
            if (context == null) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(ENGINE_PACKAGE_NAME, str);
            try {
                context.bindService(intent, serviceConnection, 1);
            } catch (java.lang.SecurityException e17) {
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "bindService, SecurityException, %s", e17.getMessage());
            }
        }
    }

    public <T extends com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioFeaturesKit> T createFeatureKit(int i17, android.content.Context context) {
        if (context == null || i17 != 1) {
            return null;
        }
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = new com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit(context);
        daisyAudioKaraokeFeatureKit.initialize(context);
        return daisyAudioKaraokeFeatureKit;
    }

    public com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKitCallback getCallBack() {
        return this.mCallBack;
    }

    public void onCallBack(int i17) {
        synchronized (SET_CALL_BACK_LOCK) {
            if (getCallBack() != null) {
                getCallBack().onResult(i17);
            }
        }
    }

    public void setCallBack(com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKitCallback iDaisyAudioKitCallback) {
        this.mCallBack = iDaisyAudioKitCallback;
    }

    public void unbindService(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        synchronized (UNBIND_SERVICE_LOCK) {
            if (context != null) {
                context.unbindService(serviceConnection);
            }
        }
    }
}
