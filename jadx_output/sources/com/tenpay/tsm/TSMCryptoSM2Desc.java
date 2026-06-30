package com.tenpay.tsm;

/* loaded from: classes16.dex */
public class TSMCryptoSM2Desc {
    public static byte[] decrypt(java.lang.String str, byte[] bArr, com.tenpay.tsm.TSMTypes.SM2CipherFormat sM2CipherFormat) {
        byte[][] bArr2 = new byte[1];
        int TSMCryptoDescSM2Decrypt = com.tenpay.utils.SMUtilsV2.TSMCryptoDescSM2Decrypt(str, bArr, sM2CipherFormat.ordinal(), bArr2);
        if (TSMCryptoDescSM2Decrypt == 0) {
            return bArr2[0];
        }
        throw new com.tenpay.tsm.TSMException(TSMCryptoDescSM2Decrypt);
    }

    public static byte[] encrypt(java.lang.String str, byte[] bArr, com.tenpay.tsm.TSMTypes.SM2CipherFormat sM2CipherFormat) {
        byte[][] bArr2 = new byte[1];
        int TSMCryptoDescSM2Encrypt = com.tenpay.utils.SMUtilsV2.TSMCryptoDescSM2Encrypt(str, bArr, sM2CipherFormat.ordinal(), bArr2);
        if (TSMCryptoDescSM2Encrypt == 0) {
            return bArr2[0];
        }
        throw new com.tenpay.tsm.TSMException(TSMCryptoDescSM2Encrypt);
    }

    public static byte[] sign(java.lang.String str, byte[] bArr, java.lang.String str2, com.tenpay.tsm.TSMTypes.SM2SignFormat sM2SignFormat) {
        byte[][] bArr2 = new byte[1];
        int TSMCryptoDescSM2Sign = com.tenpay.utils.SMUtilsV2.TSMCryptoDescSM2Sign(str, bArr, str2, sM2SignFormat.ordinal(), bArr2);
        if (TSMCryptoDescSM2Sign == 0) {
            return bArr2[0];
        }
        throw new com.tenpay.tsm.TSMException(TSMCryptoDescSM2Sign);
    }

    public static boolean verify(java.lang.String str, byte[] bArr, java.lang.String str2, byte[] bArr2, com.tenpay.tsm.TSMTypes.SM2SignFormat sM2SignFormat) {
        int TSMCryptoDescSM2Verify = com.tenpay.utils.SMUtilsV2.TSMCryptoDescSM2Verify(str, bArr, str2, bArr2, sM2SignFormat.ordinal());
        if (-51003 == TSMCryptoDescSM2Verify) {
            return false;
        }
        if (TSMCryptoDescSM2Verify == 0) {
            return true;
        }
        throw new com.tenpay.tsm.TSMException(TSMCryptoDescSM2Verify);
    }
}
