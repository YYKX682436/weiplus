package com.tencent.mm.websocket.libwcwss;

/* loaded from: classes7.dex */
public class WcwssNative {
    public static int INIT_ERROR = -1002;
    public static int NEW_WCWSS_ERROR = -1000;
    public static int REPEAT_INIT_ERROR = -1001;
    public static java.lang.String TAG = "WcwssNative";
    private volatile long mNativeInst = 0;
    private volatile java.lang.String mStrNativeInst = "0";
    private volatile boolean initCallBackFlag = false;

    /* loaded from: classes7.dex */
    public interface IWcWssReportListener {
        int getNetworkType();

        void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3);

        void onKvStat(int i17, java.lang.String str);
    }

    /* loaded from: classes7.dex */
    public interface IWcWssWebSocketListener {

        /* loaded from: classes7.dex */
        public static class BindAndDnsReturn {
            public java.lang.String hostIpStr;
            public int resultCode;
        }

        com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener.BindAndDnsReturn bindSocketToCellularAndDnsByCellular(int i17, java.lang.String str);

        int doCertificateVerify(java.lang.String str, long j17, java.lang.String str2, byte[][] bArr);

        void onStateChange(java.lang.String str, long j17, int i17);
    }

    private native void destoryBindingWcwss(long j17);

    private native void doOnRunningStateWcwss(java.lang.String str, long j17);

    private native long initBindingWcwss(long j17, long j18, long j19);

    private native int initCallBack(long j17, com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener, com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener iWcWssReportListener);

    private native void initConfigWcwss(java.lang.String str, long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    private native void initConfigWhiteBlackList(java.lang.String str, long j17, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2);

    private native void testBindingWcwss(long j17);

    private native void updateNativeInterface(java.lang.String str, long j17, long j18, int i17);

    public void destoryWcwss() {
        if (this.mNativeInst != -1 && this.initCallBackFlag) {
            this.initCallBackFlag = false;
            destoryBindingWcwss(this.mNativeInst);
            this.mNativeInst = -1L;
        }
    }

    public void doOnRunningState() {
        doOnRunningStateWcwss(this.mStrNativeInst, this.mNativeInst);
    }

    public void initConfig(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        initConfigWcwss(this.mStrNativeInst, this.mNativeInst, hashMap);
    }

    public void initConfigWhiteBlack(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        initConfigWhiteBlackList(this.mStrNativeInst, this.mNativeInst, arrayList, arrayList2);
    }

    public java.lang.String initWcwss(long j17, long j18, long j19) {
        this.mNativeInst = initBindingWcwss(j17, j18, j19);
        this.mStrNativeInst = java.lang.String.valueOf(this.mNativeInst);
        return this.mStrNativeInst;
    }

    public int setCallback(com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssWebSocketListener iWcWssWebSocketListener, com.tencent.mm.websocket.libwcwss.WcwssNative.IWcWssReportListener iWcWssReportListener) {
        if (this.mNativeInst == -1) {
            return NEW_WCWSS_ERROR;
        }
        if (this.initCallBackFlag) {
            return REPEAT_INIT_ERROR;
        }
        int initCallBack = initCallBack(this.mNativeInst, iWcWssWebSocketListener, iWcWssReportListener);
        if (initCallBack != 0) {
            return INIT_ERROR;
        }
        this.initCallBackFlag = true;
        return initCallBack;
    }

    public void testBindWcwss(java.lang.String str) {
        testBindingWcwss(java.lang.Long.parseLong(str));
    }

    public void updateInterface(long j17, int i17) {
        updateNativeInterface(this.mStrNativeInst, this.mNativeInst, j17, i17);
    }
}
