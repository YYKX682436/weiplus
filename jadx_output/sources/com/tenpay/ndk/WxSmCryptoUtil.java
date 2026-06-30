package com.tenpay.ndk;

/* loaded from: classes9.dex */
public class WxSmCryptoUtil {
    public static final byte[] SM2_DEFAULT_ID = "1234567812345678".getBytes();
    private static volatile com.tenpay.ndk.WxSmCryptoUtil instance = null;
    private com.tenpay.ndk.FitScUtil fitScUtil;

    /* loaded from: classes16.dex */
    public enum SM2CipherMode {
        SM2CipherMode_C1C3C2_ASN1,
        SM2CipherMode_C1C3C2,
        SM2CipherMode_C1C2C3_ASN1,
        SM2CipherMode_C1C2C3,
        SM2CipherMode_04C1C3C2,
        SM2CipherMode_04C1C2C3
    }

    /* loaded from: classes6.dex */
    public enum SM2SignMode {
        SM2SignMode_RS_ASN1,
        SM2SignMode_RS
    }

    /* loaded from: classes6.dex */
    public enum SM4Mode {
        SM4_ECB
    }

    private WxSmCryptoUtil() {
        this.fitScUtil = null;
        com.tenpay.ndk.FitScUtil fitScUtil = new com.tenpay.ndk.FitScUtil();
        this.fitScUtil = fitScUtil;
        boolean initTsm = fitScUtil.initTsm();
        com.tenpay.ndk.FitNativeEvent.Logger listener = com.tenpay.ndk.FitNativeEvent.getListener();
        if (listener != null) {
            listener.onLog(this.fitScUtil.getLastError(), "WxSmCryptoUtil, fitScUtil.initTsm ok = " + initTsm);
        }
    }

    public static com.tenpay.ndk.WxSmCryptoUtil getInstance() {
        if (instance == null) {
            synchronized (com.tenpay.ndk.WxSmCryptoUtil.class) {
                if (instance == null) {
                    instance = new com.tenpay.ndk.WxSmCryptoUtil();
                }
            }
        }
        return instance;
    }

    public java.lang.String encryptDataWithSm4(byte[] bArr, int i17) {
        return this.fitScUtil.encryptDataWithSm4(bArr, i17);
    }

