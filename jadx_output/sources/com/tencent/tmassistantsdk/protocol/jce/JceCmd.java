package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes11.dex */
public final class JceCmd implements java.io.Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int _Empty = 0;
    public static final int _GetAppSimpleDetail = 5;
    public static final int _GetAppUpdate = 3;
    public static final int _GetSettings = 2;
    public static final int _ReportApkFileInfo = 4;
    public static final int _ReportLog = 1;
    private java.lang.String __T;
    private int __value;
    private static com.tencent.tmassistantsdk.protocol.jce.JceCmd[] __values = new com.tencent.tmassistantsdk.protocol.jce.JceCmd[6];
    public static final com.tencent.tmassistantsdk.protocol.jce.JceCmd Empty = new com.tencent.tmassistantsdk.protocol.jce.JceCmd(0, 0, "Empty");
    public static final com.tencent.tmassistantsdk.protocol.jce.JceCmd ReportLog = new com.tencent.tmassistantsdk.protocol.jce.JceCmd(1, 1, "ReportLog");
    public static final com.tencent.tmassistantsdk.protocol.jce.JceCmd GetSettings = new com.tencent.tmassistantsdk.protocol.jce.JceCmd(2, 2, "GetSettings");
    public static final com.tencent.tmassistantsdk.protocol.jce.JceCmd GetAppUpdate = new com.tencent.tmassistantsdk.protocol.jce.JceCmd(3, 3, "GetAppUpdate");
    public static final com.tencent.tmassistantsdk.protocol.jce.JceCmd ReportApkFileInfo = new com.tencent.tmassistantsdk.protocol.jce.JceCmd(4, 4, "ReportApkFileInfo");
    public static final com.tencent.tmassistantsdk.protocol.jce.JceCmd GetAppSimpleDetail = new com.tencent.tmassistantsdk.protocol.jce.JceCmd(5, 5, "GetAppSimpleDetail");

    private JceCmd(int i17, int i18, java.lang.String str) {
        new java.lang.String();
        this.__T = str;
        this.__value = i18;
        __values[i17] = this;
    }

    public static com.tencent.tmassistantsdk.protocol.jce.JceCmd convert(int i17) {
        int i18 = 0;
        while (true) {
            com.tencent.tmassistantsdk.protocol.jce.JceCmd[] jceCmdArr = __values;
            if (i18 >= jceCmdArr.length) {
                return null;
            }
            if (jceCmdArr[i18].value() == i17) {
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

    public static com.tencent.tmassistantsdk.protocol.jce.JceCmd convert(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.tencent.tmassistantsdk.protocol.jce.JceCmd[] jceCmdArr = __values;
            if (i17 >= jceCmdArr.length) {
                return null;
            }
            if (jceCmdArr[i17].toString().equals(str)) {
                return __values[i17];
            }
            i17++;
        }
    }
}
