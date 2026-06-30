package com.tencent.trtc.hardwareearmonitor.honor;

/* loaded from: classes16.dex */
public class HonorFeatureKitManager {
    private static final java.lang.String ENGINE_PACKAGE_NAME = "com.hihonor.android.magicx.media.audioengine";
    private static final int PACKAGE_INFO_FLAG = 0;
    private static final int SUB_VERSION_MASK = 1000;
    private static final java.lang.String TAG = "HnAudioEngine.FeatureKitManager";
    public static long mMinVersion;
    private static com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager sInstance;
    private com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioServiceCallback mCallBack = null;
    private static final java.lang.Object SET_CALL_BACK_LOCK = new java.lang.Object();
    private static final java.lang.Object NEW_FEATUREMANAGER_LOCK = new java.lang.Object();
    private static final java.lang.Object BIND_SERVICE_LOCK = new java.lang.Object();
    private static final java.lang.Object UNBIND_SERVICE_LOCK = new java.lang.Object();

    private HonorFeatureKitManager() {
    }

    public static com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager getInstance() {
        com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager honorFeatureKitManager;
        synchronized (NEW_FEATUREMANAGER_LOCK) {
            if (sInstance == null) {
                sInstance = new com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager();
            }
            honorFeatureKitManager = sInstance;
        }
        return honorFeatureKitManager;
    }

    public static boolean isAudioKitSupport(android.content.Context context) {
        if (context == null) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "context is null");
            return false;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager == null) {
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "packageManager is null");
                return false;
            }
            int i17 = packageManager.getPackageInfo(ENGINE_PACKAGE_NAME, 0).versionCode / 1000;
            long j17 = i17;
            if (j17 > 1000001) {
                j17 = 1000001;
            }
            mMinVersion = j17;
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, " isDeviceSupport is true, enginVersionCode=" + i17 + " audioKitVersionCode=1000001");
            return true;
        } catch (java.lang.Throwable unused) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "isAudioKitSupport ,NameNotFoundException");
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
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "bindService");
                context.bindService(intent, serviceConnection, 1);
            } catch (java.lang.Throwable th6) {
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "bindService, SecurityException, " + th6.getMessage());
            }
        }
    }

    public <T extends com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit> T createFeatureKit(int i17, android.content.Context context) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "createFeatureKit, type =".concat(java.lang.String.valueOf(i17)));
        if (context == null) {
            return null;
        }
        if (i17 == 1) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient honorEarReturnClient = new com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient(context);
            honorEarReturnClient.initialize(context);
            return honorEarReturnClient;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient honorAudioPlayClient = new com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient(context);
                honorAudioPlayClient.initialize(context);
                return honorAudioPlayClient;
            }
            if (i17 != 4) {
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "createFeatureKit, type error");
                return null;
            }
        }
        com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient honorAdvancedRecordClient = new com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient(context);
        honorAdvancedRecordClient.initialize(context);
        return honorAdvancedRecordClient;
    }

    public com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioServiceCallback getCallBack() {
        return this.mCallBack;
    }

    public void onCallBack(int i17) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "onCallBack, result =".concat(java.lang.String.valueOf(i17)));
        synchronized (SET_CALL_BACK_LOCK) {
            if (getCallBack() != null) {
                getCallBack().onResult(i17);
            }
        }
    }

    public void setCallBack(com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioServiceCallback iHonorAudioServiceCallback) {
        this.mCallBack = iHonorAudioServiceCallback;
    }

    public void unbindService(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "unbindService");
        synchronized (UNBIND_SERVICE_LOCK) {
            if (context != null) {
                context.unbindService(serviceConnection);
            }
        }
    }
}
