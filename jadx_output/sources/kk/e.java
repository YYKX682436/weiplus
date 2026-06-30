package kk;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final javax.crypto.Cipher f308465a;

    public e(java.lang.String str) {
        try {
            javax.crypto.SecretKey generateSecret = javax.crypto.SecretKeyFactory.getInstance("DES").generateSecret(new javax.crypto.spec.DESKeySpec(str.getBytes("UTF8")));
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec("manifest".getBytes("UTF8"));
            javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding").init(1, generateSecret, ivParameterSpec);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding");
            this.f308465a = cipher;
            cipher.init(2, generateSecret, ivParameterSpec);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DESUtil", e17, "", new java.lang.Object[0]);
        }
    }

    public java.lang.String a(java.lang.String str) {
        try {
            return new java.lang.String(this.f308465a.doFinal(android.util.Base64.decode(str, 0)), "UTF8");
        } catch (java.lang.Exception e17) {
            return "[des]" + str + "|" + e17.toString();
        }
    }
}
