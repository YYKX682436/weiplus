package com.tenpay.ndk;

/* loaded from: classes9.dex */
public class WxSmStorage {
    private static volatile com.tenpay.ndk.WxSmStorage instance;
    private com.tenpay.ndk.FitScUtil fitScUtil;

    private WxSmStorage() {
        this.fitScUtil = null;
        this.fitScUtil = new com.tenpay.ndk.FitScUtil();
    }

    public static void freeInstance() {
        if (instance != null) {
            instance.release();
            instance = null;
        }
    }

    public static com.tenpay.ndk.WxSmStorage getInstance() {
        if (instance == null) {
            synchronized (com.tenpay.ndk.WxSmStorage.class) {
                if (instance == null) {
                    instance = new com.tenpay.ndk.WxSmStorage();
                }
            }
        }
        return instance;
    }

    private void release() {
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            com.tenpay.ndk.FitScUtil fitScUtil = this.fitScUtil;
            if (fitScUtil != null) {
                fitScUtil.release();
                this.fitScUtil = null;
            }
        }
    }

    public boolean clearAllValue() {
        return this.fitScUtil.clearAllValue();
    }

    public boolean clearValue(java.lang.String str) {
        return this.fitScUtil.clearValue(str);
    }

    public int getLastError() {
        return this.fitScUtil.getLastError();
    }

    public byte[] getValue(java.lang.String str) {
        return this.fitScUtil.getValue(str);
    }

    public java.lang.String getVersion() {
        return this.fitScUtil.getVersion();
    }

    public boolean hasValue(java.lang.String str) {
        return this.fitScUtil.hasValue(str);
    }

    public boolean init(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        boolean init;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            init = this.fitScUtil.init(str, str2, str3, str4);
        }
        return init;
    }

    public boolean setValue(java.lang.String str, byte[] bArr) {
        return this.fitScUtil.setValue(str, bArr);
    }
}
