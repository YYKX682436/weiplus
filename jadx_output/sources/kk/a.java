package kk;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.a f308464a = new kk.a();

    public final byte[] a(byte[] encryptedData, byte[] key) {
        kotlin.jvm.internal.o.g(encryptedData, "encryptedData");
        kotlin.jvm.internal.o.g(key, "key");
        try {
            byte[] q17 = kz5.v.q(encryptedData, 0, (encryptedData.length - 12) - 16);
            byte[] q18 = kz5.v.q(encryptedData, (encryptedData.length - 12) - 16, encryptedData.length - 16);
            byte[] x17 = kz5.v.x(q17, kz5.v.q(encryptedData, encryptedData.length - 16, encryptedData.length));
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(key, "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new javax.crypto.spec.GCMParameterSpec(128, q18));
            return cipher.doFinal(x17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AESGCMUtils", e17, "failed to decypt aes-gcm-128 data. " + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    public final byte[] b(byte[] plainData, byte[] key) {
        kotlin.jvm.internal.o.g(plainData, "plainData");
        kotlin.jvm.internal.o.g(key, "key");
        try {
            byte[] bArr = new byte[12];
            new java.security.SecureRandom().nextBytes(bArr);
            javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(key, "AES");
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, new javax.crypto.spec.GCMParameterSpec(128, bArr));
            byte[] doFinal = cipher.doFinal(plainData);
            kotlin.jvm.internal.o.d(doFinal);
            return kz5.v.x(kz5.v.x(kz5.v.q(doFinal, 0, doFinal.length - 16), bArr), kz5.v.q(doFinal, doFinal.length - 16, doFinal.length));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AESGCMUtils", e17, "failed to encrypt aes-gcm-128 data. " + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }
}
