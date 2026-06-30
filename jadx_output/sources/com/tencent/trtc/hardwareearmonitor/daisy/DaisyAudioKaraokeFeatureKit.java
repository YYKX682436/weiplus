package com.tencent.trtc.hardwareearmonitor.daisy;

/* loaded from: classes16.dex */
public class DaisyAudioKaraokeFeatureKit extends com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioFeaturesKit {
    private static final java.lang.String ENGINE_CLASS_NAME = "com.huawei.multimedia.audioengine.HwAudioKaraokeFeatureService";
    private static final java.lang.String TAG = "DaisyAudioKit.DaisyAudioKaraokeFeatureKit";
    private android.content.Context mContext;
    private com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager mFeatureKitManager;
    private com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature mIHwAudioKaraokeFeatureAidl;
    private boolean mIsServiceConnected = false;
    private android.os.IBinder mService = null;
    private android.content.ServiceConnection mConnection = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mIHwAudioKaraokeFeatureAidl = com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature.Stub.asInterface(iBinder);
            if (com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mIHwAudioKaraokeFeatureAidl != null) {
                com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mIsServiceConnected = true;
                com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this;
                if (!daisyAudioKaraokeFeatureKit.serviceInit(daisyAudioKaraokeFeatureKit.mContext.getPackageName())) {
                    com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1002);
                } else {
                    com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1000);
                    com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.serviceLinkToDeath(iBinder);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mIsServiceConnected = false;
            if (com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mFeatureKitManager != null) {
                com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1001);
            }
        }
    };
    private android.os.IBinder.DeathRecipient mDeathRecipient = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.tencent.liteav.base.util.LiteavLog.e(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.TAG, "binderDied");
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mService.unlinkToDeath(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mDeathRecipient, 0);
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mFeatureKitManager.onCallBack(1003);
            com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.this.mService = null;
        }
    };

    /* loaded from: classes16.dex */
    public enum ParameName {
        CMD_SET_AUDIO_EFFECT_MODE_BASE("Karaoke_reverb_mode="),
        CMD_SET_VOCAL_VOLUME_BASE("Karaoke_volume="),
        CMD_SET_VOCAL_EQUALIZER_MODE("Karaoke_eq_mode=");

        private java.lang.String mParameName;

        ParameName(java.lang.String str) {
            this.mParameName = str;
        }

        public final java.lang.String getParameName() {
            return this.mParameName;
        }
    }

    public DaisyAudioKaraokeFeatureKit(android.content.Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager.getInstance();
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
    public boolean serviceInit(java.lang.String str) {
        try {
            com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature iDaisyAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iDaisyAudioKaraokeFeature != null && this.mIsServiceConnected) {
                iDaisyAudioKaraokeFeature.init(str);
            }
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "isFeatureSupported,RemoteException ex : %s", th6.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(android.os.IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (java.lang.Throwable unused) {
                this.mFeatureKitManager.onCallBack(1002);
                com.tencent.liteav.base.util.LiteavLog.e(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
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

    public int enableKaraokeFeature(boolean z17) {
        try {
            com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature iDaisyAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iDaisyAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iDaisyAudioKaraokeFeature.enableKaraokeFeature(z17);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "enableKaraokeFeature,RemoteException ex : %s", th6.getMessage());
            return -2;
        }
    }

    public int getKaraokeLatency() {
        try {
            com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature iDaisyAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iDaisyAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return -1;
            }
            return iDaisyAudioKaraokeFeature.getKaraokeLatency();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "getKaraokeLatency,RemoteException ex : %s", th6.getMessage());
            return -1;
        }
    }

    public void initialize(android.content.Context context) {
        if (context == null) {
            return;
        }
        if (com.tencent.trtc.hardwareearmonitor.daisy.DaisyFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
        }
    }

    public boolean isKaraokeFeatureSupport() {
        try {
            com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature iDaisyAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iDaisyAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return false;
            }
            return iDaisyAudioKaraokeFeature.isKaraokeFeatureSupport();
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "isFeatureSupported,RemoteException ex : %s", th6.getMessage());
            return false;
        }
    }

    public int setParameter(com.tencent.trtc.hardwareearmonitor.daisy.DaisyAudioKaraokeFeatureKit.ParameName parameName, int i17) {
        if (parameName == null) {
            return 1807;
        }
        try {
            com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature iDaisyAudioKaraokeFeature = this.mIHwAudioKaraokeFeatureAidl;
            if (iDaisyAudioKaraokeFeature == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iDaisyAudioKaraokeFeature.setParameter(parameName.getParameName(), i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "setParameter,RemoteException ex : %s", th6.getMessage());
            return -2;
        }
    }
}
