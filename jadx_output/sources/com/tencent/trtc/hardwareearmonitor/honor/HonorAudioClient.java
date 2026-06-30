package com.tencent.trtc.hardwareearmonitor.honor;

/* loaded from: classes16.dex */
public class HonorAudioClient {
    private static final java.util.List<java.lang.Integer> DEFAULT_FEATURE_LIST = new java.util.ArrayList(0);
    private static final int DEFAULT_VALUE = 0;
    private static final java.lang.String ENGINE_CLASS_NAME = "com.hihonor.android.magicx.media.audioengine.HnAudioServiceImpl";
    private static final java.lang.String ENGINE_PACKAGE_NAME = "com.hihonor.android.magicx.media.audioengine";
    private static final java.lang.String TAG = "HnAudioEngine.HnAudioClient";
    private android.content.Context mContext;
    private com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager mFeatureKitManager;
    private com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService mIHnAudioService = null;
    private boolean mIsServiceConnected = false;
    private android.os.IBinder mService = null;
    private java.util.List<java.lang.Integer> mSupportedServiceList = new java.util.ArrayList();
    private android.content.ServiceConnection mConnection = new android.content.ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mIHnAudioService = com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService.Stub.asInterface(iBinder);
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.TAG, "onServiceConnected");
            if (com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mIHnAudioService != null) {
                com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mIsServiceConnected = true;
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.TAG, "onServiceConnected, mIHnAudioService is not null");
                com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mFeatureKitManager.onCallBack(0);
                com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient honorAudioClient = com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this;
                honorAudioClient.serviceInit(honorAudioClient.mContext.getPackageName(), com.tencent.trtc.hardwareearmonitor.honor.HonorVersion.SDK_VERSION_NAME);
                com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.serviceLinkToDeath(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(android.content.ComponentName componentName) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.TAG, "onServiceDisconnected");
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mIHnAudioService = null;
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mIsServiceConnected = false;
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mFeatureKitManager.onCallBack(4);
        }
    };
    private android.os.IBinder.DeathRecipient mDeathRecipient = new android.os.IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mService.unlinkToDeath(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mDeathRecipient, 0);
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mFeatureKitManager.onCallBack(6);
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.TAG, "service binder died");
            com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.this.mService = null;
        }
    };

    /* loaded from: classes6.dex */
    public enum ServiceType {
        HNAUDIO_SERVICE_EARRETURN(1),
        HNAUDIO_SERVICE_ADVANCEDRECORD(2),
        HNAUDIO_SERVICE_HIGHSAMPLERATEPLAY(3),
        HNAUDIO_SERVICE_RECORDDENOISE(4);

        private int mServiceType;

        ServiceType(int i17) {
            this.mServiceType = i17;
        }

        public final int getServiceType() {
            return this.mServiceType;
        }
    }

    public HonorAudioClient(android.content.Context context, com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioServiceCallback iHonorAudioServiceCallback) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager honorFeatureKitManager = com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.getInstance();
        this.mFeatureKitManager = honorFeatureKitManager;
        this.mContext = null;
        honorFeatureKitManager.setCallBack(iHonorAudioServiceCallback);
        this.mContext = context;
    }

    private void bindService(android.content.Context context) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "bindService, mIsServiceConnected = " + this.mIsServiceConnected);
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

    private void filterUnsupportedService(int i17) {
        if (i17 == 1) {
            if (com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.mMinVersion >= 1000000) {
                this.mSupportedServiceList.add(java.lang.Integer.valueOf(i17));
            }
        } else if (i17 == 2) {
            if (com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.mMinVersion >= 1000000) {
                this.mSupportedServiceList.add(java.lang.Integer.valueOf(i17));
            }
        } else if (i17 == 3) {
            if (com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.mMinVersion >= 1000001) {
                this.mSupportedServiceList.add(java.lang.Integer.valueOf(i17));
            }
        } else if (i17 == 4 && com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.mMinVersion >= 1000001) {
            this.mSupportedServiceList.add(java.lang.Integer.valueOf(i17));
        }
    }

    public static boolean isDeviceSupported(android.content.Context context) {
        return com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.isAudioKitSupport(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(java.lang.String str, java.lang.String str2) {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "serviceInit");
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService iHonorAudioService = this.mIHnAudioService;
            if (iHonorAudioService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAudioService.init(str, str2);
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "isFeatureSupported,RemoteException ex :" + th6.getMessage());
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
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    public <T extends com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit> T createService(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.ServiceType serviceType) {
        if (this.mFeatureKitManager != null && serviceType != null && this.mSupportedServiceList.contains(java.lang.Integer.valueOf(serviceType.getServiceType()))) {
            return (T) this.mFeatureKitManager.createFeatureKit(serviceType.getServiceType(), this.mContext);
        }
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "createService fail");
        return null;
    }

    public void destroy() {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "destroy, mIsServiceConnected = " + this.mIsServiceConnected);
        try {
            if (this.mIsServiceConnected) {
                this.mIsServiceConnected = false;
                this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "unbindService,RemoteException ex : " + th6.getMessage());
        }
    }

    public java.util.List<java.lang.Integer> getSupportedServices() {
        try {
            com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService iHonorAudioService = this.mIHnAudioService;
            if (iHonorAudioService != null && this.mIsServiceConnected) {
                java.util.List supportedServices = iHonorAudioService.getSupportedServices();
                if (supportedServices == null) {
                    com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "list is null");
                    return DEFAULT_FEATURE_LIST;
                }
                this.mSupportedServiceList.clear();
                java.util.Iterator it = supportedServices.iterator();
                while (it.hasNext()) {
                    filterUnsupportedService(((java.lang.Integer) it.next()).intValue());
                }
                com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "getSupportedServices " + java.util.Arrays.toString(supportedServices.toArray()));
                return this.mSupportedServiceList;
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "getSupportedServices, createFeature,wait bind service fail");
        }
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "getSupportedServices, service not bind");
        return DEFAULT_FEATURE_LIST;
    }

    public void initialize() {
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "initialize");
        android.content.Context context = this.mContext;
        if (context == null) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "mContext is null");
            this.mFeatureKitManager.onCallBack(7);
        } else if (com.tencent.trtc.hardwareearmonitor.honor.HonorFeatureKitManager.isAudioKitSupport(context)) {
            bindService(this.mContext);
        } else {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "not install AudioKitEngine");
            this.mFeatureKitManager.onCallBack(2);
        }
    }

    public boolean isServiceSupported(com.tencent.trtc.hardwareearmonitor.honor.HonorAudioClient.ServiceType serviceType) {
        if (serviceType == null) {
            return false;
        }
        com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.info(TAG, "isServiceSupported, type = " + serviceType.getServiceType());
        try {
            if (this.mIHnAudioService != null && this.mIsServiceConnected && this.mSupportedServiceList.contains(java.lang.Integer.valueOf(serviceType.getServiceType()))) {
                return this.mIHnAudioService.isServiceSupported(serviceType.getServiceType());
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.trtc.hardwareearmonitor.honor.HonorLogUtils.error(TAG, "isServiceSupported,RemoteException ex : " + th6.getMessage());
            return false;
        }
    }
}
