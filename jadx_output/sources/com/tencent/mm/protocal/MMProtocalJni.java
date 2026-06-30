package com.tencent.mm.protocal;

/* loaded from: classes12.dex */
public final class MMProtocalJni {
    public static native byte[] aesDecrypt(byte[] bArr, byte[] bArr2);

    public static native int aesDecryptFile(java.lang.String str, java.lang.String str2, byte[] bArr);

    public static native byte[] aesEncrypt(byte[] bArr, byte[] bArr2);

    public static native int compress(byte[] bArr, com.tencent.mm.pointers.PByteArray pByteArray, int i17, int i18);

    public static native int computerKeyWithAllStr(int i17, byte[] bArr, byte[] bArr2, com.tencent.mm.pointers.PByteArray pByteArray, int i18);

    public static native byte[] decodeSecureNotifyData(byte[] bArr, int i17, int i18, int i19, int i27, int i28, int i29, int i37, byte[] bArr2);

    public static native void genClientCheckKVRes(int i17, java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, com.tencent.mm.pointers.PByteArray pByteArray);

    public static native int genSignature(int i17, byte[] bArr, byte[] bArr2);

    public static native int generateECKey(int i17, com.tencent.mm.pointers.PByteArray pByteArray, com.tencent.mm.pointers.PByteArray pByteArray2);

    public static native boolean mergeSyncKey(byte[] bArr, byte[] bArr2, com.tencent.mm.pointers.PByteArray pByteArray);

    public static native boolean pack(byte[] bArr, com.tencent.mm.pointers.PByteArray pByteArray, byte[] bArr2, int i17, byte[] bArr3, java.lang.String str, int i18, int i19, int i27, byte[] bArr4, byte[] bArr5, int i28, int i29, int i37, int i38, int i39, int i47, int i48);

    public static native boolean packDoubleHybrid(com.tencent.mm.pointers.PByteArray pByteArray, byte[] bArr, java.lang.String str, int i17, int i18, int i19, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i27, int i28, int i29);

    public static native boolean packHybrid(com.tencent.mm.pointers.PByteArray pByteArray, byte[] bArr, java.lang.String str, int i17, int i18, int i19, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i27, int i28, int i29);

    public static native boolean packHybridEcdh(com.tencent.mm.pointers.PByteArray pByteArray, byte[] bArr, java.lang.String str, int i17, int i18, int i19, byte[] bArr2, int i27, int i28, int i29, int i37);

    public static native boolean rsaPublicEncrypt(byte[] bArr, com.tencent.mm.pointers.PByteArray pByteArray, byte[] bArr2, byte[] bArr3);

    public static native boolean rsaPublicEncryptPemkey(byte[] bArr, com.tencent.mm.pointers.PByteArray pByteArray, byte[] bArr2);

    public static native boolean setClientPackVersion(int i17);

    public static native void setDeviceTypeId(int i17);

    public static native void setIsLite(boolean z17);

    public static native boolean setProtocalJniLogLevel(int i17);

    public static native boolean unpack(com.tencent.mm.pointers.PByteArray pByteArray, byte[] bArr, byte[] bArr2, com.tencent.mm.pointers.PByteArray pByteArray2, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2, com.tencent.mm.pointers.PInt pInt3, com.tencent.mm.pointers.PInt pInt4, com.tencent.mm.pointers.PInt pInt5, com.tencent.mm.pointers.PInt pInt6, com.tencent.mm.pointers.PInt pInt7);

    public static native boolean verifySyncKey(byte[] bArr);
}
