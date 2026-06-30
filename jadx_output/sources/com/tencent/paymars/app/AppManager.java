package com.tencent.paymars.app;

/* loaded from: classes12.dex */
public class AppManager extends com.tencent.paymars.app.BaseManager {
    protected long nativeHandle = 0;
    protected long callbackHandle = 0;

    /* loaded from: classes12.dex */
    public interface CallBack {
        com.tencent.paymars.app.AppManager.AccountInfo getAccountInfo();

        java.lang.String getAppFilePath();

        java.lang.String getClientConfig(java.lang.String str, java.lang.String str2);

        int getClientVersion();

        com.tencent.paymars.app.AppManager.DeviceInfo getDeviceType();
    }

    /* loaded from: classes12.dex */
    public static class DeviceInfo {
        public java.lang.String devicename;
        public java.lang.String devicetype;

        public DeviceInfo(java.lang.String str, java.lang.String str2) {
            this.devicename = str;
            this.devicetype = str2;
        }
    }

    public AppManager(long j17) {
        OnJniCreateAppManagerFromHandle(j17);
    }

    public native void OnJniCreateAppManagerFromContext(java.lang.Object obj);

    public native void OnJniCreateAppManagerFromHandle(long j17);

    public native void OnJniDestroyAppManager();

    public native void OnJniSetCallback(java.lang.Object obj);

    public native void OnJniSetConfigBooleanValue(java.lang.String str, boolean z17);

    public native void OnJniSetConfigIntValue(java.lang.String str, int i17);

    public native void OnJniSetConfigStringValue(java.lang.String str, java.lang.String str2);

    public void SetConfigBooleanValue(java.lang.String str, boolean z17) {
        OnJniSetConfigBooleanValue(str, z17);
    }

    public void SetConfigIntValue(java.lang.String str, int i17) {
        OnJniSetConfigIntValue(str, i17);
    }

    public void SetConfigStringValue(java.lang.String str, java.lang.String str2) {
        OnJniSetConfigStringValue(str, str2);
    }

    @Override // com.tencent.paymars.app.BaseManager
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public void onDestroy() {
        OnJniDestroyAppManager();
        this.nativeHandle = 0L;
        this.callbackHandle = 0L;
    }

    public void setCallback(com.tencent.paymars.app.AppManager.CallBack callBack) {
        OnJniSetCallback(callBack);
    }

    /* loaded from: classes12.dex */
    public static class AccountInfo {
        public long uin;
        public java.lang.String userName;

        public AccountInfo() {
            this.uin = 0L;
            this.userName = "";
        }

        public AccountInfo(long j17, java.lang.String str) {
            this.uin = j17;
            this.userName = str;
        }
    }

    public AppManager(com.tencent.paymars.app.Context context) {
        OnJniCreateAppManagerFromContext(context);
    }
}
