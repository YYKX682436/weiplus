package com.tenpay.android.wechat;

/* loaded from: classes9.dex */
public interface ISecureEncrypt {
    java.lang.String desedeEncode(java.lang.String str, java.lang.String str2);

    java.lang.String desedeVerifyCode(java.lang.String str, java.lang.String str2);

    java.lang.String encryptPasswd(boolean z17, java.lang.String str, java.lang.String str2);

    java.lang.String encryptPasswdWithRSA2048(boolean z17, java.lang.String str, java.lang.String str2);
}
