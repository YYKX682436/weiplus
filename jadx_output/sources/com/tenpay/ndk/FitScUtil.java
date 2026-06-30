package com.tenpay.ndk;

/* loaded from: classes9.dex */
public class FitScUtil {
    public static byte[] sm2Lock = new byte[0];

    static {
        com.tenpay.ndk.FitScLibraryLoader.load(com.tenpay.utils.SMUtilsV2.LIB_NAME);
    }

    public native synchronized byte[] certDecrypt(java.lang.String str, byte[] bArr);

    public native synchronized byte[] certEncrypt(java.lang.String str, byte[] bArr);

    public native synchronized byte[] certSign(java.lang.String str, byte[] bArr, byte[] bArr2);

    public native synchronized boolean certVerify(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native synchronized boolean clearAllCert();

    public native synchronized boolean clearAllValue();

    public native synchronized boolean clearCert(java.lang.String str);

    public native synchronized boolean clearToken(java.lang.String str);

    public native synchronized boolean clearTokenSeed(java.lang.String str);

    public native synchronized boolean clearValue(java.lang.String str);

    public native synchronized java.lang.String encryptDataWithSm4(byte[] bArr, int i17);

    public native synchronized java.lang.String encryptGenericDataWithCert(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17);

    public native synchronized java.lang.String encryptPassWithCert(java.lang.String str, byte[] bArr, byte[] bArr2, long j17, java.lang.String str2, int i17, boolean z17);

    public native synchronized java.lang.String encryptPassword(byte[] bArr, byte[] bArr2, long j17, java.lang.String str, int i17);

    public native synchronized int getCaCertVersion();

    public native synchronized long[] getCertValidTime(java.lang.String str);

    public native synchronized java.lang.String getGenericDataHash(java.lang.String str, java.lang.String str2);

    public native synchronized int getLastError();

    public native synchronized java.lang.String getToken(java.lang.String str);

    public native synchronized int getTokenCount(java.lang.String str);

    public native synchronized java.lang.String getTokenHeader(java.lang.String str);

    public native synchronized byte[] getTokenSeed(java.lang.String str);

    public native synchronized byte[] getValue(java.lang.String str);

    public native synchronized java.lang.String getVersion();

    public native synchronized boolean hasCert(java.lang.String str, boolean z17);

    public native synchronized boolean hasValue(java.lang.String str);

    public native synchronized boolean importCert(java.lang.String str, java.lang.String str2, boolean z17);

    public native synchronized boolean init(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    public native synchronized boolean initTsm();

    public native synchronized java.lang.String makeCsr(java.lang.String str, java.lang.String str2);

    public native synchronized byte[] md5(byte[] bArr);

    public native synchronized byte[] randomBytes(int i17);

    public native synchronized void release();

    public native synchronized boolean setToken(java.lang.String str, java.lang.String str2);

    public native synchronized boolean setTokenSeed(java.lang.String str, byte[] bArr);

    public native synchronized boolean setValue(java.lang.String str, byte[] bArr);

    public native synchronized byte[] sha1(byte[] bArr);

    public native synchronized byte[] sha256(byte[] bArr);

    public native synchronized byte[] sm2Decrypt(byte[] bArr, byte[] bArr2);

    public native synchronized byte[] sm2DecryptWithMode(byte[] bArr, byte[] bArr2, int i17);

    public native synchronized byte[] sm2Encrypt(byte[] bArr, byte[] bArr2);

    public native synchronized byte[] sm2EncryptWithMode(byte[] bArr, byte[] bArr2, int i17);

    public native synchronized java.lang.Object[] sm2GenKeyPair();

    public native synchronized byte[] sm2GenPublicKey(byte[] bArr);

    public native synchronized byte[] sm2SealEnvelope(byte[] bArr, byte[] bArr2, int i17);

    public native synchronized byte[] sm2Sign(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native synchronized byte[] sm2SignWithMode(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i17);

    public native synchronized byte[] sm2UnsealEnvelope(byte[] bArr, byte[] bArr2);

    public native synchronized boolean sm2Verify(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native synchronized boolean sm2VerifyWithMode(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i17);

    public native synchronized byte[] sm3(byte[] bArr);

    public native synchronized byte[] sm3Hmac(byte[] bArr, byte[] bArr2);

    public native synchronized byte[] sm4CbcDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z17);

    public native synchronized byte[] sm4CbcEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z17);

    public native synchronized byte[] sm4CtrDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native synchronized byte[] sm4CtrEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native synchronized byte[] sm4GcmDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public native synchronized java.lang.Object[] sm4GcmEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native synchronized boolean updateCaCert(int i17, java.lang.Object[] objArr);
}
