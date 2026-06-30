package com.tenpay.android.wechat;

/* loaded from: classes9.dex */
public class TenpayUtil {
    public static final int getResourceDeclareStyleableIndex(android.content.Context context, java.lang.String str) {
        try {
            java.lang.reflect.Field[] fields = java.lang.Class.forName(context.getPackageName() + ".R$styleable").getFields();
            int length = fields.length;
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.reflect.Field field = fields[i17];
                if (field.getName().equals(str)) {
                    return field.getInt(null);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return 0;
    }

    public static final int[] getResourceDeclareStyleableIntArray(android.content.Context context, java.lang.String str) {
        try {
            for (java.lang.reflect.Field field : java.lang.Class.forName(context.getPackageName() + ".R$styleable").getFields()) {
                if (field.getName().equals(str)) {
                    return (int[]) field.get(null);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    public static boolean invalidateID(java.lang.String str) {
        if (str == null || str.length() != 18) {
            return false;
        }
        int[] iArr = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] cArr = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        int i17 = 0;
        int i18 = 0;
        while (i17 < str.length() - 1) {
            try {
                int i19 = i17 + 1;
                i18 += com.tencent.mm.sdk.platformtools.t8.D1(str.substring(i17, i19), 0) * iArr[i17];
                i17 = i19;
            } catch (java.lang.NumberFormatException unused) {
                return false;
            }
        }
        int i27 = i18 % 11;
        char charAt = str.charAt(17);
        if (i27 == 2) {
            if (charAt != 'X' && charAt != 'x') {
                return false;
            }
        } else if (charAt != cArr[i27]) {
            return false;
        }
        return true;
    }

    public static java.lang.String md5HexDigest(java.lang.String str) {
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

    public static java.lang.String signWith3Des(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.tenpay.ndk.Encrypt().desedeEncode(md5HexDigest(str));
    }

    public static byte[] sm4DecryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return null;
        }
        return new com.tenpay.ndk.Encrypt().sm4DecryptCBC(bArr, bArr2, bArr3);
    }

    public static byte[] sm4EncryptCBC(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return null;
        }
        return new com.tenpay.ndk.Encrypt().sm4EncryptCBC(bArr, bArr2, bArr3);
    }
}
