package qp5;

/* loaded from: classes9.dex */
public abstract class z {
    public static java.lang.String a(int i17, com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText, long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.IEncryptDelegate", "is tenpay. encrypt with tenpay");
        if (j17 == 0) {
            j17 = c01.id.a() / 1000;
        }
        long j18 = j17;
        switch (i17) {
            case 0:
                com.tencent.mm.wallet_core.b.a().g();
                return tenpaySecureEditText.getEncryptDataWithHash(false, true);
            case 1:
                com.tencent.mm.wallet_core.b.a().g();
                return tenpaySecureEditText.getEncryptDataWithHash(true, true);
            case 2:
                return tenpaySecureEditText.get3DesEncrptData();
            case 3:
                return tenpaySecureEditText.get3DesVerifyCode();
            case 4:
                return tenpaySecureEditText.getEncryptPassword(com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.SM2_WITH_MD5, j18, str);
            case 5:
                return tenpaySecureEditText.getEncryptPassword(com.tenpay.android.wechat.TenpaySecureEditText.EncryptMode.SM2_WITH_PBKDF2, j18, str);
            case 6:
                return tenpaySecureEditText.getHKSoftEncryptPassword(com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode.HKSOFT_RSA2048_WITH_MD5, j18, str, str2);
            case 7:
                return tenpaySecureEditText.getHKSoftEncryptPassword(com.tenpay.android.wechat.TenpaySecureEditText.HKSoftEncryMode.HKSOFT_RSA2048_WITH_PBKDF2, j18, str, str2);
            default:
                return tenpaySecureEditText.getText().toString() == null ? "" : tenpaySecureEditText.getText().toString();
        }
    }
}
