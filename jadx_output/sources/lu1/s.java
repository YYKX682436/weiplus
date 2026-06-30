package lu1;

/* loaded from: classes13.dex */
public abstract class s {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
            mac.init(new javax.crypto.spec.SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            java.lang.String encodeToString = android.util.Base64.encodeToString(mac.doFinal(str.getBytes()), 2);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDymanicQrcodeOfflineHelper", "hash is: " + encodeToString);
            return encodeToString;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        byte[] d17 = d(str.getBytes());
        int length = str2.length() / 2;
        byte[] bArr = new byte[length];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 * 2;
            bArr[i17] = java.lang.Integer.valueOf(str2.substring(i18, i18 + 2), 16).byteValue();
        }
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(d17, "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES");
        cipher.init(2, secretKeySpec);
        return new java.lang.String(cipher.doFinal(bArr));
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        byte[] d17 = d(str.getBytes());
        byte[] bytes = str2.getBytes();
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(d17, "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES");
        cipher.init(1, secretKeySpec);
        byte[] doFinal = cipher.doFinal(bytes);
        if (doFinal == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(doFinal.length * 2);
        for (int i17 = 0; i17 < doFinal.length; i17++) {
            sb6.append("0123456789ABCDEF".charAt((doFinal[i17] >> 4) & 15));
            sb6.append("0123456789ABCDEF".charAt(doFinal[i17] & 15));
        }
        return sb6.toString();
    }

    public static byte[] d(byte[] bArr) {
        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance("AES");
        java.security.SecureRandom secureRandom = java.security.SecureRandom.getInstance("SHA1PRNG", "Crypto");
        secureRandom.setSeed(bArr);
        keyGenerator.init(128, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }
}
