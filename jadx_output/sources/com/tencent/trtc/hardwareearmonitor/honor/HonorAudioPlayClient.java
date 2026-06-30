package com.tencent.trtc.hardwareearmonitor.honor;

/* loaded from: classes16.dex */
public class HonorAudioPlayClient extends com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit {
    private static final java.lang.String ENGINE_CLASS_NAME = "com.hihonor.android.magicx.media.audioengine.HnAudioPlayServiceImpl";
    private static final java.lang.String TAG = "HnAudioEngine.HnAudioPlayClient";
    private android.content.Context mContext;
    private com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager mFeatureKitManager;
    private com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService mHnAudioPlayService;
    private boolean mIsServiceConnected = false;
    private android.os.IBinder mService = null;
    private android.content.ServiceConnection mConnection = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.TAG, "onServiceConnected");
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mHnAudioPlayService = com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService.Stub.asInterface(iBinder);
            if (com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mHnAudioPlayService != null) {
                com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mIsServiceConnected = true;
                com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient honorAudioPlayClient = com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this;
                honorAudioPlayClient.serviceInit(honorAudioPlayClient.mContext.getPackageName());
                com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.serviceLinkToDeath(iBinder);
                com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mFeatureKitManager.onCallBack(3000);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.TAG, "onServiceDisconnected");
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mIsServiceConnected = false;
            if (com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mFeatureKitManager != null) {
                com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mFeatureKitManager.onCallBack(3001);
            }
        }
    };
    private android.os.IBinder.DeathRecipient mDeathRecipient = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mService.unlinkToDeath(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mDeathRecipient, 0);
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mFeatureKitManager.onCallBack(3004);
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.TAG, "service binder died");
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioPlayClient.this.mService = null;
        }
    };

    public HonorAudioPlayClient(android.content.Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.getInstance();
        this.mContext = context;
    }

    private void bindService(android.content.Context context) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "bindService");
        com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager honorFeatureKitManager = this.mFeatureKitManager;
        if (honorFeatureKitManager == null || this.mIsServiceConnected) {
            return;
        }
        honorFeatureKitManager.bindService(context, this.mConnection, ENGINE_CLASS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(java.lang.String str) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "HnAudioPlayClient serviceInit");
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService iHonorAudioPlayService = this.mHnAudioPlayService;
            if (iHonorAudioPlayService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAudioPlayService.init(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "HnAudioPlayClient isSupported,RemoteException ex :" + th6.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(android.os.IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (java.lang.Throwable unused) {
                this.mFeatureKitManager.onCallBack(3003);
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public void destroy() {
        super.destroy();
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "destroy, mIsServiceConnected = " + this.mIsServiceConnected);
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
    }

    public void enableHighSampleRatePlay(boolean z17) {
        if (com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.mMinVersion < 1000001) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "not support high sample rate play service. The mix version is " + com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.mMinVersion);
            this.mFeatureKitManager.onCallBack(3002);
            return;
        }
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "enableHighSampleRatePlay, enable = ".concat(java.lang.String.valueOf(z17)));
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService iHonorAudioPlayService = this.mHnAudioPlayService;
            if (iHonorAudioPlayService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAudioPlayService.enableHighSampleRatePlay(z17);
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "enableHighSampleRatePlay,RemoteException ex : " + th6.getMessage());
        }
    }

    public void initialize(android.content.Context context) {
        if (context == null) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "initialize, context is null");
        } else if (com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "initialize, not install AudioEngine");
        }
    }
}
