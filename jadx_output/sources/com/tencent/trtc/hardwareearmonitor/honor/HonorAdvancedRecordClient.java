package com.tencent.trtc.hardwareearmonitor.honor;

/* loaded from: classes16.dex */
public class HonorAdvancedRecordClient extends com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit {
    private static final java.lang.String ENGINE_CLASS_NAME = "com.hihonor.android.magicx.media.audioengine.HnAdvancedRecordServiceImpl";
    private static final java.lang.String TAG = "HnAudioService.HnAdvancedRecordClient";
    private android.content.Context mContext;
    private com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager mFeatureKitManager;
    private boolean mIsServiceConnected = false;
    private com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService mHnAdvancedRecordService = null;
    private android.os.IBinder mService = null;
    private final android.os.IBinder mClientBinder = new android.os.Binder();
    private android.content.ServiceConnection mConnection = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mHnAdvancedRecordService = com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService.Stub.asInterface(iBinder);
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.TAG, "HnAdvancedRecordClient onServiceConnected");
            if (com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mHnAdvancedRecordService != null) {
                com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mIsServiceConnected = true;
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.TAG, "HnAdvancedRecordClient onServiceConnected, mIHnAdvancedRecordService is not null");
                com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mFeatureKitManager.onCallBack(2000);
                com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient honorAdvancedRecordClient = com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this;
                honorAdvancedRecordClient.serviceInit(honorAdvancedRecordClient.mContext.getPackageName());
                com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.serviceLinkToDeath(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.TAG, "HnAdvancedRecordClient onServiceDisconnected");
            com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mHnAdvancedRecordService = null;
            com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mIsServiceConnected = false;
            com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mFeatureKitManager.onCallBack(2001);
        }
    };
    private android.os.IBinder.DeathRecipient mDeathRecipient = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mService.unlinkToDeath(com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mDeathRecipient, 0);
            com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mFeatureKitManager.onCallBack(6);
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.TAG, "service binder died");
            com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.this.mService = null;
        }
    };

    /* loaded from: classes6.dex */
    public enum DenoiseLevel {
        DENOISE_DEFAULT_LEVEL(1);

        private final int mDenoiseLevel;

        DenoiseLevel(int i17) {
            this.mDenoiseLevel = i17;
        }

        public final int getLevel() {
            return this.mDenoiseLevel;
        }
    }

    /* loaded from: classes6.dex */
    public enum DenoiseMode {
        DENOISE_NN_MODE(1);

        private final int mDenoiseMode;

        DenoiseMode(int i17) {
            this.mDenoiseMode = i17;
        }

        public final int getMode() {
            return this.mDenoiseMode;
        }
    }

    /* loaded from: classes6.dex */
    public enum DenoiseScene {
        DENOISE_SPEAK_SCENE(1);

        private final int mDenoiseScene;

        DenoiseScene(int i17) {
            this.mDenoiseScene = i17;
        }

        public final int getScene() {
            return this.mDenoiseScene;
        }
    }

    public HonorAdvancedRecordClient(android.content.Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.getInstance();
        this.mContext = context;
    }

    private void bindService(android.content.Context context) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "HnAdvancedRecordClient bindService");
        com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager honorFeatureKitManager = this.mFeatureKitManager;
        if (honorFeatureKitManager == null || this.mIsServiceConnected) {
            return;
        }
        honorFeatureKitManager.bindService(context, this.mConnection, ENGINE_CLASS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(java.lang.String str) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "HnAdvancedRecordClient serviceInit");
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAdvancedRecordService.init(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "HnAdvancedRecordClient isSupported,RemoteException ex :" + th6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(android.os.IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (java.lang.Throwable unused) {
                this.mFeatureKitManager.onCallBack(2002);
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public void destroy() {
        super.destroy();
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "destroy, HnAdvancedRecordClient mIsServiceConnected = " + this.mIsServiceConnected);
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
    }

    public boolean disableAdvancedRecord(android.content.Context context) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "HnAdvancedRecordClient disableAdvancedRecord mIsServiceConnected=" + this.mIsServiceConnected);
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return false;
            }
            return iHonorAdvancedRecordService.disableAdvancedRecord();
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "disableAdvancedRecord failed, RemoteException ex : " + th6.getMessage());
            return false;
        }
    }

    public boolean enableAdvancedRecord(android.content.Context context) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "HnAdvancedRecordClient enableAdvancedRecord");
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return false;
            }
            return iHonorAdvancedRecordService.enableAdvancedRecord();
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "enableAdvancedRecord failed, RemoteException ex : " + th6.getMessage());
            return false;
        }
    }

    public int enableRecordDenoise(boolean z17, com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.DenoiseMode denoiseMode, com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.DenoiseScene denoiseScene, com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.DenoiseLevel denoiseLevel) {
        if (com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.mMinVersion < 1000001) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "enable record denoise fail, mix version is " + com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.mMinVersion);
            return 2004;
        }
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHonorAdvancedRecordService.enableRecordDenoise(z17, denoiseMode.getMode(), denoiseScene.getScene(), denoiseLevel.getLevel(), this.mClientBinder);
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "enableRecordDenoise,RemoteException ex : " + th6.getMessage());
            return -2;
        }
    }

    public void initialize(android.content.Context context) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "HnAdvancedRecordClient initialize");
        if (context == null) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "initialize, context is null");
        } else if (com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "initialize, not install AudioEngine");
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public boolean isServiceSupported() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("HnAdvancedRecordClient isSupported, type = ");
        com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.ServiceType serviceType = com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.ServiceType.HNAUDIO_SERVICE_ADVANCEDRECORD;
        sb6.append(serviceType.getServiceType());
        sb6.append(",mIsServiceConnected=");
        sb6.append(this.mIsServiceConnected);
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, sb6.toString());
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService != null && this.mIsServiceConnected) {
                return iHonorAdvancedRecordService.isSupported(serviceType.getServiceType());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "isSupported,RemoteException ex : " + th6.getMessage());
        }
        return super.isServiceSupported();
    }
}
