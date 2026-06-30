package com.tencent.tmassistantsdk.downloadclient;

/* loaded from: classes13.dex */
public class TMAssistantDownloadSDKSettingClient extends com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase {
    protected static final java.lang.String DOWNDLOADSDKSERVICENAME = "com.tencent.TMAssistantDownloadSDKService";

    public TMAssistantDownloadSDKSettingClient(android.content.Context context, java.lang.String str) {
        super(context, str, DOWNDLOADSDKSERVICENAME);
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public android.content.Intent getBindServiceIntent() {
        return new android.content.Intent(this.mContext, java.lang.Class.forName(this.mDwonloadServiceName));
    }

    public synchronized int getVersion() {
        com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
        if (iTMAssistantDownloadSDKServiceInterface != null) {
            return iTMAssistantDownloadSDKServiceInterface.getServiceVersion();
        }
        super.initTMAssistantDownloadSDK();
        return 0;
    }

    public synchronized boolean isAllDownloadFinished() {
        boolean z17;
        com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
        if (iTMAssistantDownloadSDKServiceInterface != null) {
            z17 = iTMAssistantDownloadSDKServiceInterface.isAllDownloadFinished();
        } else {
            super.initTMAssistantDownloadSDK();
            z17 = false;
        }
        return z17;
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void onDownloadSDKServiceInvalid() {
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void registerServiceCallback() {
        ((com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) this.mServiceInterface).registerDownloadTaskCallback(this.mClientKey, (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback) this.mServiceCallback);
    }

    public synchronized void setDownloadSDKMaxTaskNum(int i17) {
        if (i17 < 1 || i17 > 10) {
            return;
        }
        com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
        if (iTMAssistantDownloadSDKServiceInterface != null) {
            iTMAssistantDownloadSDKServiceInterface.setServiceSetingMaxTaskNum(i17);
        } else {
            super.initTMAssistantDownloadSDK();
        }
    }

    public synchronized void setDownloadSDKWifiOnly(boolean z17) {
        com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface iTMAssistantDownloadSDKServiceInterface = (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) super.getServiceInterface();
        if (iTMAssistantDownloadSDKServiceInterface != null) {
            iTMAssistantDownloadSDKServiceInterface.setServiceSetingIsDownloadWifiOnly(z17);
        } else {
            super.initTMAssistantDownloadSDK();
        }
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void stubAsInterface(android.os.IBinder iBinder) {
        this.mServiceInterface = com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface.Stub.asInterface(iBinder);
    }

    @Override // com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase
    public void unRegisterServiceCallback() {
        ((com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface) this.mServiceInterface).unregisterDownloadTaskCallback(this.mClientKey, (com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback) this.mServiceCallback);
    }
}
