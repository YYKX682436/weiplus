package tz2;

/* loaded from: classes13.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f423325a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f423326b = false;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f423327c = "";

    /* renamed from: d, reason: collision with root package name */
    public static byte[] f423328d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f423329e;

    public static final byte[] a(java.lang.String str, java.lang.String str2) {
        byte[] copyOf;
        javax.crypto.Mac mac;
        if (str == null || str2 == null) {
            return new byte[0];
        }
        try {
            if (!kotlin.jvm.internal.o.b(str, f423329e) || (copyOf = f423328d) == null) {
                try {
                    byte[] bArr = new byte[16];
                    new java.security.SecureRandom().nextBytes(bArr);
                    mac = javax.crypto.Mac.getInstance("HmacSHA256");
                    javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "HmacSHA256");
                    if (mac != null) {
                        mac.init(secretKeySpec);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "generateSM4Key HMAC failed, fallback to bioId bytes", new java.lang.Object[0]);
                    byte[] bytes = str.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    copyOf = java.util.Arrays.copyOf(bytes, 16);
                    kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
                }
                if (mac != null) {
                    byte[] bytes2 = str.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                    byte[] doFinal = mac.doFinal(bytes2);
                    if (doFinal != null) {
                        copyOf = java.util.Arrays.copyOf(doFinal, 16);
                        kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
                        f423328d = copyOf;
                        f423329e = str;
                    }
                }
                byte[] bytes3 = str.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes3, "getBytes(...)");
                copyOf = java.util.Arrays.copyOf(bytes3, 16);
                kotlin.jvm.internal.o.f(copyOf, "copyOf(...)");
                f423328d = copyOf;
                f423329e = str;
            }
            java.nio.charset.Charset charset = r26.c.f368865a;
            byte[] bytes4 = str.getBytes(charset);
            kotlin.jvm.internal.o.f(bytes4, "getBytes(...)");
            byte[] h17 = kk.k.h(bytes4);
            byte[] bytes5 = str2.getBytes(charset);
            kotlin.jvm.internal.o.f(bytes5, "getBytes(...)");
            byte[] sm4CbcEncrypt = com.tenpay.ndk.WxSmCryptoUtil.getInstance().sm4CbcEncrypt(bytes5, copyOf, h17, false);
            if (sm4CbcEncrypt != null) {
                if (!(sm4CbcEncrypt.length == 0)) {
                    return sm4CbcEncrypt;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerError", "faceEncryptSM4: sm4CbcEncrypt failed");
            return new byte[0];
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e18, "faceEncryptSM4 error", new java.lang.Object[0]);
            return new byte[0];
        }
    }
}
