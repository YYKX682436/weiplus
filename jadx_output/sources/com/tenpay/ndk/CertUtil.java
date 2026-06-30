package com.tenpay.ndk;

/* loaded from: classes9.dex */
public class CertUtil {
    public static final java.lang.String TAG = "CertUtil";
    private static com.tenpay.ndk.CertUtil instance;
    private java.lang.String cert_dir;
    private java.lang.String priv_dir;
    private java.lang.String publ_dir;
    private java.lang.String token_dir;
    private com.tenpay.ndk.CertUtil.EventListener eventListener = null;
    private java.lang.String qq_id = null;
    private java.lang.String login_ip = null;
    private java.lang.String svr_cert = null;
    private java.lang.String cert_id = null;
    private java.lang.String sig_raw_buf = null;
    private java.lang.String plain_buf = null;
    private byte[] plain_buf2 = null;
    private java.lang.String token = null;
    private byte[] token_buf = null;
    private int token_len = 0;
    private byte[] csr_buf = null;
    private byte[] sig_buf = null;
    private byte[] cipher_buf = null;
    private byte[] certid_buf = null;
    private java.lang.String mac = null;
    private java.lang.String imsi = null;
    private java.lang.String iccid = null;
    private java.lang.String imei = null;
    private java.lang.String softid = null;
    private java.lang.String deskey = null;
    private java.lang.String sm4Key = null;
    private int useSM4 = 0;
    private android.content.Context mContext = null;

    /* loaded from: classes9.dex */
    public interface EventListener {
        java.lang.String getUniqueID();

        void onEvent(int i17, java.lang.String str);
    }

    private CertUtil() {
    }

