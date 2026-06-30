package com.tenpay.bankcard;

/* loaded from: classes9.dex */
public class BankCardReg {
    private static final java.lang.String TAG = "MyTag";

    public static java.lang.String getBankCardSegmentNumber(java.lang.String str, int i17, int[] iArr) {
        com.tenpay.bankcard.LogUtil.d(TAG, "getBankCardSegmentNumber");
        com.tenpay.bankcard.LogUtil.d(TAG, "cardNum=" + str);
        com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
        java.lang.String desedeDecode = encrypt.desedeDecode(str, encrypt.getRandomKey());
        com.tenpay.bankcard.LogUtil.d(TAG, "cardNum=" + desedeDecode);
        java.lang.String bankCardSegmentNumber = com.tencent.bankcardrecog.BankCardRecog.getBankCardSegmentNumber(desedeDecode, i17, iArr);
        com.tenpay.bankcard.LogUtil.d(TAG, bankCardSegmentNumber);
        return encrypt.desedeEncode(bankCardSegmentNumber, encrypt.getRandomKey());
    }

    public static int recognizeBankCardGetVersion() {
        return com.tencent.bankcardrecog.BankCardRecog.recognizeBankCardGetVersion();
    }

    public static int recognizeBankCardInit(int i17, int i18, boolean z17) {
        return com.tencent.bankcardrecog.BankCardRecog.recognizeBankCardInit(i17, i18, z17);
    }

    public static int recognizeBankCardProcess(byte[] bArr, com.tencent.bankcardrecog.BankCardInfo bankCardInfo, boolean[] zArr) {
        return com.tencent.bankcardrecog.BankCardRecog.recognizeBankCardProcess(bArr, bankCardInfo, zArr);
    }

    public static int recognizeBankCardRelease() {
        return com.tencent.bankcardrecog.BankCardRecog.recognizeBankCardRelease();
    }
}
