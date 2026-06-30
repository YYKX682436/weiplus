package com.tenpay.ndk;

/* loaded from: classes9.dex */
public class Encrypt {
    private static final java.lang.String CHARSET = "UTF-8";
    private byte[] dec_buf;
    private byte[] enc_buf;
    private byte[] enc_passwd;
    private byte[] key_buf;
    private byte[] raw_buf;
    private byte[] raw_passwd;
    private java.lang.String server_time_stamp = "0";
    private int time_stamp;

    public static native byte[] aesDecryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] aesEncryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3);

    private native boolean decrypt(byte[] bArr, byte[] bArr2);

    private native boolean encrypt(byte[] bArr, byte[] bArr2);

    private native boolean encryptPasswdWithRSA(byte b17, byte[] bArr, int i17);

    private native boolean encryptVerifyCode(byte[] bArr);

    private native byte[] encryptWithRSA(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17);

    private native byte[] getRandom();

    private static byte[] hexToBytes(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || str.length() % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i17 = 0; i17 < str.length(); i17 += 2) {
            bArr[i17 / 2] = (byte) ((java.lang.Character.digit(str.charAt(i17), 16) << 4) + java.lang.Character.digit(str.charAt(i17 + 1), 16));
        }
        return bArr;
    }

    public java.lang.String desedeDecode(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null || str.length() <= 0) {
            return null;
        }
        try {
            this.raw_buf = str.getBytes("UTF-8");
            byte[] bytes = str2.getBytes("UTF-8");
            this.key_buf = bytes;
            decrypt(bytes, this.raw_buf);
            byte[] bArr = this.dec_buf;
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String desedeEncode(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.raw_buf = bytes;
            encrypt(null, bytes);
            byte[] bArr = this.enc_buf;
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String desedeVerifyCode(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.raw_buf = bytes;
            encryptVerifyCode(bytes);
            byte[] bArr = this.enc_buf;
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public java.lang.String encryptPasswd(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.raw_passwd = bytes;
            encryptPasswdWithRSA((byte) 2, bytes, 0);
            byte[] bArr = this.enc_passwd;
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        if (encryptPasswdWithRSA((byte) 2, r6, 1) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String encryptPasswdWithRSA2048(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "V01_"
            r1 = 0
            if (r6 == 0) goto L35
            int r2 = r6.length()
            if (r2 <= 0) goto L35
            r5.raw_passwd = r1
            r5.enc_passwd = r1
            int r2 = r6.length()
            java.lang.String r3 = "UTF-8"
            if (r2 <= 0) goto L26
            byte[] r6 = r6.getBytes(r3)     // Catch: java.lang.Exception -> L25
            r5.raw_passwd = r6     // Catch: java.lang.Exception -> L25
            r2 = 2
            r4 = 1
            boolean r6 = r5.encryptPasswdWithRSA(r2, r6, r4)
            if (r6 != 0) goto L26
        L25:
            return r1
        L26:
            byte[] r6 = r5.enc_passwd
            if (r6 != 0) goto L2b
            return r1
        L2b:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L35
            r2.<init>(r6, r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = r0.concat(r2)     // Catch: java.lang.Exception -> L35
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tenpay.ndk.Encrypt.encryptPasswdWithRSA2048(java.lang.String):java.lang.String");
    }

    public java.lang.String encryptWithRSA1024(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] encryptWithRSA = encryptWithRSA(str.getBytes(), hexToBytes(str2), hexToBytes(str3), 0);
        if (encryptWithRSA == null) {
            return null;
        }
        return android.util.Base64.encodeToString(encryptWithRSA, 0);
    }

    public java.lang.String encryptWithRSA2048(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] encryptWithRSA = encryptWithRSA(str.getBytes(), hexToBytes(str2), hexToBytes(str3), 1);
        if (encryptWithRSA == null) {
            return null;
        }
        return android.util.Base64.encodeToString(encryptWithRSA, 0);
    }

    public java.lang.String getPasswdTimeStamp() {
        return java.lang.String.valueOf(this.time_stamp);
    }

    public java.lang.String getRandomKey() {
        byte[] random = getRandom();
        if (random != null) {
            try {
                return new java.lang.String(random, "UTF-8");
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        return null;
    }

    public void setTimeStamp(java.lang.String str) {
        this.server_time_stamp = str;
    }

    public native byte[] sm4DecryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native byte[] sm4EncryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public java.lang.String desedeEncode(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null || str.length() <= 0) {
            return null;
        }
        try {
            this.raw_buf = str.getBytes("UTF-8");
            byte[] bytes = str2.getBytes("UTF-8");
            this.key_buf = bytes;
            encrypt(bytes, this.raw_buf);
            byte[] bArr = this.enc_buf;
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
