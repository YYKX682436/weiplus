package com.tencent.tmassistantsdk.openSDK.param.jce;

/* loaded from: classes11.dex */
public final class IPCCmd implements java.io.Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int _BatchDownloadAction = 9;
    public static final int _Empty = 0;
    public static final int _GetDownloadProgress = 3;
    public static final int _GetDownloadState = 2;
    public static final int _OperateDownloadTask = 1;
    public static final int _QueryDownloadTask = 4;
    public static final int _QueryLoginInfo = 6;
    public static final int _QueryLoginState = 7;
    public static final int _ServiceFreeAction = 8;
    public static final int _URIAction = 5;
    private java.lang.String __T;
    private int __value;
    private static com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd[] __values = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd[10];
    public static final com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd Empty = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd(0, 0, "Empty");
    public static final com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd OperateDownloadTask = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd(1, 1, "OperateDownloadTask");
    public static final com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd GetDownloadState = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd(2, 2, "GetDownloadState");
    public static final com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd GetDownloadProgress = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd(3, 3, "GetDownloadProgress");
    public static final com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd QueryDownloadTask = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd(4, 4, "QueryDownloadTask");
    public static final com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd URIAction = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd(5, 5, "URIAction");
    public static final com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd QueryLoginInfo = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd(6, 6, "QueryLoginInfo");
    public static final com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd QueryLoginState = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd(7, 7, "QueryLoginState");
    public static final com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd ServiceFreeAction = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd(8, 8, "ServiceFreeAction");
    public static final com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd BatchDownloadAction = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd(9, 9, "BatchDownloadAction");

    private IPCCmd(int i17, int i18, java.lang.String str) {
        new java.lang.String();
        this.__T = str;
        this.__value = i18;
        __values[i17] = this;
    }

    public static com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd convert(int i17) {
        int i18 = 0;
        while (true) {
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd[] iPCCmdArr = __values;
            if (i18 >= iPCCmdArr.length) {
                return null;
            }
            if (iPCCmdArr[i18].value() == i17) {
                return __values[i18];
            }
            i18++;
        }
    }

    public java.lang.String toString() {
        return this.__T;
    }

    public int value() {
        return this.__value;
    }

    public static com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd convert(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd[] iPCCmdArr = __values;
            if (i17 >= iPCCmdArr.length) {
                return null;
            }
            if (iPCCmdArr[i17].toString().equals(str)) {
                return __values[i17];
            }
            i17++;
        }
    }
}
