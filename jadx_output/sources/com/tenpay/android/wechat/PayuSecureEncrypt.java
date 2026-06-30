package com.tenpay.android.wechat;

/* loaded from: classes12.dex */
public class PayuSecureEncrypt implements com.tenpay.android.wechat.ISecureEncrypt {
    protected static final java.lang.String CHARSET = "UTF-8";
    public static final java.lang.String ENCRYPT_VERSION_DEFAULT = "10";
    public static final java.lang.String ENCRYPT_VERSION_HASH = "30";
    private static final java.lang.String RSA_E_KEY = "10001";
    private static final java.lang.String RSA_N_KEY = "b2f690b296060c441416f269e2eea0e8279e139b43c7e9e7d16a2bed62cba4e9456a5071154e8929a016c70ec64a05c47e4854b933ca85ada97f75335ff3de9aa998c1f5b63b14e0bbea3392fd159c53e5a2b14b0698e1061e9410380565206f5427681f845f1932a42320646ab69a41a1becdb083048d8d045ce5f4aee88e35";
    protected int mEncrptType = 0;

    /* loaded from: classes11.dex */
    public interface EncrptType {
        public static final int CARD_NUMBER = 50;
        public static final int CVV = 30;
        public static final int DEFAULT = 0;
        public static final int HASHED_PASSWORD = -10;
        public static final int HASHED_SECRET_ANSWER = -20;
        public static final int PASSWORD = 20;
        public static final int SECRET_ANSWER = 40;
        public static final int VERIFY_CODE = 60;
    }

    @Override // com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String desedeEncode(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String desedeVerifyCode(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String encryptPasswd(boolean z17, java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // com.tenpay.android.wechat.ISecureEncrypt
    public java.lang.String encryptPasswdWithRSA2048(boolean z17, java.lang.String str, java.lang.String str2) {
        return "";
    }

    public java.lang.String getRsaEKey() {
        return new java.lang.String(RSA_E_KEY);
    }

    public java.lang.String getRsaNKey() {
        return new java.lang.String(RSA_N_KEY);
    }

    public void setEncryptType(int i17) {
        this.mEncrptType = i17;
    }
}
