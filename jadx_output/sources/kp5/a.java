package kp5;

/* loaded from: classes12.dex */
public class a extends com.tenpay.android.wechat.PayuSecureEncrypt {
    public a(int i17) {
        this.mEncrptType = i17;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        int i17 = this.mEncrptType;
        if (i17 != 40 && i17 != -20) {
            str = str.replaceAll(" ", "");
        }
        int i18 = this.mEncrptType;
        if (i18 != -20 && i18 != -10) {
            if (i18 == 20 || i18 == 30 || i18 == 40 || i18 == 50) {
                return b(false, str, str2);
            }
            if (i18 != 60) {
                return str;
            }
        }
        return b(true, str, str2);
    }

    public final java.lang.String b(boolean z17, java.lang.String str, java.lang.String str2) {
        int i17 = this.mEncrptType;
        int i18 = -20 == i17 ? 40 : -10 == i17 ? 20 : i17;
        java.lang.String str3 = (i17 == -10 || i17 == -20 || i17 == 60) ? com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH : com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i18);
        sb6.append("|");
        sb6.append(str3);
        sb6.append("|");
        sb6.append(str2);
        sb6.append("|");
        if (z17) {
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        } else {
            sb6.append(str);
        }
        try {
            byte[] bytes = sb6.toString().getBytes();
            com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
            if (!com.tencent.mm.protocal.MMProtocalJni.rsaPublicEncrypt(bytes, pByteArray, getRsaEKey().getBytes(com.tencent.mapsdk.internal.rv.f51270c), getRsaNKey().getBytes(com.tencent.mapsdk.internal.rv.f51270c))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxPayuSecureEncrypt", "MMProtocalJni encrypt failed!");
            }
            return "01" + android.util.Base64.encodeToString(pByteArray.value, 2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxPayuSecureEncrypt", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tenpay.android.wechat.PayuSecureEncrypt, com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String desedeEncode(java.lang.String str, java.lang.String str2) {
        return a(str, str2);
    }

    @Override // com.tenpay.android.wechat.PayuSecureEncrypt, com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String desedeVerifyCode(java.lang.String str, java.lang.String str2) {
        return a(str, str2);
    }

    @Override // com.tenpay.android.wechat.PayuSecureEncrypt, com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String encryptPasswd(boolean z17, java.lang.String str, java.lang.String str2) {
        return a(str, str2);
    }
}
