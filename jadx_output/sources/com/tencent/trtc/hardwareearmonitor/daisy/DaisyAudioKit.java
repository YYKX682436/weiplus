package com.tencent.trtc.hardwareearmonitor.daisy;

/* loaded from: classes16.dex */
public class DaisyAudioKit {
    private static final java.util.List<java.lang.Integer> DEFAULT_FEATURE_LIST = new java.util.ArrayList(0);
    private static final java.lang.String ENGINE_CLASS_NAME = "com.huawei.multimedia.audioengine.HwAudioEngineService";
    private static final java.lang.String TAG = "DaisyAudioKit.DaisyAudioKit";
    private android.content.Context mContext;
    private com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager mFeatureKitManager;
    private com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine mIHwAudioEngine = null;
    private boolean mIsServiceConnected = false;
    private android.os.IBinder mService = null;
    private android.content.ServiceConnection mConnection = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mIHwAudioEngine = com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine.Stub.asInterface(iBinder);
            if (com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mIHwAudioEngine != null) {
                com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mIsServiceConnected = true;
                com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mFeatureKitManager.onCallBack(0);
                com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit daisyAudioKit = com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this;
                daisyAudioKit.serviceInit(daisyAudioKit.mContext.getPackageName(), "1.0.1");
                com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.serviceLinkToDeath(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mIHwAudioEngine = null;
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mIsServiceConnected = false;
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mFeatureKitManager.onCallBack(4);
        }
    };
    private android.os.IBinder.DeathRecipient mDeathRecipient = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mService.unlinkToDeath(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mDeathRecipient, 0);
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mFeatureKitManager.onCallBack(6);
            com.tencent.liteav.base.util.LiteavLog.e(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.TAG, "service binder died");
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.this.mService = null;
        }
    };

    /* loaded from: classes6.dex */
    public enum FeatureType {
        HWAUDIO_FEATURE_KARAOKE(1);

        private int mFeatureType;

        FeatureType(int i17) {
            this.mFeatureType = i17;
        }

        public final int getFeatureType() {
            return this.mFeatureType;
        }
    }

    public DaisyAudioKit(android.content.Context context, com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKitCallback iDaisyAudioKitCallback) {
        this.mContext = null;
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager daisyFeatureKitManager = com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager.getInstance();
        this.mFeatureKitManager = daisyFeatureKitManager;
        daisyFeatureKitManager.setCallBack(iDaisyAudioKitCallback);
        this.mContext = context;
    }

    private void bindService(android.content.Context context) {
        try {
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager daisyFeatureKitManager = this.mFeatureKitManager;
            if (daisyFeatureKitManager == null || this.mIsServiceConnected) {
                return;
            }
            daisyFeatureKitManager.bindService(context, this.mConnection, ENGINE_CLASS_NAME);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "bindService,RemoteException ex : %s", th6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(java.lang.String str, java.lang.String str2) {
        try {
            com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine iDaisyAudioEngine = this.mIHwAudioEngine;
            if (iDaisyAudioEngine == null || !this.mIsServiceConnected) {
                return;
            }
            iDaisyAudioEngine.init(str, str2);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "isFeatureSupported,RemoteException ex : %s", th6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(android.os.IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (java.lang.Throwable unused) {
                this.mFeatureKitManager.onCallBack(5);
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    public <T extends com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioFeaturesKit> T createFeature(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.FeatureType featureType) {
        com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager daisyFeatureKitManager = this.mFeatureKitManager;
        if (daisyFeatureKitManager == null || featureType == null) {
            return null;
        }
        return (T) daisyFeatureKitManager.createFeatureKit(featureType.getFeatureType(), this.mContext);
    }

    public void destroy() {
        try {
            if (this.mIsServiceConnected) {
                this.mIsServiceConnected = false;
                this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "unbindService,RemoteException ex : %s", th6.getMessage());
        }
    }

    public java.util.List<java.lang.Integer> getSupportedFeatures() {
        try {
            com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine iDaisyAudioEngine = this.mIHwAudioEngine;
            if (iDaisyAudioEngine != null && this.mIsServiceConnected) {
                return iDaisyAudioEngine.getSupportedFeatures();
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "getSupportedFeatures, createFeature,wait bind service fail");
        }
        return DEFAULT_FEATURE_LIST;
    }

    public void initialize() {
        android.content.Context context = this.mContext;
        if (context == null) {
            this.mFeatureKitManager.onCallBack(7);
        } else if (com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager.isAudioKitSupport(context)) {
            bindService(this.mContext);
        } else {
            this.mFeatureKitManager.onCallBack(2);
        }
    }

    public boolean isFeatureSupported(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKit.FeatureType featureType) {
        if (featureType == null) {
            return false;
        }
        try {
            com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine iDaisyAudioEngine = this.mIHwAudioEngine;
            if (iDaisyAudioEngine != null && this.mIsServiceConnected) {
                return iDaisyAudioEngine.isFeatureSupported(featureType.getFeatureType());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "isFeatureSupported,RemoteException ex : %s", th6.getMessage());
        }
        return false;
    }
}
