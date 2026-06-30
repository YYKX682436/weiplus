package com.tencent.tmassistantsdk.protocol.jce;

/* loaded from: classes11.dex */
public final class ResponseHeadErrorCode implements java.io.Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int _EC_BUSINESS_ERROR = -11;
    public static final int _EC_SERVER_INTERNAL_ERROR = -10;
    private java.lang.String __T;
    private int __value;
    private static com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode[] __values = new com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode[2];
    public static final com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode EC_SERVER_INTERNAL_ERROR = new com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode(0, -10, "EC_SERVER_INTERNAL_ERROR");
    public static final com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode EC_BUSINESS_ERROR = new com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode(1, -11, "EC_BUSINESS_ERROR");

    private ResponseHeadErrorCode(int i17, int i18, java.lang.String str) {
        new java.lang.String();
        this.__T = str;
        this.__value = i18;
        __values[i17] = this;
    }

    public static com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode convert(int i17) {
        int i18 = 0;
        while (true) {
            com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode[] responseHeadErrorCodeArr = __values;
            if (i18 >= responseHeadErrorCodeArr.length) {
                return null;
            }
            if (responseHeadErrorCodeArr[i18].value() == i17) {
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

    public static com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode convert(java.lang.String str) {
        int i17 = 0;
        while (true) {
            com.tencent.tmassistantsdk.protocol.jce.ResponseHeadErrorCode[] responseHeadErrorCodeArr = __values;
            if (i17 >= responseHeadErrorCodeArr.length) {
                return null;
            }
            if (responseHeadErrorCodeArr[i17].toString().equals(str)) {
                return __values[i17];
            }
            i17++;
        }
    }
}
