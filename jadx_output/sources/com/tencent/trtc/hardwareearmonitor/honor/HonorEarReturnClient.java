package com.tencent.trtc.hardwareearmonitor.honor;

/* loaded from: classes16.dex */
public class HonorEarReturnClient extends com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit {
    private static final java.lang.String ENGINE_CLASS_NAME = "com.hihonor.android.magicx.media.audioengine.HnEarReturnServiceImpl";
    private static final java.lang.String TAG = "HnAudioEngine.HnEarReturnClient";
    private android.content.Context mContext;
    private com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager mFeatureKitManager;
    private com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService mHnEarReturnService;
    private boolean mIsServiceConnected = false;
    private android.os.IBinder mService = null;
    private android.content.ServiceConnection mConnection = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.TAG, "onServiceConnected");
            com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mHnEarReturnService = com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService.Stub.asInterface(iBinder);
            if (com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mHnEarReturnService != null) {
                com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mIsServiceConnected = true;
                com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient honorEarReturnClient = com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this;
                if (!honorEarReturnClient.serviceInit(honorEarReturnClient.mContext.getPackageName())) {
                    com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1002);
                } else {
                    com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.serviceLinkToDeath(iBinder);
                    com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1000);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.TAG, "onServiceDisconnected");
            com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mIsServiceConnected = false;
            if (com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mFeatureKitManager != null) {
                com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1001);
            }
        }
    };
    private android.os.IBinder.DeathRecipient mDeathRecipient = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.TAG, "binderDied");
            com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mService.unlinkToDeath(com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mDeathRecipient, 0);
            com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mFeatureKitManager.onCallBack(1003);
            com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.this.mService = null;
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

    public HonorEarReturnClient(android.content.Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.getInstance();
        this.mContext = context;
    }

    private void bindService(android.content.Context context) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "bindService");
        try {
            com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager honorFeatureKitManager = this.mFeatureKitManager;
            if (honorFeatureKitManager == null || this.mIsServiceConnected) {
                return;
            }
            honorFeatureKitManager.bindService(context, this.mConnection, ENGINE_CLASS_NAME);
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "bindService,RemoteException ex : " + th6.getMessage());
        }
    }

    private int getEarReturnLatency() {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "getEarReturnLatency");
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService == null || !this.mIsServiceConnected) {
                return -1;
            }
            return iHonorEarReturnService.getEarReturnLatency();
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "getEarReturnLatency,RemoteException ex : " + th6.getMessage());
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean serviceInit(java.lang.String str) {
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService != null && this.mIsServiceConnected) {
                iHonorEarReturnService.init(str);
            }
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "isSupported,RemoteException ex :" + th6.getMessage());
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
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public void destroy() {
        try {
            super.destroy();
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "destroy, mIsServiceConnected = " + this.mIsServiceConnected);
            if (this.mIsServiceConnected) {
                this.mIsServiceConnected = false;
                this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "bindService,RemoteException ex : " + th6.getMessage());
        }
    }

    public int enableEarReturn(boolean z17) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "enableEarReturn, enable = ".concat(java.lang.String.valueOf(z17)));
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHonorEarReturnService.enableEarReturn(z17);
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "enableEarReturn,RemoteException ex : " + th6.getMessage());
            return -2;
        }
    }

    public void initialize(android.content.Context context) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "initialize");
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isSupported, type = ");
        com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.ServiceType serviceType = com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN;
        sb6.append(serviceType.getServiceType());
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, sb6.toString());
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService != null && this.mIsServiceConnected) {
                return iHonorEarReturnService.isSupported(serviceType.getServiceType());
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "isSupported,RemoteException ex : " + th6.getMessage());
        }
        return super.isServiceSupported();
    }

    public int setParameter(com.tencent.trtc.hardwareearmonitor.honor.HonorEarReturnClient.ParameName parameName, int i17) {
        if (parameName == null) {
            return 1807;
        }
        try {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "parameValue =" + i17 + ", parame.getParameName() =" + parameName.getParameName());
            com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService iHonorEarReturnService = this.mHnEarReturnService;
            if (iHonorEarReturnService == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHonorEarReturnService.setParameter(parameName.getParameName(), i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "setParameter,RemoteException ex : " + th6.getMessage());
            return -2;
        }
    }
}
