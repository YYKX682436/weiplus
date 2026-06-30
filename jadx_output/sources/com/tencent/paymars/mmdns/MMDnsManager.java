package com.tencent.paymars.mmdns;

/* loaded from: classes12.dex */
public class MMDnsManager extends com.tencent.paymars.app.BaseManager {
    protected static final java.lang.String TAG = "mars.MMDnsManager";
    protected long nativeHandle = 0;
    protected long callbackHandle = 0;

    /* loaded from: classes6.dex */
    public interface IPStackSelection {
        public static final int kSelectAll = 3;
        public static final int kSelectAuto = 0;
        public static final int kSelectIPv4 = 1;
        public static final int kSelectIPv6 = 2;
    }

    /* loaded from: classes6.dex */
    public static class MMDnsRespItem {
        public java.lang.String host;
        public java.util.List<java.lang.String> ipList;
        public int retCode;
    }

    public MMDnsManager(long j17) {
        OnJniCreateMMDnsManagerFromHandle(j17);
    }

    public native void OnJniCreateMMDnsManagerFromContext(java.lang.Object obj);

    public native void OnJniCreateMMDnsManagerFromHandle(long j17);

    public native void OnJniDestroyMMDnsManager();

    public native java.util.ArrayList<java.lang.String> OnJniGetHost(java.lang.String str);

    public native java.util.ArrayList<java.lang.String> OnJniGetHostWithParam(java.lang.String str, int i17, boolean z17, int i18);

    public native java.util.ArrayList<com.tencent.paymars.mmdns.MMDnsManager.MMDnsRespItem> OnJniGetSimpleDnsIP(java.util.ArrayList<java.lang.String> arrayList, int i17, int i18);

    public native void OnJniSetDebugIp(java.lang.String str, int i17);

    public native void OnJniSetForceUserIPv6(boolean z17);

    public native boolean OnJniSyncGetMMDns(java.lang.String str);

    public java.util.ArrayList<java.lang.String> getHost(java.lang.String str) {
        return OnJniGetHost(str);
    }

    public java.util.ArrayList<java.lang.String> getHostWithParam(java.lang.String str, int i17, boolean z17, int i18) {
        return OnJniGetHostWithParam(str, i17, z17, i18);
    }

    @Override // com.tencent.paymars.app.BaseManager
    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public java.util.ArrayList<com.tencent.paymars.mmdns.MMDnsManager.MMDnsRespItem> getSimpleDnsIP(java.util.ArrayList<java.lang.String> arrayList, int i17, int i18) {
        return OnJniGetSimpleDnsIP(arrayList, i17, i18);
    }

    public void onDestroy() {
        OnJniDestroyMMDnsManager();
        this.nativeHandle = 0L;
        this.callbackHandle = 0L;
    }

    public void setDebugIp(java.lang.String str, int i17) {
        OnJniSetDebugIp(str, i17);
    }

    public void setForceUserIPv6(boolean z17) {
        OnJniSetForceUserIPv6(z17);
    }

    public boolean syncGetMMDns(java.lang.String str) {
        return OnJniSyncGetMMDns(str);
    }

    public MMDnsManager(com.tencent.paymars.app.Context context) {
        OnJniCreateMMDnsManagerFromContext(context);
    }
}