    public java.lang.String encryptGenericDataWithCert(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String encryptGenericDataWithCert;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            encryptGenericDataWithCert = this.fitScUtil.encryptGenericDataWithCert(str, str2, str3, false);
        }
        return encryptGenericDataWithCert;
    }

    public java.lang.String encryptPassword(java.lang.String str, long j17, java.lang.String str2, int i17) {
        java.lang.String encryptPassword;
        byte[] bytes = str == null ? null : str.getBytes();
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            encryptPassword = this.fitScUtil.encryptPassword(bytes, "prod-wxpay-pbkdf2".getBytes(), j17, str2, i17);
        }
        return encryptPassword;
    }

    public java.lang.String getGenericDataHash(java.lang.String str, java.lang.String str2) {
        java.lang.String genericDataHash;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            genericDataHash = this.fitScUtil.getGenericDataHash(str, str2);
        }
        return genericDataHash;
    }

    public int getLastError() {
        return this.fitScUtil.getLastError();
    }

    public java.lang.String getVersion() {
        return this.fitScUtil.getVersion();
    }

    public byte[] randomBytes(int i17) {
        return this.fitScUtil.randomBytes(i17);
    }

    public byte[] sm2Decrypt(byte[] bArr, byte[] bArr2) {
        byte[] sm2Decrypt;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2Decrypt = this.fitScUtil.sm2Decrypt(bArr, bArr2);
        }
        return sm2Decrypt;
    }

    public byte[] sm2DecryptWithMode(byte[] bArr, byte[] bArr2, com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode sM2CipherMode) {
        byte[] sm2DecryptWithMode;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2DecryptWithMode = this.fitScUtil.sm2DecryptWithMode(bArr, bArr2, sM2CipherMode.ordinal());
        }
        return sm2DecryptWithMode;
    }

    public byte[] sm2Encrypt(byte[] bArr, byte[] bArr2) {
        byte[] sm2Encrypt;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2Encrypt = this.fitScUtil.sm2Encrypt(bArr, bArr2);
        }
        return sm2Encrypt;
    }

    public byte[] sm2EncryptWithMode(byte[] bArr, byte[] bArr2, com.tenpay.ndk.WxSmCryptoUtil.SM2CipherMode sM2CipherMode) {
        byte[] sm2EncryptWithMode;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2EncryptWithMode = this.fitScUtil.sm2EncryptWithMode(bArr, bArr2, sM2CipherMode.ordinal());
        }
        return sm2EncryptWithMode;
    }

    public byte[][] sm2GenKeyPair() {
        byte[][] bArr;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            bArr = (byte[][]) this.fitScUtil.sm2GenKeyPair();
        }
        return bArr;
    }

    public byte[] sm2GenPublicKey(byte[] bArr) {
        byte[] sm2GenPublicKey;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2GenPublicKey = this.fitScUtil.sm2GenPublicKey(bArr);
        }
        return sm2GenPublicKey;
    }

    public byte[] sm2SealEnvelope(byte[] bArr, byte[] bArr2, com.tenpay.ndk.WxSmCryptoUtil.SM4Mode sM4Mode) {
        byte[] sm2SealEnvelope;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2SealEnvelope = this.fitScUtil.sm2SealEnvelope(bArr, bArr2, sM4Mode.ordinal());
        }
        return sm2SealEnvelope;
    }

    public byte[] sm2Sign(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] sm2Sign;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2Sign = this.fitScUtil.sm2Sign(bArr, bArr2, bArr3, bArr4);
        }
        return sm2Sign;
    }

    public byte[] sm2SignWithMode(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, com.tenpay.ndk.WxSmCryptoUtil.SM2SignMode sM2SignMode) {
        byte[] sm2SignWithMode;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2SignWithMode = this.fitScUtil.sm2SignWithMode(bArr, bArr2, bArr3, bArr4, sM2SignMode.ordinal());
        }
        return sm2SignWithMode;
    }

    public byte[] sm2UnsealEnvelope(byte[] bArr, byte[] bArr2) {
        byte[] sm2UnsealEnvelope;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2UnsealEnvelope = this.fitScUtil.sm2UnsealEnvelope(bArr, bArr2);
        }
        return sm2UnsealEnvelope;
    }

    public boolean sm2Verify(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        boolean sm2Verify;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2Verify = this.fitScUtil.sm2Verify(bArr, bArr2, bArr3, bArr4);
        }
        return sm2Verify;
    }

    public boolean sm2VerifyWithMode(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, com.tenpay.ndk.WxSmCryptoUtil.SM2SignMode sM2SignMode) {
        boolean sm2VerifyWithMode;
        synchronized (com.tenpay.ndk.FitScUtil.sm2Lock) {
            sm2VerifyWithMode = this.fitScUtil.sm2VerifyWithMode(bArr, bArr2, bArr3, bArr4, sM2SignMode.ordinal());
        }
        return sm2VerifyWithMode;
    }

    public byte[] sm3(byte[] bArr) {
        return this.fitScUtil.sm3(bArr);
    }

    public byte[] sm3Hmac(byte[] bArr, byte[] bArr2) {
        return this.fitScUtil.sm3Hmac(bArr, bArr2);
    }

    public byte[] sm4CbcDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z17) {
        return this.fitScUtil.sm4CbcDecrypt(bArr, bArr2, bArr3, z17);
    }

    public byte[] sm4CbcEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z17) {
        return this.fitScUtil.sm4CbcEncrypt(bArr, bArr2, bArr3, z17);
    }

    public byte[] sm4CtrDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.fitScUtil.sm4CtrDecrypt(bArr, bArr2, bArr3);
    }

    public byte[] sm4CtrEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.fitScUtil.sm4CtrEncrypt(bArr, bArr2, bArr3);
    }

    public byte[] sm4GcmDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        return this.fitScUtil.sm4GcmDecrypt(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public byte[][] sm4GcmEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return (byte[][]) this.fitScUtil.sm4GcmEncrypt(bArr, bArr2, bArr3, bArr4);
    }
}
