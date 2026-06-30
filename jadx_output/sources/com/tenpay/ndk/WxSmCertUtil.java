package com.tenpay.ndk;

/* loaded from: classes9.dex */
public class WxSmCertUtil {
    private static volatile com.tenpay.ndk.WxSmCertUtil instance;
    private com.tenpay.ndk.FitScUtil fitScUtil;

    private WxSmCertUtil() {
        this.fitScUtil = null;
        this.fitScUtil = new com.tenpay.ndk.FitScUtil();
    }

    public static void freeInstance() {
        if (instance != null) {
            instance.release();
            instance = null;
        }
    }

    public static com.tenpay.ndk.WxSmCertUtil getInstance() {
        if (instance == null) {
            synchronized (com.tenpay.ndk.WxSmCertUtil.class) {
                if (instance == null) {
                    instance = new com.tenpay.ndk.WxSmCertUtil();
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

    public byte[] certDecrypt(java.lang.String str, byte[] bArr) {
        byte[] certDecrypt;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            certDecrypt = this.fitScUtil.certDecrypt(str, bArr);
        }
        return certDecrypt;
    }

    public byte[] certEncrypt(java.lang.String str, byte[] bArr) {
        byte[] certEncrypt;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            certEncrypt = this.fitScUtil.certEncrypt(str, bArr);
        }
        return certEncrypt;
    }

    public byte[] certSign(java.lang.String str, byte[] bArr, byte[] bArr2) {
        byte[] certSign;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            certSign = this.fitScUtil.certSign(str, bArr, bArr2);
        }
        return certSign;
    }

    public boolean certVerify(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        boolean certVerify;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            certVerify = this.fitScUtil.certVerify(str, bArr, bArr2, bArr3);
        }
        return certVerify;
    }

    public boolean clearAllCert() {
        return this.fitScUtil.clearAllCert();
    }

    public boolean clearCert(java.lang.String str) {
        return this.fitScUtil.clearCert(str);
    }

    public boolean clearToken(java.lang.String str) {
        return this.fitScUtil.clearToken(str);
    }

    public boolean clearTokenSeed(java.lang.String str) {
        return this.fitScUtil.clearTokenSeed(str);
    }

    public int getCaCertVersion() {
        return this.fitScUtil.getCaCertVersion();
    }

    public long[] getCertValidTime(java.lang.String str) {
        long[] certValidTime;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            certValidTime = this.fitScUtil.getCertValidTime(str);
        }
        return certValidTime;
    }

    public int getLastError() {
        return this.fitScUtil.getLastError();
    }

    public java.lang.String getToken(java.lang.String str) {
        java.lang.String token;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            token = this.fitScUtil.getToken(str);
        }
        return token;
    }

    public int getTokenCount(java.lang.String str) {
        return this.fitScUtil.getTokenCount(str);
    }

    public java.lang.String getTokenHeader(java.lang.String str) {
        java.lang.String tokenHeader;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            tokenHeader = this.fitScUtil.getTokenHeader(str);
        }
        return tokenHeader;
    }

    public byte[] getTokenSeed(java.lang.String str) {
        byte[] tokenSeed;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            tokenSeed = this.fitScUtil.getTokenSeed(str);
        }
        return tokenSeed;
    }

    public java.lang.String getVersion() {
        return this.fitScUtil.getVersion();
    }

    public boolean hasCert(java.lang.String str) {
        return this.fitScUtil.hasCert(str, false);
    }

    public boolean importCert(java.lang.String str, java.lang.String str2, boolean z17) {
        boolean importCert;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            importCert = this.fitScUtil.importCert(str, str2, z17);
        }
        return importCert;
    }

    public boolean init(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        boolean init;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            init = this.fitScUtil.init(str, str2, str3, str4);
        }
        return init;
    }

    public java.lang.String makeCsr(java.lang.String str, java.lang.String str2) {
        java.lang.String makeCsr;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            makeCsr = this.fitScUtil.makeCsr(str, str2);
        }
        return makeCsr;
    }

    public boolean setToken(java.lang.String str, java.lang.String str2) {
        return this.fitScUtil.setToken(str, str2);
    }

    public boolean setTokenSeed(java.lang.String str, byte[] bArr) {
        return this.fitScUtil.setTokenSeed(str, bArr);
    }

    public boolean updateCaCert(int i17, java.lang.String[] strArr) {
        boolean updateCaCert;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            updateCaCert = this.fitScUtil.updateCaCert(i17, strArr);
        }
        return updateCaCert;
    }

    public boolean hasCert(java.lang.String str, boolean z17) {
        return this.fitScUtil.hasCert(str, z17);
    }
}
