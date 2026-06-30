package com.tenpay.android.wechat;

/* loaded from: classes9.dex */
public final class TenpaySecureEncrypt implements com.tenpay.android.wechat.ISecureEncrypt {
    @Override // com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String desedeEncode(java.lang.String str, java.lang.String str2) {
        return new com.tenpay.ndk.Encrypt().desedeEncode(str);
    }

    @Override // com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String desedeVerifyCode(java.lang.String str, java.lang.String str2) {
        return new com.tenpay.ndk.Encrypt().desedeVerifyCode(str);
    }

    @Override // com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String encryptPasswd(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            str = com.tenpay.android.wechat.TenpayUtil.md5HexDigest(str);
        }
        com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
        if (str2 != null) {
            encrypt.setTimeStamp(str2);
        }
        return encrypt.encryptPasswd(str);
    }

    @Override // com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String encryptPasswdWithRSA2048(boolean z17, java.lang.String str, java.lang.String str2) {
        if (z17) {
            str = com.tenpay.android.wechat.TenpayUtil.md5HexDigest(str);
        }
        com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
        if (str2 != null) {
            encrypt.setTimeStamp(str2);
        }
        return encrypt.encryptPasswdWithRSA2048(str);
    }
}