    private void checkDir(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            r6Var.J();
        } else {
            if (r6Var.y()) {
                return;
            }
            r6Var.l();
            r6Var.J();
        }
    }

    private boolean create_dir(java.lang.String str) {
        try {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                return true;
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
            if (m18.a()) {
                return m18.f213266a.r(m18.f213267b);
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private native byte[] decrypt(byte[] bArr, byte[] bArr2);

    private boolean del_all_files(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y()) {
            return false;
        }
        java.lang.String[] D = r6Var.D();
        boolean z17 = false;
        for (int i17 = 0; i17 < D.length; i17++) {
            com.tencent.mm.vfs.r6 r6Var2 = str.endsWith("/") ? new com.tencent.mm.vfs.r6(str + D[i17]) : new com.tencent.mm.vfs.r6(str + "/" + D[i17]);
            if (r6Var2.A()) {
                r6Var2.l();
            } else if (r6Var2.y()) {
                del_all_files(str + "/" + D[i17]);
                del_dir(str + "/" + D[i17], true);
                z17 = true;
            }
        }
        return z17;
    }

    private void del_dir(java.lang.String str, boolean z17) {
        try {
            del_all_files(str);
            if (z17) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str.toString());
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (m17.a()) {
                    m17.f213266a.d(m17.f213267b);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    private native boolean encrypt();

    private native long expireTime();

    private native boolean genCertApplyCsr();

    private native boolean genCertApplyCsrNew(int i17);

    private native boolean genQrcode();

    private java.lang.String getCertDir() {
        return this.mContext.getFilesDir().getParentFile().getAbsolutePath() + "/cert";
    }

    private native boolean getCertid();

    public static com.tenpay.ndk.CertUtil getInstance() {
        if (instance == null) {
            synchronized (com.tenpay.ndk.CertUtil.class) {
                instance = new com.tenpay.ndk.CertUtil();
            }
        }
        return instance;
    }

    private native boolean getToken();

    private native int getTokenCount();

    private java.lang.String hexdigest(java.lang.String str) {
        if (str == null) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[32];
            int i17 = 0;
            for (int i18 = 0; i18 < 16; i18++) {
                byte b17 = digest[i18];
                int i19 = i17 + 1;
                cArr2[i17] = cArr[(b17 >>> 4) & 15];
                i17 = i19 + 1;
                cArr2[i19] = cArr[b17 & 15];
            }
            return new java.lang.String(cArr2);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private native boolean importCert();

    private native boolean isCertExist();

    private boolean isNotEmptyDir(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        return r6Var.m() && r6Var.y() && r6Var.G() != null;
    }

    private boolean isNullOrEmpty(java.lang.String str) {
        return str == null || str.length() == 0;
    }

    private boolean isValidDir(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        return r6Var.m() && r6Var.y();
    }

    private void onNativeEvent(int i17, java.lang.String str) {
        com.tenpay.ndk.CertUtil.EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.onEvent(i17, str);
        }
    }

    private void setAndCheckDir(java.lang.String str) {
        java.lang.String certDir = getCertDir();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(certDir);
        sb6.append("/");
        sb6.append(hexdigest(str + this.imei));
        java.lang.String sb7 = sb6.toString();
        this.cert_dir = sb7 + "/cert";
        this.priv_dir = sb7 + "/priv";
        this.publ_dir = sb7 + "/publ";
        this.token_dir = sb7 + "/auth";
        checkDir(certDir);
        checkDir(this.token_dir);
    }

    private void setDir(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(getCertDir());
        sb6.append("/");
        sb6.append(hexdigest(str + this.imei));
        java.lang.String sb7 = sb6.toString();
        this.cert_dir = sb7 + "/cert";
        this.priv_dir = sb7 + "/priv";
        this.publ_dir = sb7 + "/publ";
        this.token_dir = sb7 + "/auth";
    }

    private native boolean setToken();

    private native boolean usrSig(byte[] bArr);

    public synchronized void clearAllCert() {
        del_dir(getCertDir(), true);
    }

    public synchronized void clearCert(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(getCertDir());
        sb6.append("/");
        sb6.append(hexdigest(str + this.imei));
        del_dir(sb6.toString(), true);
    }

    public synchronized void clearToken(java.lang.String str) {
        if (isNullOrEmpty(str)) {
            return;
        }
        setDir(str);
        del_dir(this.token_dir, true);
    }

    public synchronized java.lang.String decrypt(java.lang.String str, java.lang.String str2) {
        if (!isNullOrEmpty(str) && !isNullOrEmpty(str2)) {
            setAndCheckDir(str);
            if (isNotEmptyDir(this.cert_dir) && isNotEmptyDir(this.publ_dir) && isNotEmptyDir(this.priv_dir)) {
                byte[] decode = android.util.Base64.decode(str2.getBytes(), 0);
                if (decode != null && decode.length != 0) {
                    this.cert_id = str;
                    this.cipher_buf = null;
                    byte[] decrypt = decrypt(str.getBytes(), decode);
                    if (decrypt == null) {
                        return null;
                    }
                    return android.util.Base64.encodeToString(decrypt, 0);
                }
                com.tencent.mars.xlog.Log.e(TAG, "base64 decode data fail, %s", str2);
                return null;
            }
            return null;
        }
        return null;
    }

    public synchronized java.lang.String encrypt(java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        java.lang.String str3 = null;
        if (!isNullOrEmpty(str) && !isNullOrEmpty(str2)) {
            setAndCheckDir(str);
            if (isNotEmptyDir(this.cert_dir) && isNotEmptyDir(this.publ_dir) && isNotEmptyDir(this.priv_dir)) {
                this.cert_id = str;
                this.plain_buf = str2;
                this.cipher_buf = null;
                if (encrypt() && (bArr = this.cipher_buf) != null) {
                    try {
                        str3 = new java.lang.String(bArr, com.tencent.mapsdk.internal.rv.f51270c);
                    } catch (java.lang.Exception unused) {
                        return null;
                    }
                }
                return str3;
            }
            return null;
        }
        return null;
    }

    public native byte[] encryptWithPubkey(byte[] bArr, byte[] bArr2, boolean z17);

    public synchronized byte[] genQrcode(java.lang.String str, byte[] bArr, java.lang.String str2) {
        byte[] bArr2 = null;
        if (!isNullOrEmpty(str) && !isNullOrEmpty(str2) && bArr != null && bArr.length != 0) {
            setAndCheckDir(str);
            if (isNotEmptyDir(this.cert_dir) && isNotEmptyDir(this.publ_dir) && isNotEmptyDir(this.priv_dir)) {
                this.cert_id = str;
                this.plain_buf2 = bArr;
                this.cipher_buf = null;
                this.token = str2;
                if (genQrcode()) {
                    byte[] bArr3 = this.cipher_buf;
                    if (bArr3 != null) {
                        bArr2 = bArr3;
                    }
                }
                return bArr2;
            }
            return null;
        }
        return null;
    }

    public synchronized java.lang.String genUserSig(java.lang.String str, byte[] bArr) {
        byte[] bArr2;
        java.lang.String str2 = null;
        if (!isNullOrEmpty(str) && bArr != null && bArr.length != 0) {
            setAndCheckDir(str);
            if (isNotEmptyDir(this.cert_dir) && isNotEmptyDir(this.publ_dir) && isNotEmptyDir(this.priv_dir)) {
                this.cert_id = str;
                this.sig_buf = null;
                if (usrSig(bArr) && (bArr2 = this.sig_buf) != null) {
                    try {
                        str2 = new java.lang.String(bArr2, com.tencent.mapsdk.internal.rv.f51270c);
                    } catch (java.lang.Exception unused) {
                        return null;
                    }
                }
                return str2;
            }
            return null;
        }
        return null;
    }

    public synchronized java.lang.String getCertApplyCSR(java.lang.String str) {
        java.lang.String str2;
        byte[] bArr;
        this.qq_id = str;
        str2 = null;
        this.csr_buf = null;
        if (genCertApplyCsr() && (bArr = this.csr_buf) != null) {
            try {
                str2 = new java.lang.String(bArr, "ASCII");
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return str2;
    }

    public native int getLastError();

    public synchronized java.lang.String getToken(java.lang.String str) {
        byte[] bArr;
        java.lang.String str2 = null;
        if (isNullOrEmpty(str)) {
            return null;
        }
        setAndCheckDir(str);
        if (!isNotEmptyDir(this.token_dir)) {
            return null;
        }
        this.cert_id = str;
        if (getTokenCount() <= 0) {
            return null;
        }
        if (getToken() && (bArr = this.token_buf) != null) {
            try {
                str2 = new java.lang.String(bArr, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return str2;
    }

    public synchronized int getTokenCount(java.lang.String str) {
        if (isNullOrEmpty(str)) {
            return 0;
        }
        setDir(str);
        this.cert_id = str;
        return getTokenCount();
    }

    public synchronized boolean importCert(java.lang.String str, java.lang.String str2) {
        if (str2.length() <= 0) {
            return false;
        }
        try {
            this.svr_cert = new java.lang.String(str2.getBytes(), "ASCII");
        } catch (java.lang.Exception unused) {
        }
        clearCert(str);
        setAndCheckDir(str);
        create_dir(this.cert_dir);
        create_dir(this.priv_dir);
        create_dir(this.publ_dir);
        return importCert();
    }

    public void init(android.content.Context context, com.tenpay.ndk.CertUtil.EventListener eventListener) {
        this.eventListener = eventListener;
        this.mContext = context.getApplicationContext();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String uniqueID = eventListener.getUniqueID();
        this.deskey = uniqueID;
        this.imei = uniqueID;
    }

    public synchronized boolean isCertExist(java.lang.String str) {
        if (isNullOrEmpty(str)) {
            return false;
        }
        setDir(str);
        if (!isNotEmptyDir(this.cert_dir) || !isNotEmptyDir(this.publ_dir) || !isNotEmptyDir(this.priv_dir)) {
            return false;
        }
        this.cert_id = str;
        return isCertExist();
    }

    public void setEventListener(com.tenpay.ndk.CertUtil.EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public synchronized boolean setTokens(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        if (!isNullOrEmpty(str) && !isNullOrEmpty(str2)) {
            if (z17 && (str3 == null || str3.length() != 16)) {
                return false;
            }
            setAndCheckDir(str);
            if (!isValidDir(this.cert_dir)) {
                return false;
            }
            if (!isValidDir(this.token_dir)) {
                return false;
            }
            this.useSM4 = z17 ? 1 : 0;
            this.sm4Key = str3;
            this.cert_id = str;
            this.token = str2;
            this.token_len = str2.length();
            return setToken();
        }
        return false;
    }

    public synchronized java.lang.String getCertApplyCSR(java.lang.String str, int i17) {
        java.lang.String str2;
        byte[] bArr;
        this.qq_id = str;
        str2 = null;
        this.csr_buf = null;
        if (genCertApplyCsrNew(i17) && (bArr = this.csr_buf) != null) {
            try {
                str2 = new java.lang.String(bArr, "ASCII");
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return str2;
    }

    public synchronized java.lang.String genUserSig(java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        java.lang.String str3 = null;
        if (!isNullOrEmpty(str) && !isNullOrEmpty(str2)) {
            setAndCheckDir(str);
            if (isNotEmptyDir(this.cert_dir) && isNotEmptyDir(this.publ_dir) && isNotEmptyDir(this.priv_dir)) {
                if (str != null && str2 != null && str.length() > 0 && str2.length() > 0) {
                    this.cert_id = str;
                    this.sig_raw_buf = str2;
                    this.sig_buf = null;
                    if (usrSig(str2.getBytes()) && (bArr = this.sig_buf) != null) {
                        try {
                            str3 = new java.lang.String(bArr, com.tencent.mapsdk.internal.rv.f51270c);
                        } catch (java.lang.Exception unused) {
                            return null;
                        }
                    }
                    return str3;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
