package com.tenpay.utils;

/* loaded from: classes16.dex */
public class SMUtilsV2 {
    public static final java.lang.String LIB_NAME = "tsmsc";
    private static boolean isLoadSuccess;
    private static com.tenpay.utils.SMUtilsV2 mInstance;

    static {
        com.tenpay.ndk.FitScLibraryLoader.load(LIB_NAME);
        mInstance = null;
    }

    public static native int TSMAllocCount();

    public static native int TSMCryptoDescSM2Decrypt(java.lang.String str, byte[] bArr, int i17, byte[][] bArr2);

    public static native int TSMCryptoDescSM2Encrypt(java.lang.String str, byte[] bArr, int i17, byte[][] bArr2);

    public static native int TSMCryptoDescSM2Sign(java.lang.String str, byte[] bArr, java.lang.String str2, int i17, byte[][] bArr2);

    public static native int TSMCryptoDescSM2Verify(java.lang.String str, byte[] bArr, java.lang.String str2, byte[] bArr2, int i17);

    public static native int TSMCryptoDescSM4CBCDecrypt(java.lang.String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    public static native int TSMCryptoDescSM4CBCEncrypt(java.lang.String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    public static native int TSMCryptoDescSM4CTRDecrypt(java.lang.String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    public static native int TSMCryptoDescSM4CTREncrypt(java.lang.String str, byte[] bArr, byte[] bArr2, byte[][] bArr3);

    public static native int TSMCryptoDescSM4ECBDecrypt(java.lang.String str, byte[] bArr, byte[][] bArr2);

    public static native int TSMCryptoDescSM4ECBEncrypt(java.lang.String str, byte[] bArr, byte[][] bArr2);

    public static native int TSMCryptoDescSM4GCMDecrypt(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][] bArr5);

    public static native int TSMCryptoDescSM4GCMEncrypt(java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[][] bArr4, byte[][] bArr5);

    public static native int TSMStorageCheckSM2PriKey(java.lang.String str);

    public static native int TSMStorageCheckSM2PubKey(java.lang.String str);

    public static native int TSMStorageCheckSM4Key(java.lang.String str);

    public static native int TSMStorageDeleteSM2PriKey(java.lang.String str);

    public static native int TSMStorageDeleteSM2PubKey(java.lang.String str);

    public static native int TSMStorageDeleteSM4Key(java.lang.String str);

    public static native int TSMStorageExportSM2PriKey(java.lang.String str, int i17, java.lang.String[] strArr, java.lang.String[] strArr2);

    public static native int TSMStorageExportSM2PubKey(java.lang.String str, int i17, java.lang.String[] strArr);

    public static native int TSMStorageExportSM4Key(java.lang.String str, byte[][] bArr);

    public static native int TSMStorageGenerateSM2KeyPair(java.lang.String str);

    public static native int TSMStorageGenerateSM4Key(java.lang.String str);

    public static native int TSMStorageImportSM2PriKey(java.lang.String str, java.lang.String str2, int i17);

    public static native int TSMStorageImportSM2PubKey(java.lang.String str, java.lang.String str2, int i17);

    public static native int TSMStorageImportSM4Key(java.lang.String str, byte[] bArr);

    public static native int TSMStorageInit(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static native int TSMStorageUpdateSM2PriKey(java.lang.String str, java.lang.String str2, int i17);

    public static native int TSMStorageUpdateSM2PubKey(java.lang.String str, java.lang.String str2, int i17);

    public static native int TSMStorageUpdateSM4Key(java.lang.String str, byte[] bArr);

    public static com.tenpay.utils.SMUtilsV2 getInstance() {
        if (mInstance == null) {
            synchronized (com.tenpay.utils.SMUtilsV2.class) {
                if (mInstance == null) {
                    mInstance = new com.tenpay.utils.SMUtilsV2();
                }
            }
        }
        return mInstance;
    }

    public static boolean isLoadOK() {
        return isLoadSuccess;
    }
}
